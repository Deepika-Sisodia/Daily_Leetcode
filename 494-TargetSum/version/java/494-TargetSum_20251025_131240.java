// Last updated: 10/25/2025, 1:12:40 PM
class Solution {
    int c = 0;
    public int findTargetSumWays(int[] nums, int target) {
        targetSum(nums,target,0,0);
        return c;
    }

    public void targetSum(int[] arr, int target, int curr, int idx){
        if(idx==arr.length){
            if(curr==target){
                c++;
            }
            return;
        }

        targetSum(arr,target,curr+arr[idx],idx+1);
        targetSum(arr,target,curr-arr[idx],idx+1);
    }
}