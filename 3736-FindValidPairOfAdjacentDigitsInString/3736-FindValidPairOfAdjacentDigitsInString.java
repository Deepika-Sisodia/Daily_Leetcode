// Last updated: 7/31/2025, 2:05:57 PM
class Solution {
    public String findValidPair(String s) {
        int[] count = new int[10];
        for(char c: s.toCharArray()){
            count[c-'0']++;
        }
        for(int i=0; i<s.length()-1; i++){
            char first = s.charAt(i);
            char second = s.charAt(i+1);
            if(first != second && count[first-'0']==(first-'0') && count[second-'0']==(second-'0')){
                return ""+first+second;
            } 
        }
        return "";
        
    }
}