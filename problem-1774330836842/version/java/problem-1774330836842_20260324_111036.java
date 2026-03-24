// Last updated: 3/24/2026, 11:10:36 AM
1class Solution {
2    public int minStoneSum(int[] piles, int k) {
3        int n = piles.length;
4        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
5
6        for(int i=0; i<n; i++){
7            pq.add(piles[i]);
8        }
9
10        while(k-->0){
11            int curr = pq.poll();
12            int val = (int) Math.ceil((double) curr / (double) 2);
13
14            pq.add(val);
15        }
16        int sum = 0;
17        while(!pq.isEmpty()){
18            int curr = pq.poll();
19            sum += curr;
20        }
21
22        return sum;
23    }
24}