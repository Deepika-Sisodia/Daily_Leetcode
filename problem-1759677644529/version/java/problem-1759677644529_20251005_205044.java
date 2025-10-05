// Last updated: 10/5/2025, 8:50:44 PM
class Solution {
    public List<String> letterCasePermutation(String s) {
        List<String> ans = new ArrayList<>();
        permutations(s,0,"",ans);
        return ans;
    }

    public void permutations(String s, int idx, String curr, List<String> ans){
        if(idx==s.length()){
            ans.add(curr);
            return;
        }

        char ch = s.charAt(idx);
        if(Character.isLetter(ch)){
            permutations(s,idx+1, curr+Character.toLowerCase(ch), ans);
            permutations(s,idx+1, curr+Character.toUpperCase(ch), ans);
        }
        else{
            permutations(s,idx+1, curr+ch, ans);
        }


    }
}