// Last updated: 7/31/2025, 2:11:34 PM
class Solution {
    public int lengthOfLastWord(String s) {
        s=s.trim();
        String[] arr = s.split("\s+");
        return arr[arr.length-1].length();
        
    }
}