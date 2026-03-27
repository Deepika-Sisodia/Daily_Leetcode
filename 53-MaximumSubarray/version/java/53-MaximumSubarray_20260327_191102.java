// Last updated: 3/27/2026, 7:11:02 PM
1class Solution {
2    public boolean isAnagram(String s, String t) {
3        if(s.length() != t.length()){
4            return false;
5        }
6
7        int[] freq1 = new int[26];
8        int[] freq2 = new int[26];
9        for(int i=0; i<s.length(); i++){
10            freq1[s.charAt(i) - 'a']++;
11            freq2[t.charAt(i) - 'a']++;
12        }
13
14        if(Arrays.equals(freq1,freq2)){
15            return true;
16        }
17        return false;
18    }
19}