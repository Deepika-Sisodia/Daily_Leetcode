// Last updated: 2/1/2026, 6:35:06 PM
1class Solution {
2    public boolean canReach(int[] arr, int start) {
3        int n = arr.length;
4        boolean[] visited = new boolean[n];
5
6        return func(arr,start,visited);
7    }
8
9    public boolean func(int[] arr, int idx, boolean[] visited){
10        if(idx<0 || idx>=arr.length || visited[idx]){
11            return false;
12        }
13
14        if(arr[idx]==0){
15            return true;
16        }
17
18        visited[idx] = true;
19
20        boolean a = func(arr,idx+arr[idx],visited);
21        boolean b = func(arr,idx-arr[idx],visited);
22
23        return a || b;
24    }
25}