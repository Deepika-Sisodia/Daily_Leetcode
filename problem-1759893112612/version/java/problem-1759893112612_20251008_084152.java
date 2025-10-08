// Last updated: 10/8/2025, 8:41:52 AM
class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int n = nums.length;
        Arrays.sort(nums);
        int ans = nums[0]+nums[1]+nums[2];
        for(int i=0; i<n-2; i++){
            int l = i+1;
            int r = n-1;
            while(l<r){
                int sum = nums[i]+nums[l]+nums[r];
                if(Math.abs(ans-target) > Math.abs(sum-target)){
                    ans = sum;
                }

                if(target>sum){
                    l++;
                }
                else if (target<sum){
                    r--;
                }
                else{
                    return sum;
                }
            }
        }
        return ans;
    }

}