// Last updated: 3/12/2026, 11:21:50 AM
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
17    public List<List<Integer>> levelOrder(TreeNode root) {
18        List<List<Integer>> ans = new ArrayList<>();
19        if(root==null) return ans;
20        Queue<TreeNode> q = new LinkedList<>();
21        q.add(root);
22
23        while(!q.isEmpty()){
24            int size = q.size();
25            List<Integer> ll = new ArrayList<>();
26            for(int i=0; i<size; i++){
27                TreeNode curr = q.poll();
28                ll.add(curr.val);
29                if(curr.left != null) q.add(curr.left);
30                if(curr.right != null) q.add(curr.right);
31            }
32
33            ans.add(new ArrayList<>(ll));
34        }
35
36        return ans;
37    }
38}