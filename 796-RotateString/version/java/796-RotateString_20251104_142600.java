// Last updated: 11/4/2025, 2:26:00 PM
class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length()){
            return false;
        }

        for(int i=0; i<s.length(); i++){
            String s1 = s.substring(0,i+1);
            String s2 = s.substring(i+1);
            String str = s2+s1;
            if(str.equals(goal)){
                return true;
            }
        }

        return false;
    }
}