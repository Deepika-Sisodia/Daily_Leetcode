// Last updated: 3/3/2026, 4:00:07 PM
1class Solution {
2    public int longestPalindrome(String s) {
3        int[] freq = new int[128];
4
5        for(char ch : s.toCharArray()){
6            freq[ch]++;
7        }
8
9        int len = 0;
10        boolean hasOdd = false;
11        for(int i=0; i<128; i++){
12            if(freq[i]%2==0){
13                len += freq[i];
14            }
15            else{
16                len += freq[i]-1;
17                hasOdd = true;
18            }
19        }
20
21        if(hasOdd) len++;
22
23        return len;
24    }
25}