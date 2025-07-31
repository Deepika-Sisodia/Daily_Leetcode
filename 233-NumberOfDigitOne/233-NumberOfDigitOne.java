// Last updated: 7/31/2025, 2:09:31 PM
class Solution {
    public int countDigitOne(int n) {
        int count = 0;
        int pos=1;
        while(pos<=n){
            int high = n/(pos*10);
            int current = (n/pos)%10;
            int low = n%pos;
            if(current==0){
                count+=high*pos;

            }
            else if (current==1){
                count+=high*pos+(low+1);
            }
            else{
                count+=(high+1)*pos;
            }
            pos*=10;
           
        }

        return count;
        
    }
}