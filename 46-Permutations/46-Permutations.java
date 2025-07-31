// Last updated: 7/31/2025, 2:11:50 PM
class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        boolean[] board = new boolean[nums.length];
        permutations(nums,board, new ArrayList<>(), ans);
        return ans;
    }

    public static void permutations(int[] arr, boolean[] board, List<Integer> ll,List<List<Integer>> ans){
        if(arr.length==ll.size()){
            ans.add(new ArrayList<>(ll));
            return;
        }

        for(int i=0; i<arr.length; i++){
            if(board[i]==false){
                board[i]=true;
                ll.add(arr[i]);
                permutations(arr,board,ll,ans);
                ll.remove(ll.size()-1);
                board[i]=false;
            }
           
        }
    }

}