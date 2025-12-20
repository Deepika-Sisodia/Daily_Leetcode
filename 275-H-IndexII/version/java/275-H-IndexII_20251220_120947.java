// Last updated: 12/20/2025, 12:09:47 PM
1class Solution {
2    public int hIndex(int[] citations) {
3        int n = citations.length;
4        int lo = 0;
5        int hi = citations[n-1];
6        int ans = 1;
7        while(lo<=hi){
8            int mid = lo+(hi-lo)/2;
9            if(istrue(citations,mid)){
10                ans = mid;
11                lo = mid+1;
12            }
13            else{
14                hi = mid-1;
15            }
16        }
17
18        return ans;
19    }
20
21    public static boolean istrue(int[] arr, int target){
22        int h = 0;
23        for(int i=0; i<arr.length; i++){
24            if(arr[i]>=target){
25                h++;
26            }
27        }
28
29        return h>=target;
30    }
31}