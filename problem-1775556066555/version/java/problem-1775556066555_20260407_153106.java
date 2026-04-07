// Last updated: 4/7/2026, 3:31:06 PM
1class EventManager {
2
3    PriorityQueue<int[]> pq;
4    HashMap<Integer,Integer> map;
5    public EventManager(int[][] events) {
6        map = new HashMap<>();
7        pq = new PriorityQueue<>((a,b)->{
8            if(a[1] != b[1]) return b[1] - a[1];
9            return a[0] - b[0];
10        });
11
12        for(int[] e : events){
13            int id = e[0], priority = e[1];
14            map.put(id,priority);
15            pq.offer(new int[]{id,priority});
16        }
17    }
18    
19    public void updatePriority(int eventId, int newPriority) {
20        map.put(eventId,newPriority);
21        pq.offer(new int[]{eventId, newPriority});
22    }
23    
24    public int pollHighest() {
25        while(!pq.isEmpty()){
26            int[] top = pq.poll();
27            int id = top[0];
28            int priority = top[1];
29
30            if(!map.containsKey(id)) continue;
31            if(map.get(id) != priority) continue;
32
33            map.remove(id);
34
35            return id;
36        }
37
38        return -1;
39    }
40}
41
42/**
43 * Your EventManager object will be instantiated and called as such:
44 * EventManager obj = new EventManager(events);
45 * obj.updatePriority(eventId,newPriority);
46 * int param_2 = obj.pollHighest();
47 */