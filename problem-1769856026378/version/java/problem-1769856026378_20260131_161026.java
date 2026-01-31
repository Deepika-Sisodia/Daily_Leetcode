// Last updated: 1/31/2026, 4:10:26 PM
1class Solution {
2    public int maxDepth(String s) {
3        int n = s.length();
4        int max = Integer.MIN_VALUE;
5        int c = 0;
6        for(int i=0; i<n; i++){
7            char ch = s.charAt(i);
8            if(ch=='('){
9                c++;
10                max = Math.max(max,c);
11            }
12            else if(ch==')'){
13                c--;
14            }
15        }
16
17        if(max==Integer.MIN_VALUE) return 0;
18        
19        return max;
20    }
21}