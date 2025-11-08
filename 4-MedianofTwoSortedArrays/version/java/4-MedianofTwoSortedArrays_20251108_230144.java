// Last updated: 11/8/2025, 11:01:44 PM
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int n = n1+n2;
        int[] arr = new int[n];

        int i=0, j=0, k=0;
        while(i<n1 && j<n2){
            if(nums1[i]>nums2[j]){
                arr[k] = nums2[j];
                j++;
            }
            else{
                arr[k] = nums1[i];
                i++;
            }
            k++;
        }

        while(i<n1){
            arr[k] = nums1[i];
            i++;
            k++;
        }

        while(j<n2){
            arr[k] = nums2[j];
            j++;
            k++;
        }

        if(n%2==0){
            double first = (double) arr[n/2-1]; 
            double sec = (double) arr[n/2];

            return (first+sec)/2;
        }

        return arr[n/2];
    }
}