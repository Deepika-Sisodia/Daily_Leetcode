// Last updated: 1/15/2026, 9:47:57 PM
1class Solution {
2    public int minimumNumbers(int num, int k) {
3        if(num==0) return 0;
4
5        for(int i=1; i<=10 && i*k<=num; i++){
6            if((num-i*k)>=0 && (num-i*k)%10==0){
7                return i;
8            }
9        }
10        return -1;
11    }
12}