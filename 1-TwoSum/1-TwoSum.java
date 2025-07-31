// Last updated: 7/31/2025, 2:12:40 PM
class Solution {
    public int[] twoSum(int[] nums, int target) {
        return two_sums(nums,target);
        
    }
    public static int[] two_sums(int[] arr,int target){ 
        int n = arr.length;
		HashMap<Integer, Integer> map = new HashMap<>();
        int[] ans = new int[2];
        for(int i=0; i<n; i++){
            if(map.containsKey(target-arr[i])){
                ans[1]=i;
                ans[0]=map.get(target-arr[i]);
                return ans;
            }
            map.put(arr[i],i);
        }
        return ans;
	}
        
}