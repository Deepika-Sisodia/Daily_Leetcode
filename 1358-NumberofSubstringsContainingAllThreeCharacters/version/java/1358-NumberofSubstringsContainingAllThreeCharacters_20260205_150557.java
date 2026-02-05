// Last updated: 2/5/2026, 3:05:57 PM
1class Solution {
2    public int numberOfSubstrings(String s) {
3        int n = s.length();
4        int[] freq = new int[3];
5        int l = 0;
6        int ans = 0;
7
8        for(int r=0; r<n; r++){
9            freq[s.charAt(r)-'a']++;
10
11            while(freq[0]>0 && freq[1]>0 && freq[2]>0){
12                ans += (n-r);
13                freq[s.charAt(l)-'a']--;
14                l++;
15            }
16        }
17
18        return ans;
19    }
20}