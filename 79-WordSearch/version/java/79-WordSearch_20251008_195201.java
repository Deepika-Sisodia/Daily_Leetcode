// Last updated: 10/8/2025, 7:52:01 PM
class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ll = new ArrayList<>();
        combination(arr,n,k,0,ans,ll);
        return ans;
    }

    public void combination(int[] arr, int n, int k, int idx,List<List<Integer>> ans,List<Integer> ll){
        if(n==0 && ll.size()==k){
            ans.add(new ArrayList<>(ll));
            return;
        }

        for(int i=idx; i<arr.length; i++){
            if(arr[i]<=n){
                ll.add(arr[i]);
                combination(arr,n-arr[i],k,i+1,ans,ll);
                ll.remove(ll.size()-1);
            }
        }
    }
}