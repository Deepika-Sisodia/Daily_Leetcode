// Last updated: 10/8/2025, 8:09:05 PM
class Solution {
    public List<List<Integer>> combine(int n, int k) {
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = i+1;
        }

        List<Integer> ll = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        combinations(arr,k,ll,ans,0);
        return ans;
    }

    public void combinations(int[] arr, int k,List<Integer> ll, List<List<Integer>> ans, int idx){
        if(ll.size()==k){
            ans.add(new ArrayList<>(ll));
            return;
        }

        for(int i=idx; i<arr.length; i++){
            ll.add(arr[i]);
            combinations(arr,k,ll,ans,i+1);
            ll.remove(ll.size()-1);
        }
    }
}