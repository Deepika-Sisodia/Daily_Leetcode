// Last updated: 2/27/2026, 11:49:03 AM
1class Solution {
2    public boolean isMatch(String s, String p) {
3        return solve(s,p,0,0);
4    }
5
6    public boolean solve(String s, String p, int i, int j){
7        if(p.length()==j){
8            return s.length()==i;
9        }
10
11        boolean matched = false;
12
13        if((s.length() > i) && (s.charAt(i)==p.charAt(j) || p.charAt(j)=='.')){
14            matched = true;
15        }
16
17        if(p.length()>j+1 && p.charAt(j+1)=='*'){
18            boolean not_take = solve(s,p,i,j+2);
19            boolean take = matched && solve(s,p,i+1,j);
20
21            return not_take || take;
22        }
23
24        return matched && solve(s,p,i+1,j+1);
25
26    }
27}