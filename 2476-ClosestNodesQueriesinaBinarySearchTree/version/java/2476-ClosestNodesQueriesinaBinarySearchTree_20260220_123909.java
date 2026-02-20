// Last updated: 2/20/2026, 12:39:09 PM
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */
16class Solution {
17    public List<List<Integer>> closestNodes(TreeNode root, List<Integer> queries) {
18        List<List<Integer>> ans = new ArrayList<>();
19        List<Integer> ll = new ArrayList<>();
20        inorder(root,ll);
21
22        for(int i=0; i<queries.size(); i++){
23            ans.add(new ArrayList<>(search(ll,queries.get(i))));
24        }
25
26        return ans;
27    }
28
29    public void inorder(TreeNode root, List<Integer> ll){
30        if(root==null){
31            return;
32        }
33        inorder(root.left,ll);
34        ll.add(root.val);
35        inorder(root.right,ll);
36    }
37
38    public List<Integer> search(List<Integer> ll, int target){
39        List<Integer> ans = new ArrayList<>();
40        int lo = 0;
41        int hi = ll.size()-1;
42        int min = -1;
43        int max = -1;
44        while(lo<=hi){
45            int mid = lo + (hi-lo)/2;
46
47            if(ll.get(mid)==target){
48                min =  ll.get(mid);
49                max = ll.get(mid);
50                break;
51            }
52            else{
53                if(ll.get(mid)>target){
54                    max = ll.get(mid);
55                    hi = mid-1;
56                }
57                else{
58                    min = ll.get(mid);
59                    lo = mid+1;
60                }
61            }
62        }
63
64        ans.add(min);
65        ans.add(max);
66
67        return ans;
68    }
69}