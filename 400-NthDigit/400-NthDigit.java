// Last updated: 7/31/2025, 2:08:45 PM
class Solution {
    public int findNthDigit(int n) {
        int digitlength=1;
        long count=9;
        long start=1;
        while(n>digitlength*count){
            n-=digitlength*count;
            digitlength++;
            count*=10;
            start*=10;
        }

        long index = n-1;
        long number = start + index/digitlength;

        int digitIndex = (int)(index%digitlength);
        return String.valueOf(number).charAt(digitIndex)-'0';

        
    }
}