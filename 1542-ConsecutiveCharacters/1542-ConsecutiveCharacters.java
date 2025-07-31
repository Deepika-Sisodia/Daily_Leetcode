// Last updated: 7/31/2025, 2:06:46 PM
class Solution {
    public int maxPower(String s) {
        int count = 1;
        int max = 1;
        for(int i=1; i<s.length(); i++){
            if(s.charAt(i)==s.charAt(i-1)){
                count++;
            }
            else{
                max = Math.max(count,max);
                count = 1;
            }
        }
        max = Math.max(count,max);
        return max;
    }
}