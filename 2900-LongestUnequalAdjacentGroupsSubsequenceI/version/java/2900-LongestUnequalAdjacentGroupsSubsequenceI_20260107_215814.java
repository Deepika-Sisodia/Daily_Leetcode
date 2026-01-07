// Last updated: 1/7/2026, 9:58:14 PM
1class Solution {
2    public List<String> getLongestSubsequence(String[] words, int[] groups) {
3        List<String> res = new ArrayList<>();
4        int prev = -1;
5        int n = words.length;
6
7        for(int i=0; i<n; i++){
8            if(prev==-1 || groups[i]!=prev){
9                res.add(words[i]);
10                prev = groups[i];
11            }
12        }
13
14        return res;
15    }
16}