// Last updated: 1/31/2026, 3:53:19 PM
1class Solution {
2    public int minDays(int[] bloomDay, int m, int k) {
3        int n = bloomDay.length;
4
5        if(m*k>n){
6            return -1;
7        }    
8
9
10        int max = Integer.MIN_VALUE;
11        int min = Integer.MAX_VALUE;
12        for(int i=0; i<n; i++){
13            max = Math.max(max,bloomDay[i]);
14            min = Math.min(min,bloomDay[i]);
15        }
16
17        int lo = min;
18        int hi = max;
19        int ans = -1;
20
21        while(lo<=hi){
22            int mid = lo+(hi-lo)/2;
23
24            if(canMake(bloomDay,k,m,mid)){
25                ans = mid;
26                hi = mid-1;
27            }
28            else{
29                lo = mid+1;
30            }
31        }
32        return ans;
33    }
34
35    public boolean canMake(int[] arr, int k, int m, int day){
36        int flowers = 0;
37        int bouquets = 0;
38        for(int i: arr){
39            if(day>=i){
40                flowers++;
41                if(flowers==k){
42                    bouquets++;
43                    flowers=0;
44                }
45            }
46            else{
47                flowers=0;
48            }
49        }
50
51        return bouquets>=m;
52    }
53}