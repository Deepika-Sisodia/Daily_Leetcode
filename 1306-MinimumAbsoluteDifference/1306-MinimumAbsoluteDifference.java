// Last updated: 7/31/2025, 2:07:05 PM
class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> ll = new ArrayList<>();
        Arrays.sort(arr);
        int min_diff = Integer.MAX_VALUE;
        for(int i=0; i<arr.length-1; i++){
            min_diff=Math.min(min_diff,arr[i+1]-arr[i]);

        }
        for(int i=0; i<arr.length-1; i++){
            if(arr[i+1]-arr[i]==min_diff){
                ll.add(Arrays.asList(arr[i],arr[i+1]));
            }
        }
        return ll;
        
    }
}