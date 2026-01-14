// Last updated: 1/14/2026, 8:25:12 PM
1class Solution {
2    public long perfectPairs(int[] nums) {
3        int n = nums.length;
4        long count = 0;
5        int i = 0;
6
7        for(int k=0; k<n; k++){
8            nums[k] = Math.abs(nums[k]);
9        }
10
11        Arrays.sort(nums);
12        
13        while(i<n){
14            int A = nums[i];
15            int lo = i+1, hi = n-1, best = i;
16            
17            while(lo<=hi){
18                int mid = lo + (hi-lo)/2;
19                if(nums[mid]<=2*A){
20                    best = mid;
21                    lo = mid+1;
22                }
23                else{
24                    hi = mid-1;
25                }
26            }
27            count = count + (best-i);
28            i++;
29               
30        }
31
32        return count;
33        
34    }
35}