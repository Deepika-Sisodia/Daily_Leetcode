// Last updated: 7/31/2025, 2:10:17 PM
class Solution {
    public int maximumGap(int[] nums) {
        Arrays.sort(nums);
        int diff=0;
        int i=0;
        int c=0;
        while(i<nums.length-1){
            c=nums[i+1]-nums[i];
            i++;
            if(c>diff){
                diff=c;
            }
        }
        return diff;
    }
}