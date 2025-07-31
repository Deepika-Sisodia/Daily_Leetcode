// Last updated: 7/31/2025, 2:07:47 PM
class Solution {
    public String toGoatLatin(String sentence) {
        StringBuilder result = new StringBuilder();
        String vowel = "aeiouAEIOU";
        String[] arr = sentence.split(" ");
        for(int i=0; i<arr.length; i++){
            String word = arr[i];
            StringBuilder sb = new StringBuilder();
            if(vowel.indexOf(word.charAt(0))!=-1){
                sb.append(word);
            }
            else{
                sb.append(word.substring(1));
                sb.append(word.charAt(0));
            }

            sb.append("ma");

            for(int j=0; j<=i; j++){
                sb.append("a");
            }

            result.append(sb);
            if(i!=arr.length-1){
                result.append(" ");
            }
        }
        return result.toString();
    }
}