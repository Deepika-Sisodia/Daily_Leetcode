// Last updated: 3/27/2026, 7:39:59 PM
1class Solution {
2    public int longestConsecutive(int[] nums) {
3        int n = nums.length;
4        Set<Integer> set = new HashSet<>();
5
6        for(int i=0; i<n; i++){
7            set.add(nums[i]);
8        }
9
10        int max = 0;
11
12        for(int i : set){
13            if(!set.contains(i-1)){
14                int curr = i;
15                int len = 1;
16
17                while(set.contains(curr+1)){
18                    len++;
19                    curr++;
20                }
21
22                max = Math.max(len,max);
23            }
24        }
25
26        return max;
27    }
28}