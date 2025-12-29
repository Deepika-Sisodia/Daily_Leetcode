// Last updated: 12/29/2025, 9:32:29 PM
1class Solution {
2    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
3        List<List<Integer>> result = new ArrayList<>();
4        List<Integer> path = new ArrayList<>();
5        paths(graph,0,path,result);
6        return result;
7    }
8
9    public void paths(int[][] graph, int idx,List<Integer> path, List<List<Integer>> result){
10        path.add(idx);
11
12        if(idx==graph.length-1){
13            result.add(new ArrayList<>(path));
14        }
15        
16        for(int i: graph[idx]){
17            paths(graph,i,path,result);
18        }
19
20        path.remove(path.size()-1);
21    }
22}