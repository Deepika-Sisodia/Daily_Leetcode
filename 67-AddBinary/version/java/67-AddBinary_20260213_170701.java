// Last updated: 2/13/2026, 5:07:01 PM
1class Solution {
2    public String addBinary(String a, String b) {
3        StringBuilder sb = new StringBuilder();
4        int i = a.length()-1, j = b.length()-1;
5        int c = 0;
6        while(i>=0 || j>=0){
7            int sum = c;
8            if(j>=0) sum += b.charAt(j--) - '0';
9            if(i>=0) sum += a.charAt(i--) - '0';
10            sb.append(sum % 2);
11            c = sum/2;
12        }
13
14        if(c!=0){
15            sb.append(c);
16        }
17
18        return sb.reverse().toString();
19    }
20}