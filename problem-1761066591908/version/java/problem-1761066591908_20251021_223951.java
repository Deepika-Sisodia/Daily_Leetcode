// Last updated: 10/21/2025, 10:39:51 PM
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0; i<numRows; i++){
            List<Integer> ll = new ArrayList<>();
            for(int j=0; j<=i; j++){
                if(j==0 || j==i){
                    ll.add(1);
                }
                else{
                    int val = ans.get(i-1).get(j-1)+ans.get(i-1).get(j);
                    ll.add(val);
                }
            }
            ans.add(new ArrayList<>(ll));
        }

        return ans;
    }
}