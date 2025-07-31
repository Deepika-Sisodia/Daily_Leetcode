// Last updated: 7/31/2025, 2:07:52 PM
class Solution {
    public boolean rotateString(String s, String goal) {
       if(s.length()!=goal.length()){
        return false;
       }
       String s1 = s+s;
       return s1.contains(goal);
    }
}