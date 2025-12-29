// Last updated: 12/29/2025, 8:59:05 PM
1class Solution {
2    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
3        boolean[] visited = new boolean[rooms.size()];
4        isVisited(rooms,0,visited);
5
6        for(boolean b: visited){
7            if(!b) return false;
8        }
9        return true;
10    }
11
12    public static void isVisited(List<List<Integer>> rooms, int idx, boolean[] visited){
13        if(visited[idx]){
14            return;
15        }
16
17        visited[idx] = true;
18        for(int key: rooms.get(idx)){
19            isVisited(rooms,key,visited);
20        }
21    }
22}