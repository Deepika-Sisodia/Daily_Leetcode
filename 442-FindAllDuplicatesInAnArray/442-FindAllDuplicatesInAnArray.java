// Last updated: 7/31/2025, 2:08:37 PM
class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> ll = new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            int idx = Math.abs(nums[i])-1;
            if(nums[idx]<0){
                ll.add(Math.abs(nums[i]));
            }
            else{
                nums[idx]=-nums[idx];
            }
        }
        return ll;

    }
}