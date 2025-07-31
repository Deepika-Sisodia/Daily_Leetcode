// Last updated: 7/31/2025, 2:08:01 PM
class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int [] left = new int[n];
        int [] right = new int[n];

        left[0]=0;
        int lsum=0;
        for(int i=1; i<n; i++){
            lsum+=nums[i-1];
            left[i]=lsum;
        }

        right[n-1]=0;
        int rsum=0;
        for(int i=n-2; i>=0; i--){
            rsum+=nums[i+1];
            right[i]=rsum;
        }

        for(int i=0; i<n; i++){
            if(left[i]==right[i]){
                return i;
            }
        }
        return -1;

        
    }
}