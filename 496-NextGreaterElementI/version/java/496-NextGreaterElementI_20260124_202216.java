// Last updated: 1/24/2026, 8:22:16 PM
1class Solution {
2    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
3        Stack<Integer> st = new Stack<>();
4        HashMap<Integer, Integer> map = new HashMap<>();
5
6        for(int i: nums2){
7            while(!st.isEmpty() && st.peek()<i){
8                map.put(st.pop(),i);
9            }
10            st.push(i);
11        }
12
13        while(!st.isEmpty()){
14            map.put(st.pop(),-1);
15        }
16
17        int[] ans = new int[nums1.length];
18        for(int i=0; i<nums1.length; i++){
19            ans[i] = map.get(nums1[i]);
20        }
21
22        return ans;
23    }
24}