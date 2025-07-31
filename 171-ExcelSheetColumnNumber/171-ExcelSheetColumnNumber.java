// Last updated: 7/31/2025, 2:10:11 PM
class Solution {
    public int titleToNumber(String columnTitle) {
        int ans = 0;
        for(int i=0; i<columnTitle.length(); i++){
            int n = columnTitle.charAt(i)-'A'+1;
            ans = ans*26 + n;
        }
        return ans;
    }
}