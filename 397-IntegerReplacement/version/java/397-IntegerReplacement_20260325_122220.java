// Last updated: 3/25/2026, 12:22:20 PM
1class Solution {
2    public int integerReplacement(int n) {
3        return func((long)n);
4    }
5
6    public int func(long n){
7        if(n==1){
8            return 0;
9        }
10        if(n<1){
11            return Integer.MAX_VALUE;
12        }
13
14        int even = Integer.MAX_VALUE;
15        int odd = Integer.MAX_VALUE;
16
17        if(n%2==0){
18            even = 1 + func(n/2);
19        }
20        else{
21            int a = func(n-1);
22            int b = func(n+1);
23            odd = 1 + Math.min(a,b);
24        }
25
26        return Math.min(even,odd);
27    }
28
29}