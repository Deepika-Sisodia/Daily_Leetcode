// Last updated: 7/31/2025, 2:06:18 PM
class Solution {
    public int countHillValley(int[] nums) {
        int n = nums.length;
        int[] b = new int[n];
        int m = 0;
        b[m++] = nums[0];
        for (int i = 1; i < n; i++) {
            if (nums[i] != b[m - 1]) b[m++] = nums[i];
        }

        int ans = 0;
        for (int i = 1; i < m - 1; i++) {
            if ((b[i] > b[i - 1] && b[i] > b[i + 1]) ||
                (b[i] < b[i - 1] && b[i] < b[i + 1])) {
                ans++;
            }
        }
        return ans;
    }
}