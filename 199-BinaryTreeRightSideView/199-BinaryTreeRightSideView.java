// Last updated: 7/31/2025, 2:09:56 PM
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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ll = new ArrayList<>();
        rightSide(root,1,ll);
        return ll;
    }
    int maxd = 0;
    public void rightSide(TreeNode root, int cl,List<Integer> ll){
        if(root == null){
            return;
        }
            
        if(maxd < cl){
            ll.add(root.val);
            maxd = cl;
        }
            

        rightSide(root.right, cl+1,ll);
        rightSide(root.left, cl+1,ll);
    }
}