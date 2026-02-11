// Last updated: 2/11/2026, 12:44:51 PM
1class Solution {
2    public int findMaximumXOR(int[] nums) {
3        Trie t = new Trie();
4        for(int x: nums){
5            t.add(x);
6        }
7        int ans = 0;
8        for(int x: nums){
9            ans = Math.max(t.getMaxXOR(x),ans);
10        }
11        
12        return ans;
13    }
14
15    static class Trie{
16        class Node{
17            Node zero;
18            Node one;
19        }
20        private Node root = new Node();
21        public void add(int val){
22            Node curr = root;
23            for(int i=31; i>=0; i--){
24                int bit = val & (1<<i);
25                if(bit==0){
26                    if(curr.zero!=null){
27                        curr = curr.zero;
28                    }
29                    else{
30                        Node nn = new Node();
31                        curr.zero = nn;
32                        curr = nn;
33                    }
34                }
35                else{
36                    if(curr.one!=null){
37                        curr = curr.one;
38                    }
39                    else{
40                        Node nn = new Node();
41                        curr.one = nn;
42                        curr = nn;
43                    }
44                }
45            }
46        }
47
48        public int getMaxXOR(int x){
49            int ans = 0;
50            Node curr = root;
51            for(int i=31; i>=0; i--){
52                int bit = x & (1<<i);
53                 if(bit==0){
54                    if(curr.one!=null){
55                        ans = ans | (1<<i);
56                        curr = curr.one;
57                    }
58                    else{
59                       curr = curr.zero;
60                    }
61                }
62                else{
63                    if(curr.zero!=null){
64                        ans = ans | (1<<i);
65                        curr = curr.zero;
66                    }
67                    else{
68                       curr = curr.one;
69                    }
70                }
71            }
72
73            return ans;
74        }
75    }
76}