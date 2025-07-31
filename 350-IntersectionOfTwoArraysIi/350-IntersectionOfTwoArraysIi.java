// Last updated: 7/31/2025, 2:09:00 PM
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i : nums1){
            map.put(i,map.getOrDefault(i,0)+1);
        }

        List<Integer> ll = new ArrayList<>();

        for(int i : nums2){
            if(map.containsKey(i) && map.get(i)>0){
                ll.add(i);
                map.put(i,map.get(i)-1);
            }
        }

        int[] ans = new int[ll.size()];
        for(int i=0; i<ll.size(); i++){
            ans[i]=ll.get(i);
        }

        return ans;
    }
}