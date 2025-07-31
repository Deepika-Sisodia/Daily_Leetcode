// Last updated: 7/31/2025, 2:08:35 PM
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ll = new ArrayList<>();
        int idx=0;
        for(int i=0; i<nums.length; i++){
            idx=Math.abs(nums[i])-1;
            if(nums[idx]>0){
                nums[idx]=-nums[idx];
            }
        }
        for(int i=0; i<nums.length; i++){
            if(nums[i]>0){
                ll.add(i+1);
            }
        }
        return ll;
        
        

    }
}