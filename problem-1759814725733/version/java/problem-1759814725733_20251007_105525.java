// Last updated: 10/7/2025, 10:55:25 AM
class Solution {
    public boolean predictTheWinner(int[] nums) {
        int diff = find(nums,0,nums.length-1);
        return diff>=0;
    }

    public int find(int[] arr, int i, int j){
        if(i==j){
            return arr[i];
        }

        int pickstart = arr[i] - find(arr,i+1,j);
        int pickend = arr[j] - find(arr,i,j-1);

        return Math.max(pickstart,pickend);
    }
}