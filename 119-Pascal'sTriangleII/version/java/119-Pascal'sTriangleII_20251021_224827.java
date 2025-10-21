// Last updated: 10/21/2025, 10:48:27 PM
class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0; i<=rowIndex; i++){
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

        return ans.get(ans.size()-1);
    }
}