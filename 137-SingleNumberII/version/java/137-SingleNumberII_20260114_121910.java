// Last updated: 1/14/2026, 12:19:10 PM
1class Solution {
2    public int singleNumber(int[] nums) {
3        HashMap<Integer, Integer> map = new HashMap<>();
4        for(int i=0; i<nums.length; i++){
5            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
6        }
7
8        for(int i: map.keySet()){
9            if(map.get(i)==1){
10                return i;
11            }
12        }
13        return 0;
14    }
15}