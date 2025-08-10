// Last updated: 8/10/2025, 2:05:10 PM
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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ll = new ArrayList<>();
        sum(root,targetSum, ll, ans);
        return ans;
    }

    public void sum(TreeNode node, int target,List<Integer> ll, List<List<Integer>> ans){
        if(node == null){
            return;
        }

        ll.add(node.val);

        if(node.left == null && node.right == null && target == node.val){
            ans.add(new ArrayList<>(ll));
        }
        else{
            sum(node.left, target-node.val,ll,ans);
            sum(node.right, target-node.val,ll,ans);
        }

        ll.remove(ll.size()-1);
    }
}