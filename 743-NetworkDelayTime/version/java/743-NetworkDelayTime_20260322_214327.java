// Last updated: 3/22/2026, 9:43:27 PM
1/*
2// Definition for a Node.
3class Node {
4    public int val;
5    public List<Node> neighbors;
6    public Node() {
7        val = 0;
8        neighbors = new ArrayList<Node>();
9    }
10    public Node(int _val) {
11        val = _val;
12        neighbors = new ArrayList<Node>();
13    }
14    public Node(int _val, ArrayList<Node> _neighbors) {
15        val = _val;
16        neighbors = _neighbors;
17    }
18}
19*/
20
21class Solution {
22    public Node cloneGraph(Node node) {
23        if(node == null){
24            return null;
25        }
26
27        Node copy = new Node(node.val);
28        Node[] visited = new Node[101];
29        Arrays.fill(visited,null);
30
31        dfs(node,copy,visited);
32
33        return copy;
34    }
35
36    public void dfs(Node node, Node copy, Node[] visited){
37        visited[copy.val] = copy;
38
39        for(Node n: node.neighbors){
40            if(visited[n.val] == null){
41                Node newNode = new Node(n.val);
42                copy.neighbors.add(newNode);
43                dfs(n,newNode,visited);
44            }
45            else{
46                copy.neighbors.add(visited[n.val]);
47            }
48        }
49    }
50}