// Last updated: 7/31/2025, 2:08:46 PM
class Solution {
    private int idx = 0;
    public String decodeString(String s) {
        return decode(s);
    }

    public String decode(String s){
        StringBuilder result = new StringBuilder();
        int num = 0;

        while(idx<s.length()){
            char ch = s.charAt(idx);

            if(Character.isDigit(ch)){
                num = num*10 + (ch-'0');
                idx++;
            }
            else if(ch=='['){
                idx++;
                String decodedStr = decode(s);
                for(int i=0; i<num; i++){
                    result.append(decodedStr);
                }
                num=0;
            }
            else if(ch==']'){
                idx++;
                return result.toString();
            }
            else{
                result.append(ch);
                idx++;
            }
        }
        return result.toString();
    }
}