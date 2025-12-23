// Last updated: 12/23/2025, 1:15:20 PM
1class Solution {
2    public String arrangeWords(String text) {
3        String[] s = text.toLowerCase().split(" ");
4        Arrays.sort(s,(a,b)-> a.length()-b.length());
5        String ans = String.join(" ",s);
6        return Character.toUpperCase(ans.charAt(0)) + ans.substring(1);
7    }
8}