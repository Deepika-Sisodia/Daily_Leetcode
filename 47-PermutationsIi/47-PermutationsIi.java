// Last updated: 7/31/2025, 2:11:49 PM
class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ll=new ArrayList<>();
        Arrays.sort(nums);
        boolean[] board = new boolean[nums.length];
        permutations(nums,board, ll, ans);
        return ans;
    }
    public static void permutations(int[] arr, boolean[] board, List<Integer> ll,List<List<Integer>> ans){
        if(arr.length==ll.size()){
            ans.add(new ArrayList<>(ll));
            return;
        }

        for(int i=0; i<board.length; i++){
            if(i>0 && arr[i]==arr[i-1] && !board[i-1]){
                continue;
            }
            if(board[i]==false){
                ll.add(arr[i]);
                board[i]=true;
                permutations(arr,board,ll,ans);
                ll.remove(ll.size()-1);
                board[i]=false;
            }
           
        }
        
    }
}