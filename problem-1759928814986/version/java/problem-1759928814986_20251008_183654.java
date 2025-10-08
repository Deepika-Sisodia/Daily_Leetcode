// Last updated: 10/8/2025, 6:36:54 PM
class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int[] res = new int[spells.length];
        Arrays.sort(potions);
        for(int i=0; i<spells.length; i++){
            int ans = potions.length;
            int lo = 0;
            int hi = potions.length-1;
            while(lo<=hi){
                int mid = lo + (hi-lo)/2;
                if((long) spells[i]*potions[mid]>=success){
                    ans = mid;
                    hi = mid-1;
                }
                else{
                    lo = mid+1;
                }
            }
            res[i] = potions.length-ans;
        }

        return res;
    }
}