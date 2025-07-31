// Last updated: 7/31/2025, 2:08:05 PM
class Solution {
    public boolean judgeCircle(String moves) {
        int a = 0, b = 0;
        for(int i: moves.toCharArray()){
            if(i == 'L'){
                a++;
            }
            else if(i == 'R'){
                a--;
            }
            else if(i == 'U'){
                b++;
            }
            else{
                b--;
            }
        }
        return (a==0 && b==0);
    }
}