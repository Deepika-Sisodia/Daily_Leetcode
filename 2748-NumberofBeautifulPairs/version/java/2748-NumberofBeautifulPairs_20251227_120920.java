// Last updated: 12/27/2025, 12:09:20 PM
1class Solution {
2    public int countBeautifulPairs(int[] nums) {
3        int c=0;
4        for(int i=0; i<nums.length; i++){
5            int first = firstDigit(nums[i]);
6            for(int j=i+1; j<nums.length; j++){
7                int second = nums[j]%10;
8                if(areCoprimes(first,second)){
9                    c++;
10                }
11            }
12        }
13
14        return c;
15    }
16
17    public static boolean areCoprimes(int a, int b){
18        while(b!=0){
19            int temp = b;
20            b = a%b;
21            a = temp;
22        }
23        return a==1;
24    }
25
26    public static int firstDigit(int n){
27        while(n>=10){
28            n=n/10;
29        }
30        return n;
31    }
32}