// Last updated: 7/31/2025, 2:08:12 PM
class Solution {
    public int distributeCandies(int[] candyType) {
        Arrays.sort(candyType);
        int c=1;
        int max=candyType.length/2;
        for(int i=1; i<=candyType.length-1; i++){
            if(candyType[i-1]!=candyType[i]){
                c++;
            }
        }
        if(c>max){
            return max;
        }
        else{
            return c;
        }
    }
}