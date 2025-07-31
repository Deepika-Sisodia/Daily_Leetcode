// Last updated: 7/31/2025, 2:11:56 PM
class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
		List<Integer> ll = new ArrayList<>();
		combination(candidates,target,ll,0,ans);
		return ans;

	}
	
	public static void combination(int[] coin, int target, List<Integer> ll, int idx, List<List<Integer>> ans) {
		if(target==0) {
			ans.add(new ArrayList<>(ll));
			return;
		}
		for(int i=idx; i<coin.length; i++) {
			if(target>=coin[i]) {
				ll.add(coin[i]);
				combination(coin,target-coin[i],ll,i,ans);
				ll.remove(ll.size()-1);
			}
		}
    }
}