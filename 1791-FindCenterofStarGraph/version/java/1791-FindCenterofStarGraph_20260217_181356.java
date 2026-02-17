// Last updated: 2/17/2026, 6:13:56 PM
1class Solution {
2    public int findCenter(int[][] edges) {
3        HashMap<Integer, Integer> map = new HashMap<>();
4        for(int i=0; i<edges.length; i++){
5            map.put(edges[i][0], map.getOrDefault(edges[i][0],0)+1);
6            map.put(edges[i][1], map.getOrDefault(edges[i][1],0)+1);
7        }
8
9        for(int key: map.keySet()){
10            if(map.get(key)==edges.length){
11                return key;
12            }
13        }
14
15        return 0;
16    }
17}