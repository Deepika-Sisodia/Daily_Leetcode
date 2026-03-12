// Last updated: 3/12/2026, 7:15:20 PM
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
17    public int maxDepth(TreeNode root) {
18        return depth(root);
19    }
20
21    public int depth(TreeNode node){
22        if(node == null){
23            return 0;
24        }
25
26        int left = 1 + depth(node.left);
27        int right = 1 + depth(node.right);
28
29        return Math.max(left,right);
30    }
31}