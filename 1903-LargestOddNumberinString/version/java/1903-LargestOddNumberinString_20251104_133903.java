// Last updated: 11/4/2025, 1:39:03 PM
class Solution {
    public String largestOddNumber(String num) {
        if(num.charAt(num.length()-1) % 2 == 1){
            return num;
        }
        for(int i=num.length()-2; i>=0; i--){
            if(num.charAt(i)%2==1){
                return num.substring(0,i+1);
            }
        }
        return "";
    }
}