// Last updated: 7/31/2025, 2:06:38 PM
class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        int max = -1;
        int[] first = new int[26];
        Arrays.fill(first,-1);
        for(int i=0; i<s.length(); i++){
            int idx = s.charAt(i)-'a';
            if(first[idx]==-1){
                first[idx]=i;
            }
            else{
                int len = i-first[idx]-1;
                max = Math.max(len,max);
            }
        }
        return max;
    }
}