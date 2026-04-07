// Last updated: 4/7/2026, 11:50:48 AM
1class Solution {
2    public int mirrorFrequency(String s) {
3        int[] letters = new int[26];
4        int[] digit = new int[10];
5        for(char ch : s.toCharArray()){
6            if(Character.isDigit(ch)){
7                digit[ch-'0']++;
8            }
9            else{
10                letters[ch-'a']++;
11            }
12        }
13        int ans = 0;
14
15        for(int i=0; i<26; i++){
16            int j = 25-i;
17            if(i>j) break;
18            if(i==j) continue;
19            ans += Math.abs(letters[i]-letters[j]);
20        }
21
22        for(int i=0; i<10; i++){
23            int j = 9-i;
24            if(i>j) break;
25            if(i==j) continue;
26            ans += Math.abs(digit[i]-digit[j]);
27        }
28
29        return ans;
30    }
31
32}