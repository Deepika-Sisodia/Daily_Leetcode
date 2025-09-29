// Last updated: 9/29/2025, 1:37:44 PM
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int i=0; i<matrix.length; i++){
            int[] arr = matrix[i];
            int lo=0, hi=arr.length-1;
            while(lo<=hi){
                int mid = lo+(hi-lo)/2;
                if(arr[mid]==target){
                    return true;
                }
                else if(arr[mid]>target){
                    hi = mid-1;
                }
                else{
                    lo= mid+1;
                }
            }
        }
        return false;
    }
}