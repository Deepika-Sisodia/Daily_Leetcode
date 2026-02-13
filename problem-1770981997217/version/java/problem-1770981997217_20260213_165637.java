// Last updated: 2/13/2026, 4:56:37 PM
1class Solution {
2    public int[] singleNumber(int[] nums) {
3        int n = nums.length;
4        int XOR = 0;
5
6        for(int i=0; i<n; i++){
7            XOR = XOR ^ nums[i];
8        }
9
10        int rightmost = (XOR & XOR-1) ^ XOR;
11        int b1 = 0, b2 = 0;
12        for(int i=0; i<n; i++){
13            if((nums[i] & rightmost) != 0){
14                b1 = b1 ^ nums[i];
15            }
16            else{
17                b2 = b2 ^ nums[i];
18            }
19        }
20
21        return new int[]{b1,b2};
22    }
23}