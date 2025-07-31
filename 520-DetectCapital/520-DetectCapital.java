// Last updated: 7/31/2025, 2:08:23 PM
class Solution {
    public boolean detectCapitalUse(String word) {
        if(word.length()==1){
            return true;
        }
        boolean allcaps = Character.isUpperCase(word.charAt(1));
        boolean firstcap = Character.isUpperCase(word.charAt(0));
        if(!firstcap && allcaps){
            return false;
        }

        for(int i=2; i<word.length(); i++){
            if(Character.isUpperCase(word.charAt(i))!=allcaps){
                return false;
            }
        }
        return true;
       
    }
}