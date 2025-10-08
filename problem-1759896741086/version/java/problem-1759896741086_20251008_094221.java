// Last updated: 10/8/2025, 9:42:21 AM
class Solution {
    public long minimumTime(int[] time, int totalTrips) {
        long lo = 1;
        long hi = (long) getMax(time)*totalTrips;
        long ans = hi;
        while(lo<=hi){
            long mid = lo+(hi-lo)/2;
            if(canComplete(time,mid,totalTrips)){
                ans = mid;
                hi = mid-1;
            }
            else{
                lo = mid+1;
            }
        }
        return ans;
    }

    public boolean canComplete(int[] arr, long time,int totalTrips){
        long trips = 0;
        for(int i=0; i<arr.length; i++){
            trips += time/arr[i];
        }

        if(trips>=totalTrips){
            return true;
        }

        return false;
    }

    public int getMax(int[] arr) {
        int max = arr[0];
        for (int num : arr) max = Math.max(max, num);
        return max;
    }
}