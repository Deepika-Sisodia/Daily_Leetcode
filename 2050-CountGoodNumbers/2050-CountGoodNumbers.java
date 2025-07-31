// Last updated: 7/31/2025, 2:06:29 PM
class Solution {
    static final int mod = 1_000_000_007;

    public int countGoodNumbers(long n) {
        long evenCount = (n+1)/2;
        long oddCount = n/2;

        long evenWays = pow(5,evenCount,mod);
        long oddWays = pow(4,oddCount,mod);

        return (int) ((evenWays*oddWays)%mod);
    }

    public long pow(long base, long exp, long mod){
        if(exp==0){
            return 1;
        }

        long half = pow(base,exp/2,mod);
        long result = (half*half)%mod;

        if(exp%2==1){
            result = (result*base)%mod;
        }

        return result;
    }
}