// Last updated: 8/27/2025, 10:55:09 PM
class Solution {
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for(int i : gifts){
            pq.add(i);
        }

        while(k>0 && !pq.isEmpty()){
            int a = pq.poll();
            a = (int) Math.sqrt(a);
            pq.add(a);
            k--;
        }

        long sum = 0;
        while(!pq.isEmpty()){
            sum += pq.poll();
        }

        return sum;

    }
}