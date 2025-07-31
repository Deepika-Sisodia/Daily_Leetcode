// Last updated: 7/31/2025, 2:10:59 PM
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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ll = new ArrayList<>();
        inOrder(root,ll);
        return ll;
    }

    public void inOrder(TreeNode node, List<Integer> ll){
        if(node == null){
            return;
        }

        inOrder(node.left,ll);
        ll.add(node.val);
        inOrder(node.right,ll);
        
    }
}