// Last updated: 7/31/2025, 2:09:17 PM
class Solution {
    public int hIndex(int[] citations) {
        int n = citations.length;
        Arrays.sort(citations);
        for(int i=0; i<n; i++){
            int h = n-i;
            if(citations[i]>=h){
                return h;
            }
        }

        return 0;
    }
}