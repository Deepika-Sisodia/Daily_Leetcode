// Last updated: 7/31/2025, 2:08:25 PM
class Solution {
    public boolean checkPerfectNumber(int num) {
        int temp=num;
        if(num<=1){
            return false;
        }
        int sum=1;
		for(int i=2; i*i<=num; i++) {
			if(num%i==0) {
				sum+=i;
                if(i!=num/i){
                    sum+=num/i;
                }
				
			}
		}
        if(sum==temp){
            return true;
        }
        return false;
    }
}