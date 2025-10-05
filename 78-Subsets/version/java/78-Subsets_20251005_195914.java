// Last updated: 10/5/2025, 7:59:14 PM
class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ll = new ArrayList<>();
        sets(nums,0,ll,ans);
        return ans;
    }

    public void sets(int[] arr, int idx,List<Integer> ll, List<List<Integer>> ans){
        ans.add(new ArrayList<>(ll));

        for(int i=idx; i<arr.length; i++){
            ll.add(arr[i]);
            sets(arr,i+1,ll,ans);
            ll.remove(ll.size()-1);
        }
    }

}