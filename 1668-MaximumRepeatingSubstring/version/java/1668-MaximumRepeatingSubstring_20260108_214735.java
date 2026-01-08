// Last updated: 1/8/2026, 9:47:35 PM
1class Solution {
2    public int maxRepeating(String sequence, String word) {
3        int count = 0;
4        String s = word;
5
6        while(sequence.contains(s)){
7            count++;
8            s+=word;
9        }
10        return count;
11    }
12}
13
14