// Last updated: 3/10/2026, 3:17:48 PM
1class Solution {
2    public int myAtoi(String s) {
3        s = s.trim();
4
5        if(s.length()==0) return 0;
6
7        int sign = 1;
8        int i = 0;
9        if(s.charAt(0)=='-' || s.charAt(0)=='+'){
10            if(s.charAt(0)=='-') sign = -1;
11            i++;
12        }
13
14        int val = 0;
15
16        while(i<s.length() && isDigit(s.charAt(i))){
17            int digit = s.charAt(i)-'0';
18            if(val > (Integer.MAX_VALUE-digit)/10){
19                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
20            }
21            val = 10*val + digit;
22            i++;
23        }
24
25        return sign*val;
26    }
27
28    public boolean isDigit(char ch){
29        return ch-'0'>=0 && ch-'0'<=9;
30    }
31}