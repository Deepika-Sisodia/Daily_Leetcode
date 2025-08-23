// Last updated: 8/23/2025, 9:55:10 PM
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
    int sum = 0, maxd = 0;
    public int deepestLeavesSum(TreeNode root) {
        sum(root,0);
        return sum;
    }

    public void sum(TreeNode root, int d){
        if(root == null){
            return;
        }

        if(d>maxd){
            maxd = d;
            sum = root.val;
        }
        else if(d == maxd){
            sum += root.val;
        }

        sum(root.left,d+1);
        sum(root.right,d+1);
    }
}