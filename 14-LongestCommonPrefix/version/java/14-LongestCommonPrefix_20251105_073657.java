// Last updated: 11/5/2025, 7:36:57 AM
class Solution {
    public String longestCommonPrefix(String[] strs) {
        int len = Integer.MAX_VALUE;
        for(int i=0; i<strs.length; i++){
            len = Math.min(len,strs[i].length());
        }


        String common = "";
        for(int i=0; i<len; i++){
            char ch = strs[0].charAt(i);

            for(int j=1; j<strs.length; j++){
                if(ch!=strs[j].charAt(i)){
                    return common;
                }
            }
            common+=ch;
        }

        return common;
    }
}