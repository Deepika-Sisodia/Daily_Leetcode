// Last updated: 2/13/2026, 2:48:41 PM
1class Solution {
2    public int minBitFlips(int start, int goal) {
3        int n = (start ^ goal);
4
5        int cnt = 0;
6        while(n!=0){
7            cnt++;
8            n = (n & n-1);
9        }
10
11        return cnt;
12    }
13}