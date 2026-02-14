// Last updated: 2/14/2026, 9:54:29 PM
1class Solution {
2    public int[] countBits(int n) {
3        int[] ans = new int[n+1];
4        for(int i=0; i<=n; i++){
5            int num = i;
6            int c = 0;
7            while(num>1){
8                c += num&1;
9                num = num>>1;
10            }
11            if(num==1) c++;
12            ans[i] = c;
13        }
14
15        return ans;
16    }
17}