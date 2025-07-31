// Last updated: 7/31/2025, 2:06:51 PM
class Solution {
    public int findLucky(int[] arr) {
        int[] freq = new int[501];
        for(int i=0; i<arr.length; i++){
            freq[arr[i]]++;
        }
        for(int i=500; i>0; i--){
            if(freq[i]==i){
                return i;
            }
        }
        return -1;
    }
}