// Last updated: 9/26/2025, 12:13:10 PM
class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i : nums){
            map.put(i, map.getOrDefault(i,0)+1);
        }

        for(int i : map.keySet()){
            if(map.get(i)>n/2){
                return i;
            }
        }
        return -1;

    }
}