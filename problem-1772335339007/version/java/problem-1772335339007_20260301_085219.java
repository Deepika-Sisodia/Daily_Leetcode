// Last updated: 3/1/2026, 8:52:19 AM
1class Solution {
2    public String trimTrailingVowels(String s) {
3        int i = s.length()-1;
4        while(i>=0 && isVowel(s.charAt(i))){
5            i--;
6        }
7
8        return s.substring(0,i+1);
9    }
10
11    public boolean isVowel(char ch){
12        if(ch=='a' || ch=='i' || ch=='e' || ch=='o' || ch=='u'){
13            return true;
14        }
15        return false;
16    }
17}