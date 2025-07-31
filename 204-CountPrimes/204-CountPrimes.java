// Last updated: 7/31/2025, 2:09:50 PM
class Solution {
    public int countPrimes(int n) {
        if(n<=1){
            return 0;
        }
        return Prime_Sieve(n);
    }
    public static int Prime_Sieve(int n) {
		int[] ans = new int[n];
		ans[0]=ans[1]=1;
		for(int i=2; i*i<=ans.length; i++) {
			if(ans[i]==0) { // i prime no.
				for(int j=2; i*j<ans.length; j++) {
					ans[i*j]=1;
				}
			}
		}
		int c=0;
		for(int i=0; i<n; i++) {
			if(ans[i]==0) {
				c++;
			}
		}
		return c;
		
	}

        
}