// Last updated: 4/11/2026, 8:20:51 PM
1class Solution {
2    public int countDigitOccurrences(int[] nums, int digit) {
3        int n = nums.length;
4        int c = 0;
5        
6        for(int i=0; i<n; i++){
7            int num = nums[i];
8            while(num>0){
9                int rem = num % 10;
10                if(rem == digit){
11                    c++;
12                }
13                num /= 10;
14            }
15        }
16
17        return c;
18        
19    }
20}