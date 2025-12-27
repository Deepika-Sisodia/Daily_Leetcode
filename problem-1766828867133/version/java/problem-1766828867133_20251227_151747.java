// Last updated: 12/27/2025, 3:17:47 PM
1class Solution {
2    public String resultingString(String s) {
3        StringBuilder sb = new StringBuilder();
4
5        for(int i=0; i<s.length(); i++){
6            if(sb.length()>0){
7                int last = sb.charAt(sb.length()-1);
8                int diff = Math.abs(last-s.charAt(i));
9                if(diff==1 || diff==25){
10                    sb.deleteCharAt(sb.length()-1);
11                    continue;
12                }
13            }
14            sb.append(s.charAt(i));
15        } 
16
17        return sb.toString();
18    }
19}