// Last updated: 1/21/2026, 12:10:58 PM
1class Solution {
2    public int getXORSum(int[] arr1, int[] arr2) {
3        int xor1 = 0;
4        int xor2 = 0;
5
6        for(int i : arr1){
7            xor1 ^= i;
8        }
9        for(int i: arr2){
10            xor2 ^= i;
11        }
12
13        return xor1&xor2;
14    }
15}