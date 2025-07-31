// Last updated: 7/31/2025, 2:11:53 PM
class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates);
        Combination(candidates,0,target,result,new ArrayList<> ());
        return result;
        
    }
    public static void Combination(int[] arr, int idx, int target, List<List<Integer>> result,List<Integer> ll){
        if(target==0){
            result.add(new ArrayList<>(ll));
            return;
        }
        for(int i=idx; i<arr.length; i++) {
			if(i>idx && arr[i]==arr[i-1]){
                continue;
            } 
            if(target<arr[i]){
                break;
            }
			ll.add(arr[i]);
			Combination(arr,i+1,target-arr[i],result,ll);
			ll.remove(ll.size()-1);
		}

    }
}