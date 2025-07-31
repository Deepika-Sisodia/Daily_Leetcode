// Last updated: 7/31/2025, 2:11:02 PM
class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        Subsets(nums,0, new ArrayList<>(),ans);
        return ans;
    }
    public static void Subsets(int[] arr, int idx, List<Integer> ll, List<List<Integer>> ans){
        ans.add(new ArrayList<>(ll));
        for(int i=idx; i<arr.length; i++){
            if(i>idx && arr[i]==arr[i-1]) continue;
            ll.add(arr[i]);
            Subsets(arr,i+1,ll,ans);
            ll.remove(ll.size()-1);
        }
    }
}