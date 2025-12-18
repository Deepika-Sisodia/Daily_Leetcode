// Last updated: 12/18/2025, 5:43:55 PM
1class Solution {
2    public int partitionDisjoint(int[] nums) {
3        int n = nums.length;
4        int[] minSuff = new int[n];
5        minSuff[n-1] = nums[n-1];
6        for(int i=n-2; i>=0; i--){
7            minSuff[i] = Math.min(minSuff[i+1],nums[i]);
8        }
9
10        int maxLeft = Integer.MIN_VALUE;
11        for(int i=0; i<n; i++){
12            maxLeft = Math.max(maxLeft,nums[i]);
13
14            if(maxLeft<=minSuff[i+1]){
15                return i+1;
16            }
17        }
18
19        return 0;
20    }
21}