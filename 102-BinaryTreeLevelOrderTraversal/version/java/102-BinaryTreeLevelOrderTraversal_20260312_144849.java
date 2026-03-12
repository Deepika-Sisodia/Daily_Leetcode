// Last updated: 3/12/2026, 2:48:49 PM
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode(int x) { val = x; }
8 * }
9 */
10class Solution {
11    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
12        if(root == null){
13            return null;
14        }
15
16        if(root == p || root == q){
17            return root;
18        }
19
20        TreeNode left = lowestCommonAncestor(root.left, p, q);
21        TreeNode right = lowestCommonAncestor(root.right, p, q);
22        if(right != null && left != null){
23            return root;
24        }
25        else if(left == null){
26            return right;
27        }
28        else{
29            return left;
30        }
31    }
32}