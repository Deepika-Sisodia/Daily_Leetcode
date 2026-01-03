// Last updated: 1/3/2026, 9:34:30 PM
1class Solution {
2    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
3        Queue<Pair> q = new LinkedList<>();
4        q.add(new Pair(beginWord,1));
5
6        HashSet<String> set = new HashSet<>();
7        int len = wordList.size();
8        for(int i=0; i<len; i++){
9            set.add(wordList.get(i));
10        }
11       
12
13        while(!q.isEmpty()){
14            String st = q.peek().word;
15            int steps = q.peek().level;
16
17            q.remove();
18
19            if(st.equals(endWord)) return steps;
20
21            for(int i=0; i<st.length(); i++){
22                for(char ch='a'; ch<='z'; ch++){
23                    char[] replacedArray = st.toCharArray();
24                    replacedArray[i] = ch;
25                    String replacedWord = new String(replacedArray);
26                    if(set.contains(replacedWord)){
27                        set.remove(replacedWord);
28                        q.add(new Pair(replacedWord,steps+1));
29                    }
30                }
31            }
32        }
33        return 0;
34    }
35    class Pair{
36        String word;
37        int level;
38        Pair(String word, int level){
39            this.word = word;
40            this.level = level;
41        }
42    }
43}