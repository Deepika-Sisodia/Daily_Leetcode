// Last updated: 1/2/2026, 11:41:10 AM
1class Solution {
2    public int minPatches(int[] nums, int n) {
3        int patches = 0;
4        long maxReach = 0;
5        int i = 0;
6        while(maxReach<n){
7            if(i<nums.length && nums[i]<=maxReach+1){
8                maxReach+=nums[i];
9                i++;
10            }
11            else{
12                maxReach+=(maxReach+1);
13                patches++;
14            }
15        }
16
17        return patches;
18    }
19}