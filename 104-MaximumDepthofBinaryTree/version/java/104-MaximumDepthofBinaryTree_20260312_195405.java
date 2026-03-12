// Last updated: 3/12/2026, 7:54:05 PM
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
17    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
18        List<List<Integer>> ans = new ArrayList<>();
19
20        if(root==null) return ans;
21        
22        Queue<TreeNode> q = new LinkedList<>();
23        q.add(root);
24        boolean ltr = true;
25
26        while(!q.isEmpty()){
27            int size = q.size();
28            LinkedList<Integer> ll = new LinkedList<>();
29
30            for(int i=0; i<size; i++){
31                TreeNode curr = q.poll();
32
33                if(ltr) ll.addLast(curr.val);
34                else ll.addFirst(curr.val);
35
36                if(curr.left != null) q.add(curr.left);
37                if(curr.right != null) q.add(curr.right);
38            }
39
40            ans.add(ll);
41
42            ltr = !ltr;
43        }
44
45        return ans;
46    }
47}