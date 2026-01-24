// Last updated: 1/24/2026, 8:15:35 PM
1class Solution {
2    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
3        HashMap<Integer, Integer> map = new HashMap<>();
4
5        for(int i=0; i<nums2.length; i++){
6            map.put(nums2[i],i);
7        }
8
9        int[] ans = new int[nums1.length];
10        for(int i=0; i<nums1.length; i++){
11            int a = map.get(nums1[i]);
12            boolean got = false;
13            for(int j=a+1; j<nums2.length; j++){
14                if(nums1[i]<nums2[j]){
15                    ans[i] = nums2[j];
16                    got = true;
17                    break;
18                }
19            }
20
21            if(got==false){
22                ans[i] = -1;
23            }
24        }
25
26        return ans;
27    }
28}