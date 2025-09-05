// Last updated: 9/5/2025, 7:02:19 PM
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> h1 = new HashSet<>();
        for(int i: nums1){
            h1.add(i);
        }

        Set<Integer> result = new HashSet<>();

        Set<Integer> h2 = new HashSet<>();
        for(int i: nums2){
            if(h1.contains(i)){
                result.add(i);
            }
        }

        int[] ans = new int[result.size()];
        int idx = 0;
        for(int i: result){
            ans[idx++]=i;
        }

        return ans;
        
    }
}