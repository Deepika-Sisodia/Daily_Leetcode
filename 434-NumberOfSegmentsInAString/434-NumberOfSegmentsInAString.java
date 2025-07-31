// Last updated: 7/31/2025, 2:08:38 PM
class Solution {
    public int countSegments(String s) {
        s=s.trim();
        if(s.length()==0){
            return 0;
        }
        String[] arr = s.split("\s+");
        return arr.length;
    }
}