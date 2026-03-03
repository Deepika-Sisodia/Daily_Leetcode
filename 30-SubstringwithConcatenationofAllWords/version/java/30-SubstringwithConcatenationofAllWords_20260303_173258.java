// Last updated: 3/3/2026, 5:32:58 PM
1class Solution {
2    public List<String> findAllConcatenatedWordsInADict(String[] words) {
3        Set<String> set = new HashSet<>(Arrays.asList(words));
4        List<String> res = new ArrayList<>();
5
6        for(int i=0; i<words.length; i++){
7            set.remove(words[i]);
8
9            Map<String, Boolean> map = new HashMap<>();
10
11            if(isConcatenated(words[i],set,map)){
12                res.add(words[i]);
13            }
14            set.add(words[i]);
15        }
16
17        return res;
18    }
19
20    public boolean isConcatenated(String word, Set<String> set, Map<String, Boolean> map){
21        if(word.length()==0){
22            return false;
23        }
24
25        if(map.containsKey(word)){
26            return map.get(word);
27        }
28
29        for(int i=1; i<word.length(); i++){
30            String prefix = word.substring(0,i);
31            String suffix = word.substring(i);
32
33            if(set.contains(prefix)){
34                if(set.contains(suffix) || isConcatenated(suffix,set,map)){
35                    map.put(word,true);
36                    return true;
37                }
38            }
39        }
40
41        map.put(word,false);
42        return false;
43    }
44}