// Last updated: 7/31/2025, 2:07:00 PM
class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for (int i=0; i<nums.length; i++){
            if(check(nums[i])){
                count++;
            }
        }
        return count;
    }

    public static boolean check(int n){
        // int c = 0;
        // while(n>0){
        //     c++;
        //     n/=10;
        // }
        int c = (int)(Math.log10(n)) + 1;
        if(c%2==0){
            return true;
        }
        return false;
    }
}