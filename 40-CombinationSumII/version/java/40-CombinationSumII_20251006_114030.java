// Last updated: 10/6/2025, 11:40:30 AM
class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<Integer> ll = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);
        combination(candidates,target,0,ll,ans);
        return ans;
    }

    public void combination(int[] arr, int target, int idx,List<Integer> ll, List<List<Integer>> ans){
        if(target==0){
            ans.add(new ArrayList<>(ll));
        }
        for(int i=idx; i<arr.length; i++){
            if(target>=arr[i]){
                if(i>idx && arr[i]==arr[i-1]) continue;
                ll.add(arr[i]);
                combination(arr,target-arr[i],i+1,ll,ans);
                ll.remove(ll.size()-1);
            }
        }
    }
}