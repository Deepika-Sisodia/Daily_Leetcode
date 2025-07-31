// Last updated: 7/31/2025, 2:06:49 PM
class Solution {
    public List<String> stringMatching(String[] words) {
        List<String> ll = new ArrayList<>();
        String s = new String(words[0]);
        for(int i=1; i<words.length; i++){
            s = s+words[i]+",";
        }
        for(int i=0; i<words.length; i++){
            s=s.replaceFirst(words[i],"");
            if(s.contains(words[i])){
               ll.add(words[i]); 
            }
            s=s+words[i]+",";
        }
        return ll;
        
    }
}