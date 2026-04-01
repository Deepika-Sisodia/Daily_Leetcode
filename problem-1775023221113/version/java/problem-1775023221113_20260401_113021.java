// Last updated: 4/1/2026, 11:30:21 AM
1class Solution {
2    public int minimumSwap(String s1, String s2) {
3        int xy = 0, yx = 0;
4        for(int i=0; i<s1.length(); i++){
5            if(s1.charAt(i) == 'x' && s2.charAt(i)=='y') xy++;
6            else if(s1.charAt(i)=='y' && s2.charAt(i)=='x') yx++;
7        }
8
9        if((xy+yx) % 2 != 0) return -1;
10
11        return (xy/2) + (yx/2) + (xy%2) * 2;
12    }
13}