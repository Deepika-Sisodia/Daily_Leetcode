// Last updated: 1/21/2026, 12:37:12 PM
1class Solution {
2    public int minimizeXor(int num1, int num2) {
3        return find_x(num1,num2);
4    }
5
6    public static int find_x(int num1 , int num2){
7        int set_bit = 0;
8        while(num2>0){
9            num2 = (num2 & (num2-1));
10            set_bit++;
11        }
12        int x = 0;
13        for(int i=30; i>=0; i--){
14            int mask = (1<<i);
15            if((num1 & mask)!=0){
16                x |= mask;
17                set_bit--;
18
19                if(set_bit==0){
20                    return x;
21                }
22            }
23        }
24
25        for(int i=0; i<=30; i++){
26            int mask = (1<<i);
27            if((num1 & mask)==0){
28                x |= mask;
29                set_bit--;
30
31                if(set_bit==0){
32                    return x;
33                }
34            }
35        }
36
37        return x;
38    }
39}