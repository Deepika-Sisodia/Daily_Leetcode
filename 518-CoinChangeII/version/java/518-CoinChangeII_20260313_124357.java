// Last updated: 3/13/2026, 12:43:57 PM
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
17    int c = 0, ans = -1;
18    public int kthSmallest(TreeNode root, int k) {
19        func(root,k);
20        return ans;
21    }
22
23    public void func(TreeNode root, int k){
24        if(root==null){
25            return;
26        }
27
28        func(root.left,k);
29        c++;
30        if(c==k){
31            ans = root.val;
32        }
33        func(root.right,k);
34    }
35}