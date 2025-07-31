// Last updated: 7/31/2025, 2:06:32 PM
class Solution {
    public String largestOddNumber(String num) {
        for(int i=num.length()-1; i>=0; i--){
            char ch = num.charAt(i);
            if((ch-'0')%2==1){
                return num.substring(0,i+1);
            }
        }
        return "";
    }
}