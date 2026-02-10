// Last updated: 2/10/2026, 3:54:18 PM
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
17    public TreeNode reverseOddLevels(TreeNode root) {
18        reverse(root.left,root.right,0);
19        return root;
20    }
21
22    public void reverse(TreeNode left, TreeNode right, int level){
23        if(left==null || right==null) return;
24
25        if(level%2==0){
26            int temp = left.val;
27            left.val = right.val;
28            right.val = temp;
29        }
30
31        reverse(left.left,right.right,level+1);
32        reverse(left.right,right.left,level+1);
33    }
34}