// Last updated: 3/10/2026, 3:46:47 PM
1class Solution {
2    public int compress(char[] chars) {
3        int i = 0;
4        int idx = 0;
5        while(i<chars.length){
6            char curr = chars[i];
7            int count = 0;
8            while(i<chars.length && curr == chars[i]){
9                count++;
10                i++;
11            }
12            chars[idx++] = curr;
13
14            if(count>1){
15                String num = Integer.toString(count);
16                for(char ch: num.toCharArray()){
17                    chars[idx++] = ch;
18                }
19            }
20        }
21
22        return idx;
23    }
24}