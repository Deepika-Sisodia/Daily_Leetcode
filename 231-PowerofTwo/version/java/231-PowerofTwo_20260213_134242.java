// Last updated: 2/13/2026, 1:42:42 PM
1class Solution {
2    public boolean isPowerOfTwo(int n) {
3        if(n<=0) return false;
4        if((n&(n-1))==0){
5            return true;
6        }
7
8        return false;
9    }
10}