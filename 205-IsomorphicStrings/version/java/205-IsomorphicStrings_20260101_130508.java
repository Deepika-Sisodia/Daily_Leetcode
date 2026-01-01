// Last updated: 1/1/2026, 1:05:08 PM
1class Solution {
2    public boolean isIsomorphic(String s, String t) {
3        if(s.length()!=t.length()){
4            return false;
5        }
6
7        HashMap<Character, Character> map1 = new HashMap<>();
8        HashMap<Character, Character> map2 = new HashMap<>();
9
10        for(int i=0; i<s.length(); i++){
11            char c1 = s.charAt(i);
12            char c2 = t.charAt(i);
13            
14            if(map1.containsKey(c1)){
15                if(map1.get(c1)!=c2){
16                    return false;
17                }
18            }
19            else{
20                map1.put(c1,c2);
21            }
22
23            if(map2.containsKey(c2)){
24                if(map2.get(c2)!=c1){
25                    return false;
26                }
27            }
28            else{
29                map2.put(c2,c1);
30            }
31        }
32        
33
34        return true;
35    }
36}