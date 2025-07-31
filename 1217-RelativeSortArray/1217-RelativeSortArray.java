// Last updated: 7/31/2025, 2:07:13 PM
class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int n = arr1.length;
        int m = arr2.length;

        int max = 0;
        for(int i=0; i<n; i++){
            max = Math.max(max,arr1[i]);
        }

        int[] count = new int[max+1];
        for(int i=0; i<n; i++){
            int element = arr1[i];
            count[element]++;
        }

        int[] res = new int[n];
        int j=0;
        for(int i=0; i<m; i++){
            int element = arr2[i];
            while(count[element]>0){
                res[j] = element; 
                j++;
                count[element]--;
            }
        }

        for(int i=0; i<max+1; i++){
            while(count[i]>0){
                res[j] = i; 
                j++;
                count[i]--;
            }
        }

        return res;
    }
}