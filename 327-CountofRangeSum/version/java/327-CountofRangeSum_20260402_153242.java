// Last updated: 4/2/2026, 3:32:42 PM
1class Solution {
2    Map<String, Integer> map;
3    public int maxLength(List<String> arr) {
4        int n = arr.size();
5
6        map = new HashMap<>();
7        map.clear();
8
9        return solve(arr,n,0,"");
10    }
11    public int solve(List<String> arr,int n, int idx, String temp){
12        if(idx>=n){
13            return temp.length();
14        }
15
16        int inc = 0;
17        int exc = 0;
18
19        if(map.containsKey(temp)){
20            return map.get(temp);
21        }
22
23        if(hasDuplicate(arr.get(idx),temp)){
24            exc = solve(arr,n,idx+1,temp);
25        }
26        else{
27            exc = solve(arr,n,idx+1,temp);
28            inc = solve(arr,n,idx+1,temp + arr.get(idx));
29        }
30
31        int ans = Math.max(inc,exc);
32        map.put(temp, ans);
33        return ans;
34    }
35
36    public boolean hasDuplicate(String s1, String s2){
37        int[] freq = new int[26];
38
39        for(int i=0; i<s1.length(); i++){
40            char ch = s1.charAt(i);
41            if(freq[ch-'a']>0){
42                return true;
43            }
44            freq[ch-'a']++;
45        }
46
47        for(int i=0; i<s2.length(); i++){
48            char ch = s2.charAt(i);
49            if(freq[ch-'a']>0){
50                return true;
51            }
52        }
53
54        return false;
55    }
56}