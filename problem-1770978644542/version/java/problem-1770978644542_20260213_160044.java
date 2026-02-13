// Last updated: 2/13/2026, 4:00:44 PM
1class Solution {
2    public int singleNumber(int[] nums) {
3        int n = nums.length;
4        int ans = 0;
5        for(int bitIndex=0; bitIndex<32; bitIndex++){
6            int cnt = 0;
7
8            for(int i=0; i<n; i++){
9                if((nums[i]&(1<<bitIndex)) != 0){
10                    cnt++;
11                }
12            }
13            if(cnt%3==1){
14                ans = ans | (1<<bitIndex);
15            }
16        }
17
18        return ans;
19    }
20}