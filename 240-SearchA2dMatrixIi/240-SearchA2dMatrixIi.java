// Last updated: 7/31/2025, 2:09:25 PM
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        for(int row=0; row<m; row++){
            int lo=0; 
            int hi=n-1;
            while(lo<=hi){
                int mid = lo+(hi-lo)/2;
                if(matrix[row][mid]==target){
                    return true;
                }
                else if(matrix[row][mid]<target){
                    lo=mid+1;

                }
                else{
                    hi=hi-1;
                }
            }

        }
        return false;
        
    }
}