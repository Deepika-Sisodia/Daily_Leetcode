// Last updated: 8/24/2025, 9:28:11 PM
class Solution {
    public int lastStoneWeight(int[] stones) {
        int n = stones.length;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for(int i=0; i<n; i++){
            pq.add(stones[i]);
        }

        while(pq.size()>1){
            int y = pq.poll();
            int x = pq.poll();
            if(x != y){
                y = y-x;
                pq.add(y);
            }
        }

        return pq.isEmpty() ? 0: pq.peek();
    }
}