// Last updated: 2/24/2026, 10:23:47 PM
1class Solution {
2    public int findRadius(int[] houses, int[] heaters) {
3        Arrays.sort(houses);
4        Arrays.sort(heaters);
5        int lo = 0;
6        int hi = Math.max(houses[houses.length-1], heaters[heaters.length-1]);
7        int ans = hi;
8
9        while(lo<=hi){
10            int mid = lo + (hi-lo)/2;
11            if(isPossible(houses,heaters,mid)){
12                ans = mid;
13                hi = mid-1;
14            }
15            else{
16                lo = mid+1;
17            }
18        }
19
20        return ans;
21    }
22
23    public boolean isPossible(int[] houses, int[] heaters, int rad){
24        int i=0, j=0;
25
26        while(i<houses.length && j<heaters.length){
27            if(houses[i]>=heaters[j]-rad && houses[i]<=heaters[j]+rad){
28                i++;
29            }
30            else if(houses[i]<heaters[j]-rad){
31                return false;
32            }
33            else if(houses[i]>heaters[j]+rad){
34                j++;
35            }
36        }
37
38        if(i==houses.length){
39            return true;
40        }
41
42        return false;
43    }
44}