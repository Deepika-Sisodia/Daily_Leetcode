// Last updated: 12/20/2025, 11:09:00 AM
1class Solution {
2    public String longestWord(String[] words) {
3        Arrays.sort(words);
4       
5        HashSet<String> set = new HashSet<>();
6
7        String ans = "";
8        set.add(ans);
9
10        for(String i : words){
11            String s = i.substring(0,i.length()-1);
12            if(set.contains(s)){
13                set.add(i);
14
15                if(i.length()>ans.length()){
16                    ans = i;
17                }
18            }
19        }
20
21        return ans;
22    }
23}