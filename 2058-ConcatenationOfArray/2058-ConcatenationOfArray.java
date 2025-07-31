// Last updated: 7/31/2025, 2:06:26 PM
class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] arr = new int[2*nums.length];
        for(int i=0; i<nums.length; i++){
            arr[i]=nums[i];

        }
        for(int i=nums.length; i<arr.length; i++){
            arr[i]=nums[i-nums.length];
        }

        return arr;
        
    }
}