// Last updated: 8/12/2025, 5:50:06 PM
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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        traversal(root,0,ans);
        return ans;
    }

    public void traversal(TreeNode nn, int level,List<List<Integer>> ans){
        if(nn == null){
            return;
        }

        if(level == ans.size()){
            ans.add(new ArrayList<>());
        }

        if(level%2 == 0){
            ans.get(level).add(nn.val);
        }
        else{
            ans.get(level).add(0,nn.val);
        }


        traversal(nn.left,level+1,ans);
        traversal(nn.right,level+1,ans);
    }
}