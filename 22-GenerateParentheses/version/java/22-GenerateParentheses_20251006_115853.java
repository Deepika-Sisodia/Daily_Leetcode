// Last updated: 10/6/2025, 11:58:53 AM
class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ll = new ArrayList<>();
        generate(n,0,0,"",ll);
        return ll;
    }

    public void generate(int n, int open, int close, String s, List<String> ll){
        if(open==n && close==n){
            ll.add(s);
            return;
        }
        if(n>open){
            generate(n,open+1,close,s+"(",ll);
        }
        
        if(open>close){
            generate(n,open,close+1,s+")",ll);
        }
        
    }
}