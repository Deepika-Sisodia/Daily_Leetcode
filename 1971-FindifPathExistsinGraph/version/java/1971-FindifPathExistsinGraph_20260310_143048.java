// Last updated: 3/10/2026, 2:30:48 PM
1class Solution {
2    public String longestPalindrome(String s) {
3        int maxLen = 0;
4        int start = 0;
5        int end = 0;
6        for(int i=0; i<s.length(); i++){
7            for(int j=i; j<s.length(); j++){
8                String str = s.substring(i,j+1);
9                if(palindrome(str)){
10                    if(maxLen<j-i+1){
11                        maxLen = j-i+1;
12                        start = i;
13                        end = j;
14                    }
15                }
16            }
17        }
18
19        return s.substring(start,end+1);
20    }
21
22    public boolean palindrome(String s){
23        int i=0, j=s.length()-1;
24        while(i<j){
25            if(s.charAt(i)!=s.charAt(j)){
26                return false;
27            }
28            i++;
29            j--;
30        }
31
32        return true;
33        
34    }
35}