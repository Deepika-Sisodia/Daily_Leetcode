// Last updated: 7/31/2025, 2:10:14 PM
class Solution {
    public String convertToTitle(int columnNumber) {
        String result = "";
        while(columnNumber>0){
            columnNumber--;
            result=(char)('A'+(columnNumber%26))+result;
            columnNumber/=26;
        }
        return result;
    }
}