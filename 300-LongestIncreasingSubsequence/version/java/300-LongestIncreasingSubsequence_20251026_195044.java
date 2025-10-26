// Last updated: 10/26/2025, 7:50:44 PM
class Solution {
    public int lengthOfLIS(int[] nums) {
        int len = 1;
        int[] lis = new int[nums.length];
        lis[0] = nums[0];
        for(int i=1; i<nums.length; i++){
            if(nums[i]>lis[len-1]){
                lis[len] = nums[i];
                len++;
            }
            else{
                int idx = BinarySearch(lis,0,len-1,nums[i]);
                lis[idx] = nums[i];
            }
        }
        return len;
    }

    public int BinarySearch(int[] arr, int lo, int hi,int target){
        int ans = 0;
        while(lo<=hi){
            int mid = (lo+hi)/2;
            if(arr[mid]>=target){
                ans = mid;
                hi = mid - 1;
            }
            else{
                lo = mid+1;
            }
        }
        return ans;
    }
}