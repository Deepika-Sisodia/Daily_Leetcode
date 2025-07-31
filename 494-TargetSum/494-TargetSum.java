// Last updated: 7/31/2025, 2:08:31 PM
class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        return target(nums,target,0,0);
    }
    static int count=0;
    public static int target(int[] arr, int target, int curr, int idx){
        if(idx==arr.length){
            if(target==curr){
                return 1;
            }
            return 0;
        }
        int add = target(arr,target,curr+arr[idx],idx+1);
        int sub = target(arr,target,curr-arr[idx],idx+1);
        return add+sub;
    }
}