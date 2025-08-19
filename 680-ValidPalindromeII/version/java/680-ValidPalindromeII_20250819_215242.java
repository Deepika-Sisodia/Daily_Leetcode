// Last updated: 8/19/2025, 9:52:42 PM
class Solution {
    public boolean validPalindrome(String s) {
        int left = 0;
        int right = s.length()-1;

        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                return check(s,left+1,right) || check(s,left,right-1);
            }
            left++;
            right--;
        }

        return true;
    }

    public boolean check(String s, int i, int j){
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}