// Last updated: 7/31/2025, 2:09:55 PM
class Solution {
    public int rangeBitwiseAnd(int left, int right) {
        while(right>left){
            right = right & right-1;
        }

        return left&right;
        
    }
}