// Last updated: 1/7/2026, 10:08:14 PM
1class Solution {
2    public List<Integer> goodDaysToRobBank(int[] security, int time) {
3        int n = security.length;
4        int[] dec = new int[n];
5        int[] inc = new int[n];
6
7        for(int i=1; i<n; i++){
8            if(security[i]<=security[i-1]){
9                dec[i] = dec[i-1]+1;
10            }
11        }
12
13        for(int i=n-2; i>=0; i--){
14            if(security[i]<=security[i+1]){
15                inc[i] = inc[i+1]+1;
16            }
17        }
18
19        ArrayList<Integer> ans = new ArrayList<>();
20        for(int i=0; i<n; i++){
21            if(dec[i]>=time && inc[i]>=time){
22                ans.add(i);
23            }
24        }
25
26        return ans;
27    }
28}