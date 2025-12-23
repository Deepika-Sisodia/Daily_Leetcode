// Last updated: 12/23/2025, 1:13:22 PM
1class Solution {
2    public int numWays(String s) {
3        final long MOD = 1_000_000_007L;
4        int n = s.length();
5        int c = 0;
6        for(int i=0; i<s.length(); i++){
7            if(s.charAt(i)=='1'){
8                c++;
9            }
10        }
11        if(c%3!=0){
12            return 0;
13        }
14
15        if(c==0){
16            long ways = (long) (n-1)*(n-2)/2;
17            return (int) (ways%MOD);
18        }
19
20        int k = c/3; 
21        int countOnes = 0;
22        int z1=0, z2=0;
23
24        for(int i=0; i<s.length(); i++){
25            if(s.charAt(i)=='1'){
26                countOnes++;
27            }
28            else{
29                if(countOnes==k){
30                    z1++;
31                }
32                else if(countOnes==2*k){
33                    z2++;
34                }
35            }
36        }
37
38        return (int) (((long)(z1+1)*(z2+1))%MOD);
39    }
40}