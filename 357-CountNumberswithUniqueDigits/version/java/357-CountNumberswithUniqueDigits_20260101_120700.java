// Last updated: 1/1/2026, 12:07:00 PM
1class Solution {
2    public int countNumbersWithUniqueDigits(int n) {
3        return count(n);
4    }
5
6    public int count(int n){
7        if(n==0){
8            return 1;
9        }
10        int total = 10;
11        int unique = 9;
12        int available = 9;
13
14        for(int i=2; i<=n; i++){
15            unique = unique*available;
16            total = total + unique;
17            available--;
18        }
19
20        return total;
21    }
22}