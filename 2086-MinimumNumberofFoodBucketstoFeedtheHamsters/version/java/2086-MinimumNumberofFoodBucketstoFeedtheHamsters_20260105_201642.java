// Last updated: 1/5/2026, 8:16:42 PM
1class Solution {
2    public int minimumBuckets(String hamsters) {
3        char[] arr = hamsters.toCharArray();
4        int buckets = 0;
5        int n = arr.length;
6
7        for(int i=0; i<n; i++){
8            if(arr[i]=='H'){
9                if(i>0 && arr[i-1]=='B'){
10                    continue;
11                }
12                if(i+1<n && arr[i+1]=='.'){
13                    arr[i+1]='B';
14                    buckets++;
15                }
16                else if(i>0 && arr[i-1]=='.'){
17                    arr[i-1]='B';
18                    buckets++;
19                }
20                else{
21                    return -1;
22                }
23            }
24        }
25        return buckets;
26    }
27}