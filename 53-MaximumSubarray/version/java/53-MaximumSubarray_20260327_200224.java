// Last updated: 3/27/2026, 8:02:24 PM
1class Solution {
2    public int findMaxLength(int[] nums) {
3        int n = nums.length;
4
5        Map<Integer, Integer> map = new HashMap<>();
6        map.put(0,-1);
7
8        int sum = 0;
9        int max = 0;
10        for(int i=0; i<n; i++){
11            if(nums[i]==0){
12                sum += -1;
13            }
14            else{
15                sum += 1;
16            }
17
18            if(map.containsKey(sum)){
19                int len = i - map.get(sum);
20                max = Math.max(max,len);
21            }
22            else{
23                map.put(sum,i);
24            }
25        }
26
27        return max;
28    }
29}