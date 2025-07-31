// Last updated: 7/31/2025, 2:08:15 PM
class Solution {
    public String reverseWords(String s) {
        String[] arr = s.split(" ");
        StringBuilder result = new StringBuilder();
        for(String i:arr){
            result.append(new StringBuilder(i).reverse().toString()).append(" ");
        }
        return result.toString().trim();
    }
}