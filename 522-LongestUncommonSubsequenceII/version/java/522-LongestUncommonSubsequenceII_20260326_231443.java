// Last updated: 3/26/2026, 11:14:43 PM
1class Solution {
2    public int findLUSlength(String[] strs) {
3        int n = strs.length;
4
5        Arrays.sort(strs, (a,b)-> b.length()-a.length());
6
7        for(int i=0; i<n; i++){
8            boolean isUncommon = true;
9
10            for(int j=0; j<n; j++){
11                if(i==j) continue;
12
13                if(isSubsequence(strs[i],strs[j])){
14                    isUncommon = false;
15                    break;
16                }
17            }
18
19            if(isUncommon) return strs[i].length();
20        }
21
22        return -1;
23    }
24
25    public boolean isSubsequence(String s1, String s2){
26        int i=0, j=0;
27
28        while(i<s1.length() && j<s2.length()){
29            if(s1.charAt(i)==s2.charAt(j)) i++;
30            j++;
31        }
32
33        return i==s1.length();
34    }
35}