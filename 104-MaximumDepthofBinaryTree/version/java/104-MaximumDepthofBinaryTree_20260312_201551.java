// Last updated: 3/12/2026, 8:15:51 PM
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
17    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
18        List<List<Integer>> ans = new ArrayList<>();
19        List<Integer> ll = new ArrayList<>();
20
21        func(root,targetSum,ans,ll);
22
23        return ans;
24    }
25
26    public void func(TreeNode root, int target, List<List<Integer>> ans, List<Integer> ll){
27        if(root == null){
28            return;
29        }
30
31        ll.add(root.val);
32
33        if(root.left == null && root.right == null && target == root.val){
34            ans.add(new ArrayList<>(ll));
35        }
36    
37        func(root.left, target-root.val, ans, ll);
38        func(root.right, target-root.val, ans, ll);
39
40        ll.remove(ll.size()-1);
41    }
42}