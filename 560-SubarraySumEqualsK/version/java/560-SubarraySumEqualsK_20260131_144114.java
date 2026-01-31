// Last updated: 1/31/2026, 2:41:14 PM
1class Solution {
2    public int subarraySum(int[] nums, int k) {
3        int n = nums.length;
4        int s = 0;
5        int c = 0;
6        HashMap<Integer,Integer> map = new HashMap<>();
7        map.put(0,1);
8
9        for(int i=0; i<n; i++){
10            s+=nums[i];
11            int diff = s-k;
12            if(map.containsKey(diff)){
13                c+=map.get(diff);
14            }
15
16            map.put(s,map.getOrDefault(s,0)+1);
17        }
18        return c;
19    }
20}