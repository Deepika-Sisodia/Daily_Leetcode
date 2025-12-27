// Last updated: 12/27/2025, 6:34:03 PM
1class Solution {
2    public String multiply(String num1, String num2) {
3        if (num1.equals("0") || num2.equals("0")) return "0";
4        int n1 = num1.length();
5        int n2 = num2.length();
6        int[] res = new int[n1+n2];
7        for(int i=n1-1; i>=0; i--){
8            for(int j=n2-1; j>=0; j--){
9                int mul = (num1.charAt(i)-'0')*(num2.charAt(j)-'0');
10                int sum = mul + res[i+j+1];
11                res[i+j+1] = sum%10;
12                res[i+j] += sum/10;
13            }
14        }
15        StringBuilder sb = new StringBuilder();
16        for(int num: res){
17            if(!(sb.length()==0 && num==0)){
18                sb.append(num);
19            }
20        }
21        
22        return sb.toString();
23    }
24}