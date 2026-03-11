// Last updated: 3/11/2026, 10:30:29 AM
1class Solution {
2    public int[] topKFrequent(int[] nums, int k) {
3        HashMap<Integer, Integer> map = new HashMap<>();
4        for(int i=0; i<nums.length; i++){
5            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
6        }
7
8        ArrayList<Map.Entry<Integer,Integer>> ll = new ArrayList<>(map.entrySet());
9        Collections.sort(ll, (a,b)-> b.getValue()-a.getValue());
10        
11        int[] ans = new int[k];
12        int i=0;
13        for(Map.Entry<Integer, Integer> entry : ll){
14            if(k>0){
15                ans[i] = entry.getKey();
16                i++;
17                k--;
18            }
19        }
20
21        return ans;
22    }
23}