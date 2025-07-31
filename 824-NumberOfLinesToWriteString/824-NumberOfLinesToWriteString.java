// Last updated: 7/31/2025, 2:07:50 PM
class Solution {
    public int[] numberOfLines(int[] widths, String s) {
        int[] result = new int[2];
        int pixels = 0;

        for(char c : s.toCharArray()){
            int index = c - 'a';
            pixels +=widths[index];

            if(pixels == 100){
                result[0]++;
                result[1] = pixels;
                pixels = 0;
            }
            else if(pixels>100){
                result[0]++;
                pixels = 0;
                pixels += widths[index];

            }
        }

        if(pixels!=0){
            result[0]++;
            result[1] = pixels;
        }
        
        return result;
        
    }
}