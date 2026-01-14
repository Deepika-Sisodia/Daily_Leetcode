// Last updated: 1/14/2026, 12:14:25 PM
1class Solution {
2    public int[] singleNumber(int[] nums) {
3        HashMap<Integer, Integer> map = new HashMap<>();
4        List<Integer> ll = new ArrayList<>();
5        for(int i=0; i<nums.length; i++){
6            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
7        }
8
9        for(int i: map.keySet()){
10            if(map.get(i)==1){
11                ll.add(i);
12            }
13        }
14
15        int[] ans = new int[ll.size()];
16        for(int i=0; i<ll.size(); i++){
17            ans[i] = ll.get(i);
18        }
19
20        return ans;
21    }
22}