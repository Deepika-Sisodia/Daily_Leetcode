// Last updated: 1/22/2026, 10:31:35 PM
1class Solution {
2    public int maximizeWin(int[] prizePositions, int k) {
3        int n = prizePositions.length;
4        int[] best = new int[n];
5        int left = 0, ans = 0;
6
7        for(int i=0; i<n; i++){
8            while(prizePositions[i]-prizePositions[left]>k){
9                left++;
10            }
11            int curr = i - left + 1;
12
13            // combine with previous best
14            if (left > 0) {
15                ans = Math.max(ans, curr + best[left - 1]);
16            } else {
17                ans = Math.max(ans, curr);
18            }
19
20            best[i] = Math.max(i > 0 ? best[i - 1] : 0, curr);
21        }
22
23        return ans;
24    }
25}