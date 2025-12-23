// Last updated: 12/23/2025, 12:37:05 PM
1class Solution {
2    public String generateTag(String caption) {
3        String[] arr = caption.trim().split("\\s+");
4        StringBuilder sb = new StringBuilder();
5
6        sb.append('#');
7
8        String first = arr[0].replaceAll("[^a-zA-Z]","").toLowerCase();
9        sb.append(first);
10
11        for(int i=1; i<arr.length; i++){
12            String word = arr[i].replaceAll("[^a-zA-Z]","");
13            if(word.isEmpty()) continue;
14
15            char ch = Character.toUpperCase(word.charAt(0));
16
17            sb.append(ch);
18            sb.append(word.substring(1).toLowerCase());
19
20            if(sb.length()>=100) break;
21        }
22
23        return sb.length() > 100 ? sb.substring(0, 100) : sb.toString();
24    }
25}