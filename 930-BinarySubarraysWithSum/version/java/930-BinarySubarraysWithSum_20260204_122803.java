// Last updated: 2/4/2026, 12:28:03 PM
1public class Trie{
2    class Node{
3        char ch;
4        boolean isTerminal;
5        HashMap<Character,Node> child;
6        Node(char ch){
7            this.ch = ch;
8            child = new HashMap<>();
9        }
10    }
11
12    private Node root;
13
14    public Trie(){
15        root = new Node('*');
16    }
17
18    public void insert(String word){
19        Node curr = root;
20        for(int i=0; i<word.length(); i++){
21            char ch = word.charAt(i);
22            if(curr.child.containsKey(ch)){
23                curr = curr.child.get(ch);
24            }
25            else{
26                Node nn = new Node(ch);
27                curr.child.put(ch,nn);
28                curr = nn;
29            }
30        }
31
32        curr.isTerminal = true;
33    }
34    public boolean search(String word){
35        Node curr = root;
36        for(int i=0; i<word.length(); i++){
37            char ch = word.charAt(i);
38            if(curr.child.containsKey(ch)){
39                curr = curr.child.get(ch);
40            }
41            else{
42                return false;
43            }
44        }
45        return curr.isTerminal;
46    }
47    
48    public boolean startsWith(String prefix){
49        Node curr = root;
50        for(int i=0; i<prefix.length(); i++){
51            char ch = prefix.charAt(i);
52            if(curr.child.containsKey(ch)){
53                curr = curr.child.get(ch);
54            }
55            else{
56                return false;
57            }
58        }
59        return true;
60    }
61}
62
63/**
64 * Your Trie object will be instantiated and called as such:
65 * Trie obj = new Trie();
66 * obj.insert(word);
67 * boolean param_2 = obj.search(word);
68 * boolean param_3 = obj.startsWith(prefix);
69 */