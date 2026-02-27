// Last updated: 2/27/2026, 10:28:56 AM
1class Solution {
2    public int longestValidParentheses(String s) {
3        Stack<Integer> st = new Stack<>();
4        st.push(-1);
5        int max = 0;
6
7        for(int i=0; i<s.length(); i++){
8            if(s.charAt(i)=='('){
9                st.push(i);
10            }
11            else{
12                st.pop();
13
14                if(st.isEmpty()){
15                    st.push(i);
16                }
17                else{
18                    max = Math.max(max, i-st.peek());
19                }
20            }
21        }
22
23        return max;
24    }
25}