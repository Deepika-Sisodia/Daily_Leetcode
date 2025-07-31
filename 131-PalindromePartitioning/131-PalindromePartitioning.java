// Last updated: 7/31/2025, 2:10:44 PM
class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
		List<String> ll = new ArrayList<>();
		partition(s,ans,ll);
		return ans;
		

	}
	
	public static void partition(String ques, List<List<String>> ans, List<String> ll ) {
		if(ques.length()==0) {
			ans.add(new ArrayList<String>(ll));
			return;
		}
		for(int cut=1; cut<=ques.length(); cut++) {
			String str = ques.substring(0,cut);
			if(ispalindrome(str)) {
				ll.add(str);
				partition(ques.substring(cut),ans,ll);	
                ll.remove(ll.size()-1);
			}
			
		}
	}
	
	public static boolean ispalindrome(String s) {
		int i=0;
		int j=s.length()-1;
		while(i<j) {
			if(s.charAt(i)!=s.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
		
	}
}