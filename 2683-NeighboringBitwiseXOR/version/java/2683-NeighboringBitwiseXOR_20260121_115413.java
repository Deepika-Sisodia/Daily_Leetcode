// Last updated: 1/21/2026, 11:54:13 AM
1class Solution {
2    public int xorAllNums(int[] nums1, int[] nums2) {
3        return all_pairing(nums1, nums2);
4    }
5    public static int all_pairing(int[] nums1, int[] nums2){
6        int n = nums1.length;
7        int m = nums2.length;
8        if(n%2==0 & m%2==0){
9            return 0;
10        }
11        int xor1 = Bitwise_XOR(nums1);
12        int xor2 = Bitwise_XOR(nums2);
13        if(n%2==1 & m%2==1){
14            return xor1^xor2;
15        }
16        else if(n%2==1){
17            return xor2;
18        }
19        else{
20            return xor1;
21        }
22    }
23
24    public static int Bitwise_XOR(int[] arr){
25        int xor = 0;
26        for(int v: arr){
27            xor ^= v;
28        }
29
30        return xor;
31    }
32}