// Last updated: 1/31/2026, 1:43:25 PM
1class Solution {
2    public int subarraySum(int[] nums, int k) {
3        int n = nums.length;
4        int c = 0;
5        for(int i=0; i<n; i++){
6            int sum = 0;
7            for(int j=i; j<n; j++){
8                sum+=nums[j];
9                if(sum==k){
10                    c++;
11                }
12            }
13        }
14        return c;
15    }
16}