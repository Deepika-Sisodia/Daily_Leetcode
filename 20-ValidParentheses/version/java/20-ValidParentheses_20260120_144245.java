// Last updated: 1/20/2026, 2:42:45 PM
1class Solution {
2    public boolean isValid(String s) {
3        Stack<Character> st = new Stack<>();
4        char[] arr = s.toCharArray();
5
6        for(int i=0; i<arr.length; i++){
7            if(arr[i]=='(' || arr[i]=='{' || arr[i]=='['){
8                st.push(arr[i]);
9            }
10            else{
11                if(st.isEmpty()){
12                    return false;
13                }
14                char ch = st.pop();
15                if((arr[i]==')' && ch=='(') || (arr[i]=='}' && ch=='{') || (arr[i]==']' && ch=='[')){
16
17                }
18                else{
19                    return false;
20                }
21            }
22        }
23
24        return st.isEmpty();
25    }
26}