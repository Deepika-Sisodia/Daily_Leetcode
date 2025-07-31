// Last updated: 7/31/2025, 2:08:48 PM
class Solution {
    public int lastRemaining(int n) {
        return eliminate(n,true);
    }

    private int eliminate(int n, boolean left){
        if(n==1){
            return 1;
        }

        if(left){
            return 2*eliminate(n/2,false);
        }
        else{
            return 2*eliminate(n/2,true) -1 + (n%2);
        }
    }
}