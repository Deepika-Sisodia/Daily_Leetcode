// Last updated: 7/31/2025, 2:12:36 PM
class Solution {
    public String longestPalindrome(String s) {
        if(s==null || s.length()<1) return "";
        int start = 0, end = 0;
        for(int i=0; i<s.length(); i++){
            int len1 = find(s,i,i);
            int len2 = find(s,i,i+1);
            int maxLen = Math.max(len1,len2);

            if(maxLen > end-start){
                start = i-(maxLen-1)/2;
                end = i + maxLen/2;
            }
        }
        return s.substring(start,end+1);

    }

    public static int find(String s, int left, int right){
        while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)){
            left--;
            right++;
        }
        return right-left-1;
    }
}