// Last updated: 7/31/2025, 2:12:33 PM
class Solution {
    public int myAtoi(String s) {
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;

        s=s.trim();
        if(s.length()==0){
            return 0;
        }
        int i=0;
        int n = s.length();

        int sign = 1;
        if(s.charAt(i)=='-'){
            sign=-1;
            i++;
        }
        else if(s.charAt(i)=='+'){
            i++;
        }

        int num=0;
        while(i<n && Character.isDigit(s.charAt(i))){
            int digit = s.charAt(i)-'0';
            if(num>(max-digit)/10){
                return sign==1 ? max:min;
            }
            num=num*10+digit;
            i++;
        }
        return num*sign;
        
    }
}