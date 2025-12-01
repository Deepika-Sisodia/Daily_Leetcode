// Last updated: 12/1/2025, 6:37:25 PM
1class Solution {
2    public int firstMissingPositive(int[] nums) {
3        int n = nums.length;
4        HashSet<Integer> set = new HashSet<>();
5
6        for(int i=0; i<n; i++){
7            if(nums[i]>0){
8                set.add(nums[i]);
9            }
10        }
11
12        for(int i=1; i<=n+1; i++){
13            if(!set.contains(i)){
14                return i;
15            }
16        }
17
18        return 0;
19    }
20}