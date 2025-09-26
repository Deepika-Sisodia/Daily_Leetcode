// Last updated: 9/26/2025, 1:47:45 PM
class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int lo = 0, mid = 0, hi = n-1;

        while(mid<=hi){
            if(nums[mid] == 0){
                swap(nums,lo,mid);
                lo++;
                mid++;
            }

            else if(nums[mid]==1){
                mid++;
            }
            else{
                swap(nums,mid,hi);
                hi--;
            }
        }

    }

    public void swap(int[] arr,int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}