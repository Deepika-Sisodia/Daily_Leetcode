// Last updated: 7/31/2025, 2:11:04 PM
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int [] arr = new int[m+n];
        for(int i=0; i<m; i++){
            arr[i]=nums1[i];
        }

        int a=0, b=0, p=0;
        while(a<m || b<n){
            if(b>=n || a<m && arr[a]<nums2[b]){
                nums1[p]=arr[a];
                a++;
            }
            else{
                nums1[p]=nums2[b];
                b++;

            }
            p++;
        }

        
    }
}