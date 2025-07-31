// Last updated: 7/31/2025, 2:11:18 PM
class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Subsets(nums,0, new ArrayList<>(),ans);
        return ans;
    }
    public static void Subsets(int[] arr, int idx, List<Integer> ll, List<List<Integer>> ans){
        if(arr.length==idx){
            ans.add(new ArrayList<>(ll));
            return;
        }
        ll.add(arr[idx]);
        Subsets(arr,idx+1,ll,ans);
        ll.remove(ll.size()-1);
        Subsets(arr,idx+1,ll,ans);
    }
}