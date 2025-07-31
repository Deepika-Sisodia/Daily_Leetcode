// Last updated: 7/31/2025, 2:10:52 PM
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
    public boolean isBalanced(TreeNode root) {
        return isBalance(root).isbal;
    }

    public BalancePair isBalance(TreeNode root){
        if(root == null){
            return new BalancePair();
        }

        BalancePair ldp = isBalance(root.left);
        BalancePair rdp = isBalance(root.right);
        BalancePair sdp = new BalancePair();
        sdp.ht = Math.max(ldp.ht, rdp.ht)+1;
        boolean sb = Math.abs(ldp.ht - rdp.ht)<=1;
        sdp.isbal = ldp.isbal && rdp.isbal && sb;
        return sdp;
    }
    class BalancePair{
        boolean isbal = true;
        int ht = -1;
    }
}