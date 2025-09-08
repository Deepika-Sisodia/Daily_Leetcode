// Last updated: 9/8/2025, 2:01:44 PM
class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int n = arr.length;
        int l = 0, h = n-k;
        while(l<h){
            int mid = l + (h-l)/2;
            if(x-arr[mid]>arr[mid+k]-x){
                l = mid + 1;
            }
            else{
                h = mid;
            }
        }

        List<Integer> ans = new ArrayList<>();
        for(int i=l; i<l+k; i++){
            ans.add(arr[i]);
        }

        return ans;
    }
}