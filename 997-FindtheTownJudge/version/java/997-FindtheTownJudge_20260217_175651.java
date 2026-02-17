// Last updated: 2/17/2026, 5:56:51 PM
1class Solution {
2    public int findJudge(int n, int[][] trust) {
3        int[] score = new int[n+1];
4        for(int[] t: trust){
5            score[t[0]]--;
6            score[t[1]]++;
7        }
8
9        for(int i=1; i<=n; i++){
10            if(score[i]==n-1){
11                return i;
12            }
13        }
14        return -1;
15    }
16}