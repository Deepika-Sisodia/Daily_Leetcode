// Last updated: 7/31/2025, 2:07:17 PM
class Solution {
    public int heightChecker(int[] heights) {
        int[] arr = new int[heights.length];
        for(int i=0; i<heights.length; i++){
            arr[i]=heights[i];
        }
        Arrays.sort(arr);
        int count=0;
        for(int i=0; i<arr.length; i++){
            if(heights[i]!=arr[i]){
                count++;
            }

        }
        return count;
        
    }
}