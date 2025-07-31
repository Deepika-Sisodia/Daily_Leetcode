// Last updated: 7/31/2025, 2:08:52 PM
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] arr = new int[26];
        for(int i=0; i<magazine.length(); i++){
            arr[magazine.charAt(i)-'a']++;
        }
        for(int i=0; i<ransomNote.length(); i++){
            if(arr[ransomNote.charAt(i)-'a']==0){
                return false;
            }
            arr[ransomNote.charAt(i)-'a']--;
        }
        return true;
    }
}