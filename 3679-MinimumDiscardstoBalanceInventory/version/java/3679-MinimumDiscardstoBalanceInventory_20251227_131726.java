// Last updated: 12/27/2025, 1:17:26 PM
1class Solution {
2    public int minArrivalsToDiscard(int[] arr, int w, int m) {
3        int cnt = 0;
4
5        Map<Integer, PriorityQueue<Integer>> map = new HashMap<>();
6
7        for (int i = 1; i <= arr.length; i++) {
8            int type = arr[i - 1];
9            int window = Math.max(1, i - w + 1);
10
11            PriorityQueue<Integer> q = map.computeIfAbsent(type, k -> new PriorityQueue<>());
12
13            // Remove expired arrivals outside of window
14            while (!q.isEmpty() && q.peek() < window) {
15                q.poll();
16            }
17
18            // If within limit, accept; else discard
19            if (q.size() < m) {
20                q.offer(i);
21            } else {
22                cnt++;
23            }
24        }
25        return cnt;
26    }
27}