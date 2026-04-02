// Last updated: 4/2/2026, 3:24:07 PM
1class Solution {
2    public int maxLength(List<String> arr) {
3        int n = arr.size();
4        return solve(arr,n,0,"");
5    }
6    public int solve(List<String> arr,int n, int idx, String temp){
7        if(idx>=n){
8            return temp.length();
9        }
10
11        int inc = 0;
12        int exc = 0;
13
14        if(hasDuplicate(arr.get(idx),temp)){
15            exc = solve(arr,n,idx+1,temp);
16        }
17        else{
18            exc = solve(arr,n,idx+1,temp);
19            inc = solve(arr,n,idx+1,temp + arr.get(idx));
20        }
21
22        return Math.max(inc,exc);
23    }
24
25    public boolean hasDuplicate(String s1, String s2){
26        int[] freq = new int[26];
27
28        for(int i=0; i<s1.length(); i++){
29            char ch = s1.charAt(i);
30            if(freq[ch-'a']>0){
31                return true;
32            }
33            freq[ch-'a']++;
34        }
35
36        for(int i=0; i<s2.length(); i++){
37            char ch = s2.charAt(i);
38            if(freq[ch-'a']>0){
39                return true;
40            }
41        }
42
43        return false;
44    }
45}