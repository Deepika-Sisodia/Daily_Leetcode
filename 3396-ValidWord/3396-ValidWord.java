// Last updated: 7/31/2025, 2:06:07 PM
class Solution {
    public boolean isValid(String word) {
        int n = word.length();
        if(n<3){
            return false;
        }
        word = word.toLowerCase();
        int vowels = 0;
        int cons = 0;
        for(int i=0; i<word.length(); i++){
            if(!Character.isLetterOrDigit(word.charAt(i))){
                return false;
            }
            if(Character.isLetter(word.charAt(i))){
                if(word.charAt(i)=='a' || word.charAt(i)=='e' || word.charAt(i)=='i' || word.charAt(i)=='o' || word.charAt(i)=='u'){
                    vowels++;
                }
                else{
                    cons++;
                }
            }
        }
        if(vowels>0 && cons>0){
            return true;
        }
        return false;
    }
}