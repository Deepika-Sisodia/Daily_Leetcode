// Last updated: 4/7/2026, 11:34:24 AM
1class Solution {
2    public int mirrorFrequency(String s) {
3        HashMap<Character,Integer> map = new HashMap<>();
4        for(int i=0; i<s.length(); i++){
5            char ch = s.charAt(i);
6            map.put(ch, map.getOrDefault(ch,0)+1);
7        }
8
9        HashSet<Character> set = new HashSet<>();
10        int ans = 0;
11
12        for(char ch: map.keySet()){
13            if(set.contains(ch)) continue;
14
15            char m = getMirror(ch);
16            int freq1 = map.getOrDefault(ch,0);
17            int freq2 = map.getOrDefault(m,0);
18
19            ans += Math.abs(freq1-freq2);
20
21            set.add(ch);
22            set.add(m);
23        }
24
25        return ans;
26    }
27
28    public char getMirror(char ch){
29        if(Character.isDigit(ch)){
30            return (char) ('9' - (ch - '0'));
31        }
32        else{
33            return (char) ('z' - (ch - 'a'));
34        }
35    }
36}