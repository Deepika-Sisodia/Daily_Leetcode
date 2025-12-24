// Last updated: 12/24/2025, 7:56:24 PM
1class Solution {
2    public String maxValue(String n, int x) {
3        StringBuilder sb = new StringBuilder();
4        boolean inserted = false;
5        for(int i=0; i<n.length(); i++){
6            if(n.charAt(0)=='-'){
7                if(i!=0 && n.charAt(i)-'0'> x && !inserted){
8                    sb.append(x);
9                    inserted = true;
10                }
11            }
12            else{
13                if(n.charAt(i)-'0'< x && !inserted){
14                    sb.append(x);
15                    inserted = true;
16                }
17            }
18            sb.append(n.charAt(i));
19        }
20        
21        if(!inserted){
22            sb.append(x);
23        }
24        return sb.toString();
25    }
26}