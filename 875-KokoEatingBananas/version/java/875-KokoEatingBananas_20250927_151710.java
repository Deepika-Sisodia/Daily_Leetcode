// Last updated: 9/27/2025, 3:17:10 PM
class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        Arrays.sort(piles);
        int lo = 1;
        int hi = piles[piles.length-1];
        int ans = -1;
        while(lo<=hi){
            int mid = lo+(hi-lo)/2;
            if(canEat(piles, mid, h)){
                ans = mid;
                hi = mid-1;
            }
            else{
                lo = mid+1;
            }
        }
        return ans;
    }

    public boolean canEat(int[] arr, int mid, int h){
        int time = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]<=mid){
                time+=1;
            }
            else{
                time+= Math.ceil((double) arr[i]/(double) mid);
            }
        }

        if(time <= h){
            return true;
        }
        else{
            return false;
        }
    }
}