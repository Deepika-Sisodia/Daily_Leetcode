// Last updated: 2/28/2026, 8:48:46 PM
1class Solution {
2    public int[] minDistinctFreqPair(int[] nums) {
3        
4        int[] ans = {-1,-1};
5        HashMap<Integer, Integer> map = new HashMap<>();
6        for(int i=0; i<nums.length; i++){
7            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
8        }
9        
10        List<Integer> ll = new ArrayList<>(map.keySet());
11        Collections.sort(ll);
12
13        for(int i=0; i<ll.size(); i++){
14            for(int j=i+1; j<ll.size(); j++){
15                if(!map.get(ll.get(i)).equals(map.get(ll.get(j)))){
16                    ans[0] = ll.get(i);
17                    ans[1] = ll.get(j);
18                    return ans;
19                }
20            }
21        }
22        
23        return ans;
24    }
25}