// Last updated: 7/31/2025, 2:12:30 PM
class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length-1;
        int current_area=0;
        int max_area=0;

        while(left<right){
            current_area = Math.min(height[left],height[right])*(right-left);
            max_area = Math.max(max_area,current_area);

            if(height[left]<height[right]){
                left+=1;
            }
            else{
                right-=1;
            }

        }
        return max_area;
        
    }
}