// Last updated: 2/13/2026, 3:27:52 PM
1class Solution {
2    public List<List<Integer>> subsets(int[] nums) {
3        int n = nums.length;
4        int subsets = (int) Math.pow(2,n);
5
6        List<List<Integer>> ans = new ArrayList<>();
7
8        for(int num=0; num<subsets; num++){
9            List<Integer> ll = new ArrayList<>();
10
11            for(int i=0; i<n; i++){
12                if((num & (1<<i)) != 0){
13                    ll.add(nums[i]);
14                }
15            }
16
17            ans.add(new ArrayList<>(ll));
18        }
19
20        return ans;
21
22    }
23}