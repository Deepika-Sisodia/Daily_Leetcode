// Last updated: 7/31/2025, 2:10:33 PM
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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> ll = new ArrayList<>();
        postOrder(root,ll);
        return ll;
    }

    public void postOrder(TreeNode node, List<Integer> ll){
        if(node == null){
            return;
        }

        postOrder(node.left,ll);
        postOrder(node.right,ll);
        ll.add(node.val);
    }
}