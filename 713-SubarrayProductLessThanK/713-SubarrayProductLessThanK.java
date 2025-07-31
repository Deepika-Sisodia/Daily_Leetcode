// Last updated: 7/31/2025, 2:08:03 PM
class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        return Product_less_than_k(nums,k);
        
    }

    public static int Product_less_than_k(int[] nums, int k){
        int ans=0, si=0, ei=0, p=1;
        while(ei<nums.length){
            p=p*nums[ei];
            while(p>=k && si<=ei){
                p=p/nums[si];
                si++;
            }
            ans = ans+(ei-si+1);
            ei++;
        }
        return ans;
        
    }
}