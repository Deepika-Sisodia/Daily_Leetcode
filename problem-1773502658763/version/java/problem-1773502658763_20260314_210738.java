// Last updated: 3/14/2026, 9:07:38 PM
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
17    public List<List<Integer>> levelOrderBottom(TreeNode root) {
18        List<List<Integer>> ans = new ArrayList<>();
19
20        if(root == null) return ans;
21
22        Queue<TreeNode> q = new LinkedList<>();
23        q.add(root);
24
25        while(!q.isEmpty()){
26            int size = q.size();
27            List<Integer> ll = new ArrayList<>();
28            for(int i=0; i<size; i++){
29                TreeNode curr = q.poll();
30                ll.add(curr.val);
31
32                if(curr.left != null) q.add(curr.left);
33                if(curr.right != null) q.add(curr.right);
34            }
35
36            ans.add(new ArrayList<>(ll));
37        }
38
39        Collections.reverse(ans);
40
41        return ans;
42    }
43}