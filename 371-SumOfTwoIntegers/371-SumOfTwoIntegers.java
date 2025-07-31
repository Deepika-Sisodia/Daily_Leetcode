// Last updated: 7/31/2025, 2:08:57 PM
class Solution {
    public int getSum(int a, int b) {
        while(b!=0){
            int sum = a^b;
            b=(a&b)<<1;
            a=sum;
        }
        return a;
        
    }
}