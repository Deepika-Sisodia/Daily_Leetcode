// Last updated: 2/4/2026, 2:14:33 PM
1class Solution {
2    public int numberOfSubarrays(int[] nums, int k) {
3        int n = nums.length;
4        
5        for(int i=0; i<n; i++){
6            if(nums[i]%2==0){
7                nums[i] = 0;
8            }
9            else{
10                nums[i] = 1;
11            }
12        }
13
14        HashMap<Integer, Integer> map = new HashMap<>();
15        map.put(0,1);
16        int sum = 0;
17        int count = 0;
18
19        for(int i=0; i<n; i++){
20            sum += nums[i];
21
22            if(map.containsKey(sum-k)){
23                count += map.get(sum-k);
24            }
25
26            map.put(sum, map.getOrDefault(sum,0)+1);
27        }
28
29        return count;
30    }
31}