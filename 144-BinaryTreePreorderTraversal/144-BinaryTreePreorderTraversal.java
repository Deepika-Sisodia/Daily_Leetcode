// Last updated: 7/31/2025, 2:10:35 PM
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ll = new ArrayList<>();
        preOrder(root,ll);
        return ll;
    }

    public void preOrder(TreeNode node, List<Integer> ll){
        if(node == null){
            return;
        }

        ll.add(node.val);
        preOrder(node.left,ll);
        preOrder(node.right,ll);
    }
}