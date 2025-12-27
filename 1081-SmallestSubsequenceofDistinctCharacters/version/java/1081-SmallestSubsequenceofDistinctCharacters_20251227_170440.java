// Last updated: 12/27/2025, 5:04:40 PM
1class Solution {
2    public String smallestSubsequence(String s) {
3        int[] freq = new int[26];
4        boolean[] used = new boolean[26];
5        Stack<Character> st = new Stack<>();
6
7        for(char ch: s.toCharArray()){
8            freq[ch-'a']++;
9        }
10        for(char ch: s.toCharArray()){
11            int idx = ch-'a';
12            freq[idx]--;
13
14            if(used[idx]){
15                continue;
16            }
17
18            while(!st.isEmpty() && st.peek()>ch && freq[st.peek()-'a']>0){
19                used[st.pop()-'a'] = false;
20            }
21
22            st.push(ch);
23            used[idx] = true;
24        }
25
26        StringBuilder sb = new StringBuilder();
27        for(char ch: st){
28            sb.append(ch);
29        }
30
31        return sb.toString();
32    }
33}