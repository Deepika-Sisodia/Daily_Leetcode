// Last updated: 4/11/2026, 8:35:22 PM
1class Solution {
2    public int minOperations(int[] nums) {
3        int max = 100000 + 10000;
4        boolean[] isPrime = sieve(max);
5
6        int ops = 0;
7        
8        for(int i=0; i<nums.length; i++){
9            int val = nums[i];
10
11            if(i % 2 == 0){
12                while(!isPrime[val]){
13                    val++;
14                    ops++;
15                }
16            }
17            else{
18                while(isPrime[val]){
19                    val++;
20                    ops++;
21                }
22            }
23        }
24
25        return ops;
26    }
27
28    public boolean[] sieve(int n){
29        boolean[] isPrime = new boolean[n+1];
30        Arrays.fill(isPrime, true);
31
32        isPrime[0] = false;
33        isPrime[1] = false;
34
35        for(int i=2; i*i<=n; i++){
36            if(isPrime[i]){
37                for(int j=i*i; j<=n; j+=i){
38                    isPrime[j] = false;
39                }
40            }
41        }
42
43        return isPrime;
44    }
45}