// Last updated: 10/10/2025, 3:18:55 PM
class Solution {
    public boolean isSubsequence(String s, String t) {
        int i = 0;
        int j = 0;
        int c = 0;
        while(i<s.length() && j<t.length()){
            if(s.charAt(i)==t.charAt(j)){
                c++;
                i++;
            }
            j++;
        }

        if(c==s.length()){
            return true;
        }

        return false;
    }
}