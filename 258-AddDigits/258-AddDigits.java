// Last updated: 7/31/2025, 2:09:22 PM
class Solution {
    public int addDigits(int num) {
        while(num>=10){
            int sum=0;
            while(num>0){
                sum+=num%10;
                num/=10;
            }
            num=sum;

        }
        return num;
        
    }
}