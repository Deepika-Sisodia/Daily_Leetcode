// Last updated: 7/31/2025, 2:12:31 PM
class Solution {
    public boolean isPalindrome(int x) {
        int temp=x;
        int rev=0;
        while(x>0){
            int r = x%10;
            rev=rev*10+r;
            x=x/10;
        }
        if(rev==temp){
            return true;
        }
        else{
            return false;
        }
        
    }
}