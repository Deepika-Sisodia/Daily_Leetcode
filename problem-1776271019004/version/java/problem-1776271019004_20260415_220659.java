// Last updated: 4/15/2026, 10:06:59 PM
1class Solution {
2    public int closestTarget(String[] words, String target, int startIndex) {
3        int n = words.length;
4        int min = Integer.MAX_VALUE;
5
6        for(int i=0; i<n; i++){
7            if(words[i].equals(target)){
8                int diff = Math.abs(startIndex-i);
9                int dist = Math.min(diff, n-diff);
10                min = Math.min(min,dist);
11            }
12        }
13
14        return min == Integer.MAX_VALUE ? -1 : min;
15    }
16}