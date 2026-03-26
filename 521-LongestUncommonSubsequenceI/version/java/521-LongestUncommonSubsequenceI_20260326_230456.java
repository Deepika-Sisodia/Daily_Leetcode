// Last updated: 3/26/2026, 11:04:56 PM
1class Solution {
2    public int findLUSlength(String a, String b) {
3        if(a.equals(b)) return -1;
4
5        return Math.max(a.length(), b.length());
6    }
7}