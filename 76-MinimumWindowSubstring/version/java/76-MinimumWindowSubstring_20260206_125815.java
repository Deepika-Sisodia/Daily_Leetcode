// Last updated: 2/6/2026, 12:58:15 PM
1class Solution {
2    public String minWindow(String s, String t) {
3        int n = s.length();
4        int m = t.length();
5        int minLen = Integer.MAX_VALUE;
6        int start = -1;
7
8        HashMap<Character,Integer> map = new HashMap<>();
9
10        for(int j=0; j<m; j++){
11            char ch = t.charAt(j);
12            map.put(ch, map.getOrDefault(ch,0)+1);
13        }
14        int cnt = 0;
15        int l = 0;
16        for(int r=0; r<n; r++){
17            if(map.containsKey(s.charAt(r))){
18                if(map.get(s.charAt(r))>0){
19                    cnt++;
20                }
21                
22                map.put(s.charAt(r), map.get(s.charAt(r))-1);
23            }
24
25            while(cnt==m){
26                if(r-l+1<minLen){
27                    minLen = r-l+1;
28                    start = l;
29                }
30
31                char lc = s.charAt(l);
32                if(map.containsKey(lc)){
33                    map.put(lc, map.get(lc) + 1);
34                    if(map.get(lc) > 0){
35                        cnt--;
36                    }
37                }
38                l++;
39            }
40 
41        }
42
43        if(start==-1) return "";
44
45        return s.substring(start,start+minLen);
46    }
47}