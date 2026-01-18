// Last updated: 1/18/2026, 6:26:23 PM
1class Solution {
2    public int minimumOperations(int[] nums) {
3        int n = nums.length;
4        HashMap<Integer, Integer> map1 = new HashMap<>();
5        HashMap<Integer, Integer> map2 = new HashMap<>();
6
7        for(int i=0; i<n; i++){
8            if(i%2==0){
9                map1.put(nums[i], map1.getOrDefault(nums[i],0)+1);
10            }
11            else{
12                map2.put(nums[i], map2.getOrDefault(nums[i],0)+1);
13            }
14        }
15
16        int[] even = getTopTwo(map1);
17        int[] odd = getTopTwo(map2);
18        if(even[0]!=odd[0]){
19            return n-(even[1]+odd[1]);
20        }
21
22        int opt1 = n - (even[1]+odd[3]);
23        int opt2 = n - (even[3]+odd[1]);
24
25        return Math.min(opt1,opt2);
26    }
27
28    public int[] getTopTwo(HashMap<Integer, Integer> map){
29        int maxVal = -1;
30        int maxFreq = 0;
31        int secondVal = -1;
32        int secondFreq = 0;
33
34        for(int key: map.keySet()){
35            int freq = map.get(key);
36
37            if(freq>maxFreq){
38                secondFreq = maxFreq;
39                secondVal = maxVal;
40
41                maxFreq = freq;
42                maxVal = key;
43            }
44            else if(freq>secondFreq){
45                secondFreq = freq;
46                secondVal = key;
47            }
48        }
49
50        return new int[] {maxVal, maxFreq, secondVal, secondFreq};
51    }
52}