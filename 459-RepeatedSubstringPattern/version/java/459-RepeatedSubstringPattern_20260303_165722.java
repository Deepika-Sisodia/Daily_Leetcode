// Last updated: 3/3/2026, 4:57:22 PM
1class Solution {
2    public boolean repeatedSubstringPattern(String s) {
3        int n = s.length();
4
5        for(int len=1; len<=n/2; len++){
6            if(n%len==0){
7                String sub = s.substring(0,len);
8                StringBuilder sb = new StringBuilder();
9
10                int times = n/len;
11                for(int j=0; j<times; j++){
12                    sb.append(sub);
13                }
14
15                if(sb.toString().equals(s)) return true;
16            }
17        }
18
19        return false;
20    }
21}