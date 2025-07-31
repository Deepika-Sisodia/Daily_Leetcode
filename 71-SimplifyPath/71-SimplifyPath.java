// Last updated: 7/31/2025, 2:11:27 PM
class Solution {
    public String simplifyPath(String path) {
        String[] arr = path.split("/");
        Stack<String> st = new Stack<>();
        for(String str : arr){
            if(str.equals("") || str.equals(".")){
                continue;
            }
            else if (str.equals("..")){
                if(!st.isEmpty()){
                    st.pop();
                }
            }
            else{
                st.push(str);
            }
        }
        StringBuilder sb = new StringBuilder();
        for (String dir : st) {
            sb.append("/").append(dir);
        }
        
        return sb.length() > 0 ? sb.toString() : "/";
    }
}