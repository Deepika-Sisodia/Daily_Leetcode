// Last updated: 10/27/2025, 8:57:08 PM
class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[n];
        for(int i=0; i<2*n; i++){
            int j = i%n;
            while(!st.isEmpty() && nums[j]>nums[st.peek()]){
                ans[st.pop()]=nums[j];
            }
            if(i<n){
                st.push(j);
            }
        }
        // if(nums[0]>nums[n-1]){
        //     ans[n-1]=nums[0];
        // }

        while(!st.isEmpty()){
            ans[st.pop()]=-1;
        }

        return ans;
    }
}