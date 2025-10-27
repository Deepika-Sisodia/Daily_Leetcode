// Last updated: 10/27/2025, 7:47:18 PM
class MinStack {
    Stack<Integer> st;
    Stack<Integer> minStack;
    public MinStack() {
        st = new Stack<>();
        minStack = new Stack<>();
    }
    
    public void push(int val) {
        st.push(val);
        if(minStack.isEmpty()){
            minStack.push(val);
        }
        else{
            
            minStack.push(Math.min(minStack.peek(),val));
            
        }
    }
    
    public void pop() {
        if(!st.isEmpty()){
            st.pop();
            minStack.pop();
        }
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        return minStack.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */