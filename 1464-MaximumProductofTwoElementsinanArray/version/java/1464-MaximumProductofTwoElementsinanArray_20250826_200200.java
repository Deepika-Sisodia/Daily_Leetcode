// Last updated: 8/26/2025, 8:02:00 PM
class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for(int i=0; i<n ; i++){
            pq.add(nums[i]);
        }

        int a = pq.remove();
        int b = pq.remove();

        return (a-1)*(b-1);
    }
}