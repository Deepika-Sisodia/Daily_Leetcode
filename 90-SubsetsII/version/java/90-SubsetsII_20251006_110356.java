// Last updated: 10/6/2025, 11:03:56 AM
class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<Integer> ll = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        subsets(nums,0,ll,ans);
        return ans;
    }

    public void subsets(int[] arr, int idx, List<Integer> ll, List<List<Integer>> ans){
        ans.add(new ArrayList<>(ll));

        for(int i=idx; i<arr.length; i++){
            if(i>idx && arr[i]==arr[i-1]){
                continue;
            }
            ll.add(arr[i]);
            subsets(arr,i+1,ll,ans);
            ll.remove(ll.size()-1);
        }
    }
}