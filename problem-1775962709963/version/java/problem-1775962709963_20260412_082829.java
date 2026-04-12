// Last updated: 4/12/2026, 8:28:29 AM
1class Solution {
2    public double[] internalAngles(int[] sides) {
3        double a = sides[0], b = sides[1], c = sides[2];
4
5        if(a+b<=c || a+c<=b || b+c<=a){
6            return new double[0];
7        }
8
9        double x = Math.toDegrees(Math.acos((b*b + c*c - a*a)/(2*b*c)));
10        double y = Math.toDegrees(Math.acos((a*a + c*c - b*b)/(2*a*c)));
11        double z = Math.toDegrees(Math.acos((a*a + b*b - c*c)/(2*a*b)));
12
13        double[] res = {x,y,z};
14        
15        Arrays.sort(res);
16
17        return res;
18    }
19}