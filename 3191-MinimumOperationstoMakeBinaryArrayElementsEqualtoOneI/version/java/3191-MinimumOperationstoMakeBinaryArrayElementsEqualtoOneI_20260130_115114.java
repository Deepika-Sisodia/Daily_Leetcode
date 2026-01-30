// Last updated: 1/30/2026, 11:51:14 AM
1class Solution {
2    public int minOperations(int[] nums) {
3        int n = nums.length;
4        int c = 0;
5        for(int i=0; i<=n-3; i++){
6            if(nums[i]==0){
7                c++;
8                for(int j=i; j<i+3; j++){
9                    if(nums[j]==0){
10                        nums[j]=1;
11                    }
12                    else{
13                        nums[j]=0;
14                    }
15                }
16            }
17        }
18
19        if(nums[n-1]==0 || nums[n-2]==0){
20            return -1;
21        }
22
23        return c;
24    }
25}