// Last updated: 1/29/2026, 7:11:35 PM
1class Solution {
2    public int sumSubarrayMins(int[] arr) {
3        int n = arr.length;
4        int MOD = 1_000_000_007;
5        int[] left = new int[n];
6        int[] right = new int[n];
7
8        Stack<Integer> st = new Stack<>();
9
10        for(int i=0; i<n; i++){
11            while(!st.isEmpty() && arr[st.peek()]>arr[i]){
12                st.pop();
13            }
14            left[i] = st.isEmpty() ? -1 : st.peek();
15            st.push(i);
16        }
17
18        st.clear();
19        
20        for(int i=n-1; i>=0; i--){
21            while(!st.isEmpty() && arr[st.peek()]>=arr[i]){
22                st.pop();
23            }
24            right[i] = st.isEmpty() ? n : st.peek();
25            st.push(i);
26        }
27
28        long ans = 0;
29
30        for(int i=0; i<n; i++){
31            long l = i-left[i];
32            long r = right[i]-i;
33            ans = (ans + arr[i]*l*r) % MOD;
34        }
35
36        return (int) ans;
37    }
38}