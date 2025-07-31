// Last updated: 7/31/2025, 2:07:07 PM
class Solution {
    public String makeFancyString(String s) {
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            int len = sb.length();

            if(len<=1 || !(sb.charAt(len-1)==c && sb.charAt(len-2)==c)){
                sb.append(c);
            }   
        }

        return sb.toString();
    }
}