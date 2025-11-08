// Last updated: 11/8/2025, 7:49:41 PM
class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        Arrays.sort(nums);
        int lo = 1;
        int hi = nums[nums.length-1];
        int ans = -1;
        while(lo<=hi){
            int mid = lo+(hi-lo)/2;
            if(isPossible(nums,threshold,mid)){
                ans = mid;
                hi = mid-1;
            }
            else{
                lo = mid+1;
            }
        }

        return ans;
    }

    public boolean isPossible(int[] arr, int k, int div){
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]<=div){
                sum += 1;
            }
            else{
                sum += Math.ceil((double) arr[i]/ (double) div);
            }
        }

        if(sum<=k){
            return true;
        }
        return false;
    }
}