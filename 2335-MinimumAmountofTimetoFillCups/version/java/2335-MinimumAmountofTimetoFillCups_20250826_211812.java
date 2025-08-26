// Last updated: 8/26/2025, 9:18:12 PM
class Solution {
    public int fillCups(int[] amount) {
        int n = amount.length;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for(int i : amount){
            pq.add(i);
        }

        int c = 0;
        while(!pq.isEmpty()){
            int a = pq.remove();
            int b = pq.remove();

            if(a <= 0 && b <= 0){
                return c;
            }
            
            a = a-1;
            b = b-1;

            pq.add(a);
            pq.add(b);

            c++;
        }
        return c;
    }
}