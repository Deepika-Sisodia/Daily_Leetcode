// Last updated: 3/31/2026, 11:56:02 AM
1class Solution {
2    public boolean isNStraightHand(int[] hand, int groupSize) {
3        int n = hand.length;
4        if(n%groupSize != 0) return false;
5
6        Arrays.sort(hand);
7
8        HashMap<Integer, Integer> map = new HashMap<>();
9        for(int i=0; i<n; i++){
10            map.put(hand[i], map.getOrDefault(hand[i],0)+1);
11        }
12
13        for(int i=0; i<n; i++){
14           int start = hand[i];
15           if(map.get(start)==0) continue;
16
17            for(int j=0; j<groupSize; j++){
18                int curr = start + j;
19                if(!map.containsKey(curr) || map.get(curr)==0){
20                    return false;
21                }
22                map.put(curr, map.get(curr)-1);
23            }
24        }
25
26        return true;
27
28    }
29}