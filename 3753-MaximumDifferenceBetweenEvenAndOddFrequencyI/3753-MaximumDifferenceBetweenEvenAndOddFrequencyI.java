// Last updated: 7/31/2025, 2:05:55 PM
class Solution {
    public int maxDifference(String s) {
        char[] arr = new char[26];
        for(char ch : s.toCharArray()){
            arr[ch-'a']++;
        }
        int max_diff=Integer.MIN_VALUE;
        for(int i=0; i<26; i++){
            for(int j=0; j<26; j++){
                if(arr[i]>0 && arr[j]>0){
                    int one = arr[i];
                    int other = arr[j];
                    if(one%2==0 && other%2==1){
                        max_diff = Math.max(max_diff, other-one);
                    }
                    else if(one%2==1 && other%2==0){
                        max_diff = Math.max(max_diff,one-other);
                    }
                }
            }
        }
        return max_diff==Integer.MIN_VALUE ? 0 : max_diff;
        
    }
}