// Last updated: 10/13/2025, 9:11:53 PM
class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        int n = capacity.length;
        int[] needed = new int[n];
        for (int i = 0; i < n; i++) {
            needed[i] = capacity[i] - rocks[i];
        }
        
        Arrays.sort(needed);

        int c = 0;
        for(int i=0; i<n; i++){
            if(needed[i]<=additionalRocks){
                additionalRocks -= needed[i];
                c++;
            }
            else{
                break;
            }
        }

        return c;
    }
}