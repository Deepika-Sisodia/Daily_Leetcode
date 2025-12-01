// Last updated: 12/1/2025, 6:36:21 PM
1class Solution {
2    public int firstMissingPositive(int[] nums) {
3        int n = nums.length;
4        HashSet<Integer> set = new HashSet<>();
5        for(int i=0; i<n; i++){
6            if(nums[i]>0){
7                set.add(nums[i]);
8            }
9        }
10
11        for(int i=1; i<=n+1; i++){
12            if(!set.contains(i)){
13                return i;
14            }
15        }
16        return 0;
17    }
18}