// Last updated: 11/8/2025, 6:40:15 PM
class Solution {
    public int beautySum(String s) {
        int sum = 0;
        for(int i=0; i<s.length(); i++){
            int[] freq = new int[26];
            for(int j=i; j<s.length(); j++){
                char ch = s.charAt(j);
                freq[ch-'a']++;

                int maxFreq = 0;
                int minFreq = Integer.MAX_VALUE;

                for(int k=0; k<26; k++){
                    if(freq[k]>0){
                        minFreq = Math.min(minFreq,freq[k]);
                        maxFreq = Math.max(maxFreq,freq[k]);
                    }
                }

                sum = sum + (maxFreq-minFreq);
            }
        }

        return sum;
    }
}