// Last updated: 1/2/2026, 8:35:18 PM
1class Solution {
2    public long kthSmallestProduct(int[] nums1, int[] nums2, long k) {
3        long result = 0;
4        long lo = -10000000000L;
5        long hi = 10000000000L;
6        
7        while(lo<=hi){
8            long midProd = lo+(hi-lo)/2;
9
10            long countSmallest = findCountSmallest(nums1,nums2,midProd);
11            if(countSmallest>=k){
12                result = midProd;
13                hi = midProd-1;
14            }
15            else{
16                lo = midProd+1;
17            }
18        }
19        return result;
20    }
21
22    public long findCountSmallest(int[] nums1, int[] nums2, long midProd){
23        long productCount = 0;
24        int n = nums2.length;
25        for(int i=0; i<nums1.length; i++){
26            if(nums1[i]==0){
27                if(midProd>=0){
28                    productCount+=n;
29                }
30            }
31            else if(nums1[i]>0){
32                int lo = 0;
33                int hi = n-1;
34                int m = -1;
35                while(lo<=hi){
36                    int mid = lo+(hi-lo)/2;
37                    long prod = (long) nums1[i]*nums2[mid];
38                    if(prod<=midProd){
39                        m = mid;
40                        lo = mid+1;
41                    }
42                    else{
43                        hi = mid-1;
44                    }
45                }
46                productCount += (m+1);
47            }
48            else{
49                int lo = 0;
50                int hi = n-1;
51                int m = n;
52                while(lo<=hi){
53                    int mid = lo+(hi-lo)/2;
54                    long prod = (long) nums1[i]*nums2[mid];
55                    if(prod<=midProd){
56                        m = mid;
57                        hi = mid-1;
58                    }
59                    else{
60                        lo = mid+1;
61                    }
62                }
63                productCount += (n-m);
64            }
65        }
66        return productCount;
67    }
68}