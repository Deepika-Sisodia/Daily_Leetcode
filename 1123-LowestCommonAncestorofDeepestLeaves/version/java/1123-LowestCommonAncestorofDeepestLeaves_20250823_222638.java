// Last updated: 8/23/2025, 10:26:38 PM
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
    public TreeNode lcaDeepestLeaves(TreeNode root) {
        return lcaD(root).node;

    }

    public pair lcaD(TreeNode root){
        if(root == null){
            return new pair(null,0);
        }

        pair left = lcaD(root.left);
        pair right = lcaD(root.right);

        if(left.depth > right.depth){
            return new pair(left.node,left.depth+1);
        }

        else if(left.depth < right.depth){
            return new pair(right.node,right.depth+1);
        }
        else{
            return new pair(root,left.depth+1);
        }
    }


    private class pair{
        TreeNode node;
        int depth;
        pair(TreeNode n, int d){
            this.node = n;
            this.depth = d;
        }
    }
}