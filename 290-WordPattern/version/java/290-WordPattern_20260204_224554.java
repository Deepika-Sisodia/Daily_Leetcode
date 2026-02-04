// Last updated: 2/4/2026, 10:45:54 PM
1class Solution {
2    public boolean wordPattern(String pattern, String s) {
3        String[] arr = s.split(" ");
4        if(arr.length!=pattern.length()) return false;
5
6        HashMap<Character, String> map1 = new HashMap<>();
7        HashMap<String, Character> map2 = new HashMap<>();
8
9        for(int i=0; i<pattern.length(); i++){
10            char ch = pattern.charAt(i);
11            String st = arr[i];
12
13            if(map1.containsKey(ch)){
14                if(!map1.get(ch).equals(st)){
15                    return false;
16                }
17            }
18            else{
19                map1.put(ch,st);
20            }
21
22            if(map2.containsKey(st)){
23                if(map2.get(st)!=ch){
24                    return false;
25                }
26            }
27            else{
28                map2.put(st,ch);
29            }
30        }
31
32        return true;
33    }
34}