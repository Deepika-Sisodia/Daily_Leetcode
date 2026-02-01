// Last updated: 2/1/2026, 5:53:39 PM
1class Solution {
2    public int jump(int[] nums) {
3        int n = nums.length;
4        int jumps = 0;
5        int currEnd = 0;
6        int farthest = 0;
7
8        for(int i=0; i<n-1; i++){
9            farthest = Math.max(farthest,i+nums[i]);
10            if(i==currEnd){
11                jumps++;
12                currEnd = farthest;
13            }
14        }
15
16        return jumps;
17    }
18}