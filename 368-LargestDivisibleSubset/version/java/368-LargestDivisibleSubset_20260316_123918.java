// Last updated: 3/16/2026, 12:39:18 PM
1class Solution {
2    public List<Integer> largestDivisibleSubset(int[] nums) {
3        Arrays.sort(nums);
4        int n = nums.length;
5        int[] dp = new int[n];
6        Arrays.fill(dp,1);
7
8        int[] idx = new int[n];
9        int max = 1;
10        int last = 0;
11
12        for(int i=1; i<n; i++){
13            idx[i] = i;
14            for(int j=0; j<i; j++){
15                if(nums[i]%nums[j]==0 && 1 + dp[j] > dp[i]){
16                    dp[i] = 1 + dp[j];
17                    idx[i] = j;
18                }
19
20            }
21
22            if(dp[i]>max){
23                max = dp[i];
24                last = i;
25            }
26        }
27
28        List<Integer> ans = new ArrayList<>();
29
30        int i = last;
31
32        while(i != idx[i]){
33            ans.add(nums[i]);
34            i = idx[i];
35        }
36
37        ans.add(nums[i]);
38
39        return ans;
40
41    }
42}