// Last updated: 11/8/2025, 7:23:31 PM
class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        Arrays.sort(piles);
        int lo = 1;
        int hi = piles[piles.length-1];
        int ans = -1;

        while(lo<=hi){
            int mid = lo+(hi-lo)/2;
            if(isPossible(piles,h,mid)){
                ans = mid;
                hi = mid-1;
            }
            else{
                lo = mid+1;
            }
        }

        return ans;
    }

    public boolean isPossible(int[] piles, int h, int k){
        int hours = 0;
        for(int i=0; i<piles.length; i++){
            if(piles[i]<=k){
                hours += 1;
            }
            else{
                hours += Math.ceil((double) piles[i]/(double) k);
            }
        }
        if(hours<=h){
            return true;
        }

        return false;
    }
}