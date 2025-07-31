// Last updated: 7/31/2025, 2:12:18 PM
class Solution {
    public int removeDuplicates(int[] nums) {
        return remove_duplicates(nums);
        
    }

    public static int remove_duplicates(int[] nums){
        if(nums.length<=1){
            return nums.length;
        }
        int k=1;
        for(int i=0; i<nums.length; i++){
            if(nums[k-1]!=nums[i]){
                nums[k]=nums[i];
                k++;
            }
        }
        return k;
    }
}