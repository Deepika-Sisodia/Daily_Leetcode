// Last updated: 2/5/2026, 1:07:13 PM
1class Solution {
2    ArrayList<String> ll =  new ArrayList<>();
3    public List<String> findWords(char[][] board, String[] words) {
4        Trie t = new Trie();
5        for (String s : words) {
6            t.insert(s);
7        }
8
9        for (int i = 0; i < board.length; i++) {
10            for (int j = 0; j < board[0].length; j++) {
11                if (t.root.child.containsKey(board[i][j])) {
12                    t.search(board, i, j, t.root,ll);
13                }
14            }
15        }
16
17        return ll;
18    }
19
20    static class Trie {
21        class Node {
22            char ch;
23            String isTerminal;
24            HashMap<Character, Node> child;
25
26            Node(char ch) {
27                this.ch = ch;
28                child = new HashMap<>();
29            }
30        }
31
32        Node root;
33
34        public Trie() {
35            root = new Node('*');
36        }
37
38        public void insert(String word) {
39            Node curr = root;
40            for (int i = 0; i < word.length(); i++) {
41                char ch = word.charAt(i);
42                if (!curr.child.containsKey(ch)) {
43                    curr.child.put(ch, new Node(ch));
44                }
45                curr = curr.child.get(ch);
46            }
47            curr.isTerminal = word;
48        }
49
50        public void search(char[][] maze, int i, int j, Node node,ArrayList<String> ll) {
51
52            if (i < 0 || j < 0 || i >= maze.length || j >= maze[0].length
53                    || maze[i][j] == '*'
54                    || !node.child.containsKey(maze[i][j])) {
55                return;
56            }
57
58            char ch = maze[i][j];
59            node = node.child.get(ch);
60
61            if (node.isTerminal != null) {
62                ll.add(node.isTerminal);
63                node.isTerminal = null; // avoid duplicates
64            }
65
66            maze[i][j] = '*';
67
68            search(maze, i + 1, j, node,ll);
69            search(maze, i - 1, j, node,ll);
70            search(maze, i, j + 1, node,ll);
71            search(maze, i, j - 1, node,ll);
72
73            maze[i][j] = ch;
74        }
75    }
76}