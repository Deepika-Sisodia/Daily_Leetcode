// Last updated: 7/31/2025, 2:06:54 PM
class Solution {
    public String sortString(String s) {
        int[] freq = new int[26];
        for(int i=0; i<s.length(); i++){
            freq[s.charAt(i)-'a']++;
        }

        StringBuilder sb = new StringBuilder();

        while(s.length()>sb.length()){
            // inc
            for(int i=0; i<26; i++){
                if(freq[i]>0){
                    char ch = ((char)(i+'a'));
                    sb.append(ch);
                    freq[i]--;
                }
            }

            for(int i=25; i>=0; i--){
                if(freq[i]>0){
                    char ch = ((char)(i+'a'));
                    sb.append(ch);
                    freq[i]--;
                }
            }
        }

        return sb.toString();
        

    }
}