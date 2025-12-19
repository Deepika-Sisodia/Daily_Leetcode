// Last updated: 12/19/2025, 6:34:23 PM
1class Solution {
2    public boolean isPossible(int[] nums) {
3        int n = nums.length;
4        HashMap<Integer,Integer> map = new HashMap<>();
5
6        for(int i=0; i<n; i++){
7            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
8        }
9
10        HashMap<Integer, Integer> need = new HashMap<>();
11
12        for(int key: nums){
13            if(map.get(key)==0) continue;
14
15            if(need.getOrDefault(key,0)>0){
16                need.put(key, need.get(key)-1);
17                need.put(key+1, need.getOrDefault(key+1, 0) + 1);
18            }
19            else if(map.getOrDefault(key+1,0)>0 && map.getOrDefault(key+2,0)>0){
20                map.put(key+1, map.get(key+1)-1);
21                map.put(key+2, map.get(key+2)-1);
22                need.put(key+3, need.getOrDefault(key+3,0)+1);
23            }
24
25            else{
26                return false;
27            }
28
29            map.put(key, map.get(key)-1);
30        }
31
32        return true;
33    }
34}