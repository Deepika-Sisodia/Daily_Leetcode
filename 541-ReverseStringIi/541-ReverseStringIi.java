// Last updated: 7/31/2025, 2:08:20 PM
class Solution {
    public String reverseStr(String s, int k) {
        char[] arr = s.toCharArray();
        for(int i=0; i<arr.length; i+=2*k){
            int start=i;
            int end=Math.min(i+k-1,arr.length-1);
            reverse(arr,start,end);
        }
        return new String(arr);
        
        
    }
    public static void reverse(char[] arr, int start, int end){
        while(start<end){
            char temp = arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        
    }
}