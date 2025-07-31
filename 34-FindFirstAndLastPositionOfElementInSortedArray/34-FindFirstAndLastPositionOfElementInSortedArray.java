// Last updated: 7/31/2025, 2:12:01 PM
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = {-1,-1};
        int start = search(nums,target,true);
        int end = search(nums,target,false);
        ans[0]=start;
        ans[1]=end;
        return ans;
    }

    public static int search(int[] nums, int target, boolean findstart){
        int s = 0;
        int e = nums.length-1;
        int ans = -1;
        while(s<=e) {
			int mid = s+(e-s)/2;
			if(nums[mid]==target) {
				ans = mid;
                if(findstart==true){
                    e = mid-1;
                }
                else{
                   s = mid+1; 
                }
			}
			else if(target>nums[mid]) {
				s = mid+1;
			}
			else {
				e = mid-1;
			}
        }
        return ans;
    }
}
