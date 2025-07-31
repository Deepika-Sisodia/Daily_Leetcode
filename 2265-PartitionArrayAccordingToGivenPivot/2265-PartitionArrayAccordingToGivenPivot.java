// Last updated: 7/31/2025, 2:06:19 PM
class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        return pivot(nums,pivot);
    }
    public static int[] pivot(int[] arr, int item){
        int n = arr.length;
        int[] ans = new int[n];
        int idx=0;
        for(int i=0; i<n; i++){
            if(arr[i]<item){
                ans[idx++]=arr[i];
            }
        }
        for(int i=0; i<n; i++){
            if(arr[i]==item){
                ans[idx++]=arr[i];
            }
        }
        for(int i=0; i<n; i++){
            if(arr[i]>item){
                ans[idx++]=arr[i];
            }
        }
        return ans;
    }

}