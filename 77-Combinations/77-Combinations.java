// Last updated: 7/31/2025, 2:11:20 PM
class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        combination(n,k,1,new ArrayList<>(),ans);
        return ans;

    }

    public static void combination(int n, int k, int start, List<Integer> ll,List<List<Integer>> ans){
        if(ll.size()==k){
            ans.add(new ArrayList<>(ll));
            return;
        }
        
        for(int i=start; i<=n; i++){
            ll.add(i);
            combination(n,k,i+1,ll,ans);
            ll.remove(ll.size()-1);
        }
    }
}