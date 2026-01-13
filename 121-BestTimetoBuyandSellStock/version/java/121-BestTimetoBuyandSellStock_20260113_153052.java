// Last updated: 1/13/2026, 3:30:52 PM
1class Solution {
2    public int strStr(String haystack, String needle) {
3        if(needle.length() == 0) return 0;
4
5        for(int i=0; i<=haystack.length()-needle.length(); i++){
6            int j;
7            for(j=0; j<needle.length(); j++){
8                if(haystack.charAt(i+j) != needle.charAt(j)){
9                    break;
10                }
11            }
12            if(j == needle.length()){
13                return i;
14            }
15        }
16        return -1;
17    }
18}