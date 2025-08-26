// Last updated: 8/26/2025, 9:24:48 PM
class Solution {
    public int fillCups(int[] amount) {
        int n = amount.length;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for(int i : amount){
            if(i>0){
                pq.add(i);
            }
        }

        int c = 0;
        while(!pq.isEmpty()){
            int a = pq.remove();
            int b = 0;

            if(!pq.isEmpty()){
                b = pq.poll();
            }

            if(a>0) a--;
            if(b>0) b--;

            c++;

            if(a>0) pq.add(a);
            if(b>0) pq.add(b);

            
        }
        return c;
    }
}