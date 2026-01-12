// Last updated: 1/12/2026, 9:59:01 PM
1class Solution {
2    public int longestBalanced(int[] nums) {
3        int n = nums.length;
4        int ans = 0;
5
6        for(int i=0; i<n; i++){
7            HashSet<Integer> marked = new HashSet<>();
8            int[] count = new int[2];
9            for(int j=i; j<n; j++){
10                if(marked.add(nums[j])){
11                    count[nums[j]%2]++;
12                }
13
14                if(count[0]==count[1]){
15                    ans = Math.max(ans, j-i+1);
16                }
17            }
18        }
19
20        return ans;
21    }
22}