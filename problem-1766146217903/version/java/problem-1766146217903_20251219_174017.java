// Last updated: 12/19/2025, 5:40:17 PM
1class Solution {
2    public int findLHS(int[] nums) {
3        int n = nums.length;
4        HashMap<Integer,Integer> map = new HashMap<>();
5
6        for(int i=0; i<n; i++){
7            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
8        }
9
10        int ans = 0;
11
12        for(int key: map.keySet()){
13            if(map.containsKey(key+1)){
14                ans = Math.max(ans, map.get(key)+map.get(key+1));
15            }
16        }
17
18        return ans;
19    }
20}