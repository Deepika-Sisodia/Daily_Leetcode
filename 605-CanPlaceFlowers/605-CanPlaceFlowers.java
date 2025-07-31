// Last updated: 7/31/2025, 2:08:10 PM
class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int l = flowerbed.length;
        int c = 0;
        for(int i=0; i<l; i++){
            if(flowerbed[i]==0){
                boolean left = (i==0) || (flowerbed[i-1]==0);
                boolean right = (i==l-1) || (flowerbed[i+1]==0);
                if(left && right){
                    flowerbed[i]=1;
                    c++;
                    if(c>=n){
                        return true;
                    }
                }
            }
        }

        return c>=n;
    }
}