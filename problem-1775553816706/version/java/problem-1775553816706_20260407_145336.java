// Last updated: 4/7/2026, 2:53:36 PM
1class Solution {
2    public int firstMatchingIndex(String s) {
3        int n = s.length();
4        int i = 0, j = n-1;
5        while(i<=j){
6            char c1 = s.charAt(i);
7            char c2 = s.charAt(j);
8            if(c1 == c2){
9                return i;
10            }
11            i++;
12            j--;
13        }
14
15        return -1;
16    }
17}