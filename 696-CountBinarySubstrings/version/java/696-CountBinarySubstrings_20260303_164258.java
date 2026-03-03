// Last updated: 3/3/2026, 4:42:58 PM
1class Solution {
2    public int countBinarySubstrings(String s) {
3        int n = s.length();
4        int curr = 1;
5        int prev = 0;
6        int count = 0;
7
8        for(int i=1; i<n; i++){
9            if(s.charAt(i)==s.charAt(i-1)){
10                curr++;
11            }
12            else{
13                count += Math.min(curr,prev);
14                prev = curr;
15                curr = 1;
16            }
17        }
18
19        count += Math.min(prev,curr);
20
21        return count;
22    }
23}