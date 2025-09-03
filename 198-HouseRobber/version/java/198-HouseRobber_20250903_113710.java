// Last updated: 9/3/2025, 11:37:10 AM
class Solution {
    public int rob(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        if(nums.length==1){
            return nums[0];
        }
        int robExlast = rob(nums,0,nums.length-2);
        int robExfirst = rob(nums,1,nums.length-1);
        return Math.max(robExlast,robExfirst);

        
    }
    public static int rob(int[] nums, int start, int end){
        int p1=0;
        int p2=0;
        for(int i=start; i<=end; i++){
            int curr = Math.max(p1,p2+nums[i]);
            p2=p1;
            p1=curr;

        }
        return p1;
    }
}