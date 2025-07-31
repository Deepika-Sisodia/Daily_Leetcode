// Last updated: 7/31/2025, 2:07:59 PM
class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        return temp(temperatures);
        
    }

    public static int[] temp(int[] arr){
        int n = arr.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i=0; i<n; i++){
            while(!st.isEmpty() && arr[i]>arr[st.peek()]){
                int idx = st.pop();
                ans[idx]=i-idx;
            }
            st.push(i);

        }
        return ans;
    }
}