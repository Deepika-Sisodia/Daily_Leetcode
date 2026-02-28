// Last updated: 2/28/2026, 9:17:13 PM
1class Solution {
2    public String mergeCharacters(String s, int k) {
3        StringBuilder sb = new StringBuilder();
4        int[] last = new int[26];
5        Arrays.fill(last,-1);
6
7        for(int i=0; i<s.length(); i++){
8            char ch = s.charAt(i);
9            int idx = ch-'a';
10            
11            if(last[idx] != -1 && sb.length()-last[idx]<=k){
12                continue;
13            }
14
15            sb.append(ch);
16            last[idx] = sb.length()-1;
17        }
18
19        return sb.toString();
20    }
21}