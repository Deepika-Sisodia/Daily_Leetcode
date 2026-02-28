// Last updated: 2/28/2026, 1:39:31 PM
1class Solution {
2    public String largestEven(String s) {
3        for(int i=s.length()-1; i>=0; i--){
4            int val = s.charAt(i)-'0';
5            if(val%2==0){
6                return s.substring(0,i+1);
7            }
8        }
9
10        return "";
11    }
12}