// Last updated: 8/18/2025, 6:59:07 PM
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
    int xd = -1, yd = -1;
    TreeNode xp = null, yp = null;

    public boolean isCousins(TreeNode root, int x, int y) {
        check(root,null,0,x,y);
        return (xd == yd) && (xp != yp);
    }

    public void check(TreeNode node, TreeNode parent, int depth, int x, int y){
        if(node == null){
            return;
        }
        if(node.val == x){
            xd = depth;
            xp = parent;
        }
        if(node.val == y){
            yd = depth;
            yp = parent;
        }

        check(node.left,node,depth+1,x,y);
        check(node.right,node,depth+1,x,y);
    }
}