// Last updated: 3/25/2026, 10:43:58 PM
1class Solution {
2    public int findUnsortedSubarray(int[] nums) {
3        int n = nums.length;
4        int max = Integer.MIN_VALUE;
5
6        int right = -1;
7        for(int i=0; i<n; i++){
8            if(max<=nums[i]){
9                max = nums[i];
10            }
11            else{
12                right = i;
13            }
14        }
15
16        int min = Integer.MAX_VALUE;
17        int left = -1;
18
19        for(int i=n-1; i>=0; i--){
20            if(min>=nums[i]){
21                min = nums[i];
22            }
23            else{
24                left = i;
25            }
26        }
27
28        if(right == -1) return 0;
29        return right - left + 1;
30    }
31}