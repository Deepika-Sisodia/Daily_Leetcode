// Last updated: 3/25/2026, 11:24:28 PM
1class Solution {
2    public boolean canThreePartsEqualSum(int[] arr) {
3        int n = arr.length;
4
5        int sum = 0;
6        for(int i=0; i<n; i++){
7            sum += arr[i];
8        }
9
10        if(sum % 3 != 0) return false;
11
12        sum = sum / 3;
13        int count = 0;
14        int curr = 0;
15        for(int i=0; i<n; i++){
16            curr += arr[i];
17            if(curr==sum){
18                count++;
19                curr = 0;
20            }
21        }
22
23        return count >= 3;
24    }
25}