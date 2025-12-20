// Last updated: 12/20/2025, 9:36:35 PM
1class Solution {
2    public boolean isLongPressedName(String name, String typed) {
3        if(name.length()>typed.length()){
4            return false;
5        }
6
7        int i=0, j=0;
8        while(j<typed.length()){
9            if(i<name.length() && name.charAt(i)==typed.charAt(j)){
10                i++;
11            }
12            else if(j==0 || typed.charAt(j-1)!=typed.charAt(j)){
13                return false;
14            }
15            j++;
16        }
17
18        return i==name.length();
19
20    }
21}