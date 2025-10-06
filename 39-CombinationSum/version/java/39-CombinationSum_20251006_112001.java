// Last updated: 10/6/2025, 11:20:01 AM
class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> ll = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        combination(candidates,0,target,ll,ans);
        return ans;
    }

    public void combination(int[] arr, int idx, int target, List<Integer> ll, List<List<Integer>> ans){
        if(target==0){
            ans.add(new ArrayList<>(ll));
        }

        for(int i=idx; i<arr.length; i++){
            if(target>=0){
                ll.add(arr[i]);
                combination(arr,i,target-arr[i], ll, ans);
                ll.remove(ll.size()-1);
            }
            
        }
    }
}