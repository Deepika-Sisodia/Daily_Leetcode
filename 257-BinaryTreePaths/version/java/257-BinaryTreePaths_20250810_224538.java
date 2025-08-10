// Last updated: 8/10/2025, 10:45:38 PM
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
    public List<String> binaryTreePaths(TreeNode root) {
       List<String> ll = new ArrayList<>();
       paths(root,"",ll);
       return ll;
    }

    private void paths(TreeNode node, String s, List<String> ll){
        if(node.left == null && node.right == null){
            ll.add(s+node.val);
            return;
        }
        else{
            if(node.left != null){
                paths(node.left,s+node.val+"->",ll);
            }

            if(node.right != null){
                paths(node.right,s+node.val+"->",ll);
            }
        }
    }
}