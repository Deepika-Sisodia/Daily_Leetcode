// Last updated: 1/14/2026, 8:07:48 PM
1class Solution {
2    public int timeRequiredToBuy(int[] tickets, int k) {
3        int t = 0;
4        Queue<int[]> q = new LinkedList<>();
5        for(int i=0; i<tickets.length; i++){
6            q.add(new int[] {i,tickets[i]});
7        }
8
9        while(!q.isEmpty()){
10            t++;
11            int[] curr = q.remove();
12            curr[1]--;
13
14            if(curr[1]==0){
15                if(curr[0]==k){
16                    return t;
17                }
18            }
19            else{
20                q.add(curr);
21            }
22        }
23
24        return t;
25    }
26}