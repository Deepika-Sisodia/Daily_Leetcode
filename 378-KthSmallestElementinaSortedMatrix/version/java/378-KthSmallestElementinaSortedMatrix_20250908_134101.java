// Last updated: 9/8/2025, 1:41:01 PM
class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int n = matrix.length;
        int l = matrix[0][0], h = matrix[n-1][n-1];

        while(l<h){
            int mid = l + (h-l)/2;
            int count = countLess(matrix,mid);
            if(count<k){
                l = mid+1;
            }
            else{
                h = mid;
            }
        }
        return l;
    }

    public static int countLess(int[][] arr, int target){
        int n = arr.length;
        int row = n-1;
        int col = 0;
        int count = 0;

        while(row>=0 && col<n){
            if(arr[row][col]<=target){
                count+=row+1;
                col++;
            }
            else{
                row--;
            }
        }

        return count;
    }
}