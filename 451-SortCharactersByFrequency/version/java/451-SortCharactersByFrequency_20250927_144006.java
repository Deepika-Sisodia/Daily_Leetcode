// Last updated: 9/27/2025, 2:40:06 PM
class Solution {
    public String frequencySort(String s) {
        int n = s.length();
        Map<Character, Integer> map = new HashMap<>();

        for(int i=0; i<n; i++){
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch,0)+1);
        }

        List<Freq> ll = new ArrayList<>();
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            ll.add(new Freq(entry.getKey(), entry.getValue()));
        }
        Collections.sort(ll);
        

        StringBuilder sb = new StringBuilder();

        for(int i=0; i<ll.size(); i++){
            for(int j=0; j<ll.get(i).freq; j++){
                sb.append(ll.get(i).ch);
            }
            
        }

        return sb.toString();
        
    }

    class Freq implements Comparable<Freq> {
        char ch;
        int freq;
        Freq(char ch, int freq){
            this.ch = ch;
            this.freq = freq;
        }

        @Override
        public int compareTo(Freq other){
            return other.freq-this.freq;
        }
    }
}