// Last updated: 10/8/2025, 7:51:08 PM
class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();
        int[] range = {1,2,3,4,5,6,7,8,9};
        combination(range,n,k,0,new ArrayList<>(),ans);
        return ans;

    }

    public static void combination(int[] range, int n, int k, int start, List<Integer> ll,List<List<Integer>> ans){
        if(n==0 && ll.size()==k){
            ans.add(new ArrayList<>(ll));
            return;
        }
        
        for(int i=start; i<range.length; i++){
            ll.add(range[i]);
            combination(range,n-range[i],k,i+1,ll,ans);
            ll.remove(ll.size()-1);
        }
    }
}