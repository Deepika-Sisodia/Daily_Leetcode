// Last updated: 4/7/2026, 3:08:44 PM
1class Solution {
2    public int numberOfArithmeticSlices(int[] nums) {
3        int n = nums.length;
4        HashMap<Long,Integer>[] map = new HashMap[n];
5
6        for(int i=0; i<n; i++){
7            map[i] = new HashMap<>();
8        }
9
10        int ans = 0;
11        for(int i=0; i<n; i++){
12            for(int j=0; j<i; j++){
13                long diff = (long) nums[i] - nums[j];
14                int counti = map[i].getOrDefault(diff,0);
15                int countj = map[j].getOrDefault(diff,0);
16                ans += countj;
17
18                map[i].put(diff, counti + countj + 1);
19            }
20        }
21        
22        return ans;
23    }
24}