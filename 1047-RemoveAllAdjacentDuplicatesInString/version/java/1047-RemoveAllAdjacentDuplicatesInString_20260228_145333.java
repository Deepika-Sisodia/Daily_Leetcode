// Last updated: 2/28/2026, 2:53:33 PM
1class Solution {
2    public String removeDuplicates(String s) {
3        Stack<Character> st = new Stack<>();
4        for(int i=0; i<s.length(); i++){
5            char ch = s.charAt(i);
6            if(!st.isEmpty() && st.peek()==ch){
7                st.pop();
8            }
9            else{
10                st.push(ch);
11            }
12        }
13        StringBuilder sb = new StringBuilder();
14        while(!st.isEmpty()){
15            sb.append(st.pop());
16        }
17
18        return sb.reverse().toString();
19    }
20}