// Last updated: 7/31/2025, 2:06:24 PM
class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        List<Integer> ll = new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            if(nums[i]==target){
                ll.add(i);
            }
        }
        return ll;
    }
}