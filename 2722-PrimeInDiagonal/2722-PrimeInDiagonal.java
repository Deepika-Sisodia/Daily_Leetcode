// Last updated: 7/31/2025, 2:06:12 PM
class Solution {
    public int diagonalPrime(int[][] nums) {
        int prime_max = 0;
        for(int i=0; i<nums.length; i++){
            if(prime(nums[i][i])){
                prime_max=Math.max(prime_max,nums[i][i]);
            }
            if(prime(nums[nums.length-i-1][i])){
                prime_max=Math.max(prime_max,nums[nums.length-i-1][i]);

            }
        }
        return prime_max;
    }
    public static boolean prime(int n){
        if(n<2){
            return false;
        }
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
        
    
}