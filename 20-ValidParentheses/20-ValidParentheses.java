// Last updated: 7/31/2025, 2:12:24 PM
class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
	    for (char c : s.toCharArray()) {
		    if (c == '(')
			    stack.push(')');
		    else if (c == '{')
			    stack.push('}');
		    else if (c == '[')
			    stack.push(']');
		    else if (stack.isEmpty() || stack.pop() != c)
			    return false;
        }
        return stack.isEmpty();
	}
}