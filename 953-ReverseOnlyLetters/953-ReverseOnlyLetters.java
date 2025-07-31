// Last updated: 7/31/2025, 2:07:31 PM
class Solution {
    public String reverseOnlyLetters(String s) {
        int n = s.length();
        int i=0, j=n-1;
        char ch[] = s.toCharArray();
        while(i<j){
            while(!Character.isLetter(ch[i])){
                i++;
                if(i>=n) break;
            }

            while(!Character.isLetter(ch[j])){
                j--;
                if(j<0) break;
            }

            if(i<j){
                char c = ch[i];
                ch[i]=ch[j];
                ch[j]=c;
                i++;
                j--;
            }
        }
        return new String(ch);
    }

}