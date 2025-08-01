// Last updated: 8/1/2025, 6:50:29 PM
class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int n = nums.size();
        int minSum = Integer.MAX_VALUE;

        for (int len = l; len <= r; len++) {
            int sum = 0;

            for (int i = 0; i < len; i++) {
                sum += nums.get(i);
            }

            if (sum > 0) minSum = Math.min(minSum, sum);

            for (int i = len; i < n; i++) {
                sum += nums.get(i) - nums.get(i - len);
                if (sum > 0) minSum = Math.min(minSum, sum);
            }
        }

        return (minSum == Integer.MAX_VALUE) ? -1 : minSum;
    }
}