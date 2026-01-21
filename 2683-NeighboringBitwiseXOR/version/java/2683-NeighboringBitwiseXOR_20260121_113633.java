// Last updated: 1/21/2026, 11:36:33 AM
1class Solution {
2    public boolean doesValidArrayExist(int[] derived) {
3        return doesValid(derived);
4    }
5    public static boolean doesValid(int[] arr){
6        int xor = 0;
7        for(int v: arr){
8            xor ^= v;
9        }
10
11        return xor==0;
12    }
13}