// Last updated: 12/21/2025, 4:22:27 PM
1class Solution {
2    public String largestTimeFromDigits(int[] arr) {
3        
4        int[] count = new int[10];
5        for(int i: arr){
6            count[i]++;
7        }
8
9        for(int i=23; i>=0; i--){
10            for(int j=59; j>=0; j--){
11                int[] temp = new int[10];
12
13                temp[i/10]++;
14                temp[i%10]++;
15                temp[j/10]++;
16                temp[j%10]++;
17
18                if(matches(count,temp)){
19                    return String.format("%02d:%02d", i, j);
20                }
21            }
22        }
23
24        return "";
25    }
26
27    public static boolean matches(int[] count, int[] temp){
28        for(int i=0; i<10; i++){
29            if(count[i]!=temp[i]){
30                return false;
31            }
32        }
33
34        return true;
35    }
36}