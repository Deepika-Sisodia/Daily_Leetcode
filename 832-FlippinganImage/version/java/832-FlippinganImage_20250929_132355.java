// Last updated: 9/29/2025, 1:23:55 PM
class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for(int i=0; i<image.length; i++){
            int[] arr = image[i];
            int j=0, k=arr.length-1;
            while(j<k){
                int temp = arr[j];
                arr[j] = arr[k];
                arr[k] = temp;
                j++;
                k--;

            }
            int n = 0;
            while(n<arr.length){
                if(arr[n]==0){
                    arr[n]=1;
                }
                else{
                    arr[n]=0;
                }
                n++;
            }
        }
        return image;
    }
}