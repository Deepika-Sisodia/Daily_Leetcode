// Last updated: 2/14/2026, 9:51:00 PM
1class Solution {
2    public int[] countBits(int n) {
3        int[] ans = new int[n+1];
4        for(int i=0; i<=n; i++){
5            int num = i;
6            int c = 0;
7            while(num>0){
8                int rem = num%2;
9                if(rem==1){
10                    c++;
11                }
12                num /= 2;
13            }
14            ans[i] = c;
15        }
16
17        return ans;
18    }
19}