// Last updated: 10/4/2025, 11:22:03 AM
class Solution {
    public int fib(int n) {
        return fibo(n);
    }

    public int fibo(int n){
        if(n==0 || n==1){
            return n;
        }

        int f1 = fibo(n-1);
        int f2 = fibo(n-2);
        return f1+f2;
    }
}