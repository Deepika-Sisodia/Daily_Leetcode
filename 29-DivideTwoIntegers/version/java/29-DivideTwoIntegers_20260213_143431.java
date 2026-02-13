// Last updated: 2/13/2026, 2:34:31 PM
1class Solution {
2    public int divide(int dividend, int divisor) {
3        if(dividend==Integer.MIN_VALUE && divisor==-1){
4            return Integer.MAX_VALUE;
5        }
6
7        long dvd =  Math.abs((long) dividend);
8        long dvs =  Math.abs((long) divisor);
9
10        int res = 0;
11        while(dvd>=dvs){
12            long temp = dvs;
13            int mul = 1;
14            while(dvd >= (temp<<1)){
15                temp <<= 1;
16                mul <<= 1;
17            }
18            res += mul;
19            dvd -= temp;
20        }
21
22        if((dividend<0) ^ (divisor<0)){
23            res = -res;
24        }
25
26        return res;
27    }
28}