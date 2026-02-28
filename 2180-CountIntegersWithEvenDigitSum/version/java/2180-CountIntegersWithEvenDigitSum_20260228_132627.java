// Last updated: 2/28/2026, 1:26:27 PM
1class Solution {
2    public int countEven(int num) {
3        int count = 0;
4        for(int i=2; i<=num; i++){
5            int n = i;
6            int sum = 0;
7            while(n>0){
8                int rem = n%10;
9                sum += rem;
10                n/=10;
11            }
12
13            if(sum%2==0){
14                count++;
15            }
16        }
17
18        return count;
19    }
20}