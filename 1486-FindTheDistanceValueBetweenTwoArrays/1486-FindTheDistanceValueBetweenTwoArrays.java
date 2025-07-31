// Last updated: 7/31/2025, 2:06:52 PM
class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int c=0;
        for(int i=0; i<arr1.length; i++){
            boolean within = false;
            for(int j=0; j<arr2.length; j++){
                if(Math.abs(arr1[i]-arr2[j])<=d){
                    within = true;
                    break;
                }
            }
            if(!within){
                c++;
            }
        }
        return c;
        
    }
}