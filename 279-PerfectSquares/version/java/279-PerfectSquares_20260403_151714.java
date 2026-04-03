// Last updated: 4/3/2026, 3:17:14 PM
1class Solution {
2    Integer[] dp;
3    public int jobScheduling(int[] startTime, int[] endTime, int[] profit) {
4        int n = profit.length;
5        int[][] arr = new int[n][3];
6        dp = new Integer[n];
7        for(int i=0; i<n; i++){
8            arr[i][0] = startTime[i];
9            arr[i][1] = endTime[i];
10            arr[i][2] = profit[i];
11        }
12
13        Arrays.sort(arr, (a,b)->a[0]-b[0]);
14
15        return solve(arr,0,n);
16    }
17
18    public int solve(int[][] arr, int idx, int n){
19        if(idx>=n){
20            return 0;
21        }
22        if(dp[idx] != null) return dp[idx];
23
24        int next = getNext(arr,idx+1,arr[idx][1],n);
25        int taken = arr[idx][2] + solve(arr,next,n);
26        int not_taken = solve(arr,idx+1,n);
27
28        return dp[idx] = Math.max(taken, not_taken);
29    }
30    public int getNext(int[][] arr, int l, int target, int n){
31        int r = n-1;
32        int ans = n+1;
33        while(l<=r){
34            int mid = l + (r-l)/2;
35            if(arr[mid][0]>=target){
36                ans = mid;
37                r = mid-1;
38            }
39            else{
40                l = mid+1;
41            }
42        }
43
44        return ans;
45    }
46}