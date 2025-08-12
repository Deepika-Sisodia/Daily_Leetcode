// Last updated: 8/12/2025, 6:28:11 PM
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
    int diameter = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        // return diameter(root).dia;
        height(root);
        return diameter;
    }
    // public DiaPair diameter(TreeNode root){
    //     if(root == null){
    //         return new DiaPair();
    //     }

    //     DiaPair ldp = diameter(root.left);
    //     DiaPair rdp = diameter(root.right);
    //     DiaPair sdp = new DiaPair();
    //     sdp.ht = Math.max(ldp.ht, rdp.ht)+1;
    //     int sd = ldp.ht + rdp.ht + 2;
    //     sdp.dia = Math.max(sd, Math.max(ldp.dia,rdp.dia));
    //     return sdp;
    // }

    // class DiaPair{
    //     int dia = 0;
    //     int ht = -1;
    // }

    public int height(TreeNode nn){
        if(nn == null){
            return 0;
        }

        int lh = height(nn.left);
        int rh = height(nn.right);
        diameter = Math.max(diameter,lh+rh);

        return Math.max(lh,rh)+1;
    }
}