// Last updated: 7/31/2025, 2:06:27 PM
class Solution {
    public boolean areOccurrencesEqual(String s) {
        char freq[] = new char[26];
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            freq[ch-'a']++;
        }

        for(int i=1; i<s.length()-1; i++){
            char s1 = s.charAt(i-1);
            char s2 = s.charAt(i);
            if(freq[s1-'a']!=freq[s2-'a']){
                return false;
            }
        }
        return true;
    }
}