// Last updated: 1/30/2026, 11:58:42 AM
1class Solution {
2    public int minOperations(int[] nums) {
3        int n = nums.length;
4        int c = 0;
5        for(int i=0; i<n; i++){
6            if(nums[i]==0 && i+2>=n){
7                return -1;
8            }
9            else if(nums[i]==0 && i+2<n){
10                nums[i]=1;
11                nums[i+1] = nums[i+1]==0 ? 1:0;
12                nums[i+2] = nums[i+2]==0 ? 1:0;
13                c++;
14            }
15        }
16
17        return c;
18    }
19}