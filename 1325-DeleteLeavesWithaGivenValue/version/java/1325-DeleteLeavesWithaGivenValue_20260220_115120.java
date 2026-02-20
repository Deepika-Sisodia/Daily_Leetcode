// Last updated: 2/20/2026, 11:51:20 AM
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
17    public TreeNode removeLeafNodes(TreeNode root, int target) {
18        if(root == null){
19            return null;
20        }
21
22        TreeNode left = removeLeafNodes(root.left, target);
23        TreeNode right = removeLeafNodes(root.right, target);
24        
25        if(left == null && right == null && root.val == target){
26            return null;
27        }
28
29        root.left = left;
30        root.right = right;
31
32        return root;
33
34    }
35
36}