// Last updated: 3/16/2026, 11:47:01 AM
1class Solution {
2    public int lengthOfLIS(int[] nums) {
3        int[] lis = new int[nums.length];
4        lis[0] = nums[0];
5        int len = 1;
6        for(int i=1; i<nums.length; i++){
7            if(nums[i]>lis[len-1]){
8                lis[len] = nums[i];
9                len++;
10            }
11            else{
12                int idx = BS(lis,0,len-1,nums[i]);
13                lis[idx] = nums[i];
14            }
15        }
16
17        return len;
18    }
19
20    public int BS(int[] arr, int l, int r, int target){
21        int ans = 0;
22        while(l<=r){
23            int mid = l+(r-l)/2;
24            if(arr[mid]>=target){
25                ans = mid;
26                r = mid-1;
27            }
28            else{
29                l = mid+1;
30            }
31        }
32
33        return ans;
34    }
35}