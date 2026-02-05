// Last updated: 2/5/2026, 3:57:27 PM
1class Solution {
2    public String longestCommonPrefix(String[] strs) {
3        int n = strs.length;
4        Arrays.sort(strs);
5
6        String st = "";
7        for(int i=0; i<strs[0].length(); i++){
8            if(strs[0].charAt(i)!=strs[n-1].charAt(i)){
9                return st;
10            }
11
12            st += strs[0].charAt(i);
13        }
14        return st;
15    }
16}