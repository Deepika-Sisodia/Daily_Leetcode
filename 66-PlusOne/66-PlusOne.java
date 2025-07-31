// Last updated: 7/31/2025, 2:11:31 PM
class Solution {
    public int[] plusOne(int[] digits) {
        for(int i=digits.length-1; i>=0; i--){
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }
            digits[i]=0;
        }
        int[] result = new int[digits.length+1];
        result[0]=1;
        return result;
        
    }
}