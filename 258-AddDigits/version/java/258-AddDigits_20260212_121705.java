// Last updated: 2/12/2026, 12:17:05 PM
1class Solution {
2    public int[] maximizeXor(int[] nums, int[][] queries) {
3        int[][] q= new int[queries.length][3];
4        for(int i=0; i<q.length; i++){
5            q[i][0] = queries[i][0];
6            q[i][1] = queries[i][1];
7            q[i][2] = i;
8        }
9        Arrays.sort(q,(a,b)->a[1]-b[1]);
10        Arrays.sort(nums);
11
12        int[] ans = new int[q.length];
13        Trie t = new Trie();
14        int j = 0;
15        for(int[] a: q){
16            while(j<nums.length && nums[j]<=a[1]){
17                t.add(nums[j]);
18                j++;
19            }
20
21            if(j==0){
22                ans[a[2]] = -1;
23            }
24            else{
25                ans[a[2]] = t.getMaxXOR(a[0]);
26            }
27        }
28
29        return ans;
30    }
31
32    static class Trie{
33        class Node{
34            Node zero;
35            Node one;
36        }
37        private Node root = new Node();
38        public void add(int val){
39            Node curr = root;
40            for(int i=31; i>=0; i--){
41                int bit = val & (1<<i);
42                if(bit==0){
43                    if(curr.zero!=null){
44                        curr = curr.zero;
45                    }
46                    else{
47                        Node nn = new Node();
48                        curr.zero = nn;
49                        curr = nn;
50                    }
51                }
52                else{
53                    if(curr.one!=null){
54                        curr = curr.one;
55                    }
56                    else{
57                        Node nn = new Node();
58                        curr.one = nn;
59                        curr = nn;
60                    }
61                }
62            }
63        }
64
65        public int getMaxXOR(int x){
66            int ans = 0;
67            Node curr = root;
68            for(int i=31; i>=0; i--){
69                int bit = x & (1<<i);
70                 if(bit==0){
71                    if(curr.one!=null){
72                        ans = ans | (1<<i);
73                        curr = curr.one;
74                    }
75                    else{
76                       curr = curr.zero;
77                    }
78                }
79                else{
80                    if(curr.zero!=null){
81                        ans = ans | (1<<i);
82                        curr = curr.zero;
83                    }
84                    else{
85                       curr = curr.one;
86                    }
87                }
88            }
89
90            return ans;
91        }
92    }
93}