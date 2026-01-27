// Last updated: 1/27/2026, 4:50:19 PM
1class Solution {
2    public int findTheWinner(int n, int k) {
3        Queue<Integer> q = new LinkedList<>();
4        for(int i=1; i<=n; i++){
5            q.add(i);
6        }
7
8        while(q.size()>1){
9            for(int i=1; i<k; i++){
10                int r = q.poll();
11                q.add(r);
12            }
13            q.poll();
14        }
15
16        return q.peek();
17    }
18}