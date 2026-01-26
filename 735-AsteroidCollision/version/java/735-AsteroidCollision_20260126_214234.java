// Last updated: 1/26/2026, 9:42:34 PM
1class Solution {
2    public int[] asteroidCollision(int[] asteroids) {
3        int n = asteroids.length;
4        Stack<Integer> st = new Stack<>();
5
6        for(int i : asteroids){
7            boolean destroyed = false;
8            while(!st.isEmpty() && i<0 && st.peek()>0){
9                if(st.peek()==-i){
10                    st.pop();
11                    destroyed = true;
12                    break;
13                }
14                else if(st.peek()>-i){
15                    destroyed = true;
16                    break;
17                }
18                else{
19                    st.pop();
20                }
21            }
22
23            if(!destroyed){
24                st.push(i);
25            }
26        }
27
28        int[] ans = new int[st.size()];
29        int i = st.size()-1;
30        while(!st.isEmpty()){
31            ans[i] = st.pop(); 
32            i--;
33        }
34
35        return ans;
36    }
37}