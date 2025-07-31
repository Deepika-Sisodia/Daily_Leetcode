// Last updated: 7/31/2025, 2:07:38 PM
class Solution {
    public boolean isMonotonic(int[] nums) {
        return is_Monotonic(nums);
        
    }

    public static boolean is_Monotonic(int[] nums) {
        boolean increasing = true;
        boolean decreasing = true;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                decreasing = false;
            }
            if (nums[i] < nums[i - 1]) {
                increasing = false;
            }
        }

        return increasing || decreasing;
    
        
    }
}