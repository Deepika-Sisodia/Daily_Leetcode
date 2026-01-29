// Last updated: 1/29/2026, 7:47:40 PM
1class Solution {
2    public long subArrayRanges(int[] nums) {
3        return maxSum(nums) - minSum(nums);   
4    }
5
6    public long minSum(int[] arr){
7        int n = arr.length;
8        long ans = 0;
9        int[] left = new int[n];
10        int[] right = new int[n];
11        Stack<Integer> st = new Stack<>();
12
13        for(int i=0; i<n; i++){
14            while(!st.isEmpty() && arr[st.peek()]>=arr[i]){
15                st.pop();
16            }
17            left[i] = st.isEmpty() ? i+1 : i-st.peek();
18            st.push(i);
19        }
20
21        st.clear();
22
23        for(int i=n-1; i>=0; i--){
24            while(!st.isEmpty() && arr[st.peek()]>arr[i]){
25                st.pop();
26            }
27            right[i] = st.isEmpty() ? n-i : st.peek()-i;
28            st.push(i);
29        }
30
31        for(int i=0; i<n; i++){
32            ans += (long) arr[i]*left[i]*right[i];
33        }
34
35        return ans;
36    }
37
38    public long maxSum(int[] arr){
39        int n = arr.length;
40        long ans = 0;
41        int[] left = new int[n];
42        int[] right = new int[n];
43        Stack<Integer> st = new Stack<>();
44
45        for(int i=0; i<n; i++){
46            while(!st.isEmpty() && arr[st.peek()]<=arr[i]){
47                st.pop();
48            }
49            left[i] = st.isEmpty() ? i+1 : i-st.peek();
50            st.push(i);
51        }
52
53        st.clear();
54
55        for(int i=n-1; i>=0; i--){
56            while(!st.isEmpty() && arr[st.peek()]<arr[i]){
57                st.pop();
58            }
59            right[i] = st.isEmpty() ? n-i : st.peek()-i;
60            st.push(i);
61        }
62
63        for(int i=0; i<n; i++){
64            ans += (long) arr[i]*left[i]*right[i];
65        }
66
67        return ans;
68    }
69}