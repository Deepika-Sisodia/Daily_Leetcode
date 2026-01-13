// Last updated: 1/13/2026, 3:27:15 PM
1class Solution {
2    public int strStr(String haystack, String needle) {
3        for(int i=0, j=needle.length(); j<=haystack.length(); i++, j++){
4            if(haystack.substring(i,j).equals(needle)){
5                return i;
6            }
7        }
8
9        return -1;
10    }
11}