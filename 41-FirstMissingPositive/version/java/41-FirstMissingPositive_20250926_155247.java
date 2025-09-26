// Last updated: 9/26/2025, 3:52:47 PM
class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        for(int i=0; i<n; i++){
            while(nums[i]>0 && nums[i]<=n && nums[i] != nums[nums[i]-1]){
                swap(nums,i,nums[i]-1);
            }
        }

        for(int i=0; i<n; i++){
            if(!(nums[i]==i+1)){
                return i+1;
            }
        }

        return n+1;
    }

    public void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}