// Last updated: 7/31/2025, 2:08:04 PM
class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> ll = new ArrayList<>();
        closest(arr,k,x,ll);
        return ll;
        
    }
    public static void closest(int[] arr, int k, int x, List<Integer> ll){
        int start=0;
        int end=arr.length-1;
        while(end-start>=k){
            if(Math.abs(arr[start]-x) > Math.abs(arr[end]-x)){
                start++;
            }
            else{
                end--;
            }
        }
        for(int i=start; i<start+k; i++){
            ll.add(arr[i]);
        }

    }
}