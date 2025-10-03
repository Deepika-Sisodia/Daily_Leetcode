// Last updated: 10/3/2025, 10:40:49 AM
class Solution {
    public void reverseString(char[] s) {
        int i=0;
        int j=s.length-1;
        while(i<j){
            char temp = s[i];
            s[i]=s[j];
            s[j]=temp;
            i++;
            j--;
        }
    }
}