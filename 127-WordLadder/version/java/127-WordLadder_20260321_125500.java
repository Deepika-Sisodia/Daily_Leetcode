// Last updated: 3/21/2026, 12:55:00 PM
1class Solution {
2    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
3        if(!wordList.contains(endWord)) return 0;
4
5        Set<String> set = new HashSet<>();
6        for(int i=0; i<wordList.size(); i++){
7            set.add(wordList.get(i));
8        }
9
10        Queue<Pair> q = new LinkedList<>();
11        q.add(new Pair(beginWord,1));
12
13        while(!q.isEmpty()){
14            Pair curr = q.poll();
15            String currWord = curr.word;
16            int steps = curr.level;
17
18            if(currWord.equals(endWord)) return steps;
19
20            for(int i=0; i<currWord.length(); i++){
21                for(char ch='a'; ch<='z'; ch++){
22                    char[] arr = currWord.toCharArray();
23                    arr[i] = ch;
24                    String replaced = new String(arr);
25                    if(set.contains(replaced)){
26                        set.remove(replaced);
27                        q.add(new Pair(replaced,steps+1));
28                    }
29                }
30            }
31
32        }
33        return 0;
34    }
35
36    class Pair{
37        String word;
38        int level;
39        Pair(String word, int level){
40            this.word = word;
41            this.level = level;
42        }
43    }
44}