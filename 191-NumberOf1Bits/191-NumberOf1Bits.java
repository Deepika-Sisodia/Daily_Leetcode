// Last updated: 7/31/2025, 2:09:59 PM
class Solution {
    public int hammingWeight(int n) {
        int sum=0;
        int c = 0;
		while(n>0) {
			if(n%2==1){
                c++;
            }
            n/=2;
		}
        return c;
        
    }
}