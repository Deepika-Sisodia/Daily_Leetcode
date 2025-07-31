// Last updated: 7/31/2025, 2:09:38 PM
class Solution {
    public int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        int area1 = (ax2-ax1)*(ay2-ay1);
        int area2 = (bx2-bx1)*(by2-by1);
        int left = Math.max(ax1,bx1);
        int right = Math.min(ax2,bx2);
        int bottom = Math.max(ay1,by1);
        int top = Math.min(ay2,by2);
        int common=0;
        if(right>left && top>bottom){
            common = (right-left)*(top-bottom);
        }
        return area1+area2-common;
        
    }
}