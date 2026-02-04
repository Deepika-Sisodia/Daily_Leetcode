// Last updated: 2/4/2026, 11:31:31 AM
1class Solution {
2    public int numSubarraysWithSum(int[] nums, int goal) {
3        int n = nums.length;
4        int c = 0;
5        for(int i=0; i<n; i++){
6            int sum = 0;
7            for(int j=i; j<n; j++){
8                sum+=nums[j];
9                if(sum==goal){
10                    c++;
11                }
12            }
13        }
14
15        return c;
16    }
17}