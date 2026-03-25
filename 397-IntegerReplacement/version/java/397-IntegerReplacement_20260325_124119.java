// Last updated: 3/25/2026, 12:41:19 PM
1class Solution {
2    public int integerReplacement(int n) {
3        long num = n;
4        int steps = 0;
5
6        while(num != 1){
7            if(num % 2 == 0){
8                num = num/2;
9            }
10            else if(num==3 || num%4==1){
11                num--;
12            }
13            else{
14                num++;
15            }
16            steps++;
17        }
18
19        return steps;
20    }
21}