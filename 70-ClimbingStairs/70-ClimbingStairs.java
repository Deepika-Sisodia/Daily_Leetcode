// Last updated: 7/31/2025, 2:11:28 PM
class Solution {
    public int climbStairs(int n) {
        int a = 1;
        int b = 2;
        for(int i=1; i<n; i++){
            int c = a+b;
            a=b;
            b=c;
        }
        return a;

        
    }
}