// Last updated: 4/10/2026, 12:03:37 PM
1class Solution {
2    HashMap<String, Boolean> map;
3    public boolean isScramble(String s1, String s2) {
4        map = new HashMap<>();
5        if(s1.length() != s2.length()){
6            return false;
7        }
8
9        return solve(s1,s2);
10    }
11
12    public boolean solve(String s1, String s2){
13        if(s1.equals(s2)){
14            return true;
15        }
16
17        if(s1.length() != s2.length()) return false;
18
19        String key = s1 + "#" + s2;
20        if(map.containsKey(key)) return map.get(key);
21
22        int n = s1.length();
23        int[] freq = new int[26];
24
25        for(int i=0; i<n; i++){
26            freq[s1.charAt(i)-'a']++;
27            freq[s2.charAt(i)-'a']--;
28        }
29
30        for(int f : freq){
31            if(f != 0){
32                map.put(key,false);
33                return false;
34            }
35        }
36
37        for(int i=1; i<n; i++){
38            boolean swap = solve(s1.substring(0,i), s2.substring(n-i)) &&
39                            solve(s1.substring(i), s2.substring(0,n-i));
40
41            boolean no_swap = solve(s1.substring(0,i), s2.substring(0,i)) && 
42                            solve(s1.substring(i), s2.substring(i));
43
44            if(swap || no_swap){
45                map.put(key,true);
46                return true;
47            }
48        }
49
50        map.put(key,false);
51        return false;
52    }
53}