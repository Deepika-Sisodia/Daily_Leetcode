// Last updated: 2/4/2026, 12:01:43 PM
1class Solution {
2    public int numSubarraysWithSum(int[] nums, int goal) {
3        int n = nums.length;
4        int sum = 0;
5        int count = 0;
6        HashMap<Integer, Integer> map = new HashMap<>();
7        map.put(0,1);
8
9        for(int i=0; i<n; i++){
10            sum += nums[i];
11            if(map.containsKey(sum-goal)){
12                count+=map.get(sum-goal);
13            }
14            map.put(sum, map.getOrDefault(sum,0)+1);
15        }
16
17        return count;
18    }
19}