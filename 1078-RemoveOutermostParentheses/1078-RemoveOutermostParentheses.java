// Last updated: 7/31/2025, 2:07:18 PM
class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder sb = new StringBuilder();
        Stack<Character> st = new Stack<>();
        int start = 0;
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch=='('){
                st.push(ch);
            }
            else{
                st.pop();
            }

            if(st.isEmpty()){
                sb.append(s.substring(start+1,i));
                start = i+1;
            }
        }
        return sb.toString();
    }
}