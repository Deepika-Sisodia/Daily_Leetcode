// Last updated: 11/8/2025, 5:59:12 PM
class Solution {
    public String countAndSay(int n) {
        return func(n);
    }

    public String func(int n){
        if(n==1){
            return "1";
        }

        String s = func(n-1);
        StringBuilder sb = new StringBuilder();
        int count = 1;
        for(int i=0; i<s.length()-1; i++){
            char ch = s.charAt(i);
            if(ch==s.charAt(i+1)){
                count++;
            }
            else{
                sb.append(count);
                sb.append(ch);
                count = 1;
            }
        }

        sb.append(count);
        sb.append(s.charAt(s.length()-1));

        return sb.toString();
    }
}