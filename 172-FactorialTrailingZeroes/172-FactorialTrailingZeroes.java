// Last updated: 7/31/2025, 2:10:07 PM
class Solution {
    public int trailingZeroes(int n) {
        if(n<0 || n==0){
            return 0;
        }
        int c = 0;
        while(n>=5){
            c = c + n/5;
            n/=5;
        }
        return c;
    }
}