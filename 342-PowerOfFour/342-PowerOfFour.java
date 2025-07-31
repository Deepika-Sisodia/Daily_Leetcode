// Last updated: 7/31/2025, 2:09:06 PM
class Solution {
    public boolean isPowerOfFour(int n) {
        if(n==1){
            return true;
        }
        int lo=1;
        int hi=n;
        while(lo<=hi){
            int mid = lo+(hi-lo)/2;
            if(Math.pow(4,mid)==n){
                return true;
            }
            else if(Math.pow(4,mid)>n){
                hi=mid-1;
            }
            else{
                lo=mid+1;
            }
        }
        return false;
        
    }
}