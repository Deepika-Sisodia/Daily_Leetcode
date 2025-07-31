// Last updated: 7/31/2025, 2:11:59 PM
class Solution {
    public int searchInsert(int[] nums, int target) {
        int hi=nums.length-1;
        int lo=0;
        while(lo<=hi){
            int mid=(lo+hi)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if (nums[mid]<target){
                lo=mid+1;
            }
            else{
                hi=mid-1;
            }

        }
        return lo;
        
    }
}