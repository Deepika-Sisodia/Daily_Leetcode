// Last updated: 3/3/2026, 3:28:35 PM
1class Solution {
2    public int firstUniqChar(String s) {
3        int[] freq = new int[26];
4        for(int i=0; i<s.length(); i++){
5            int ch = s.charAt(i)-'a';
6            freq[ch]++;
7        }
8
9        for(int i=0; i<s.length(); i++){
10            int ch = s.charAt(i)-'a';
11            if(freq[ch]==1){
12                return i;
13            }
14        }
15
16        return -1;
17    }
18}