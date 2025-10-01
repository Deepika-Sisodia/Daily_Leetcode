// Last updated: 10/1/2025, 2:21:27 PM
class Solution {
    public String largestNumber(int[] nums) {
        String[] arr = new String[nums.length];
        for(int i=0; i<arr.length; i++){
            arr[i] = Integer.toString(nums[i]);
        }

        Arrays.sort(arr, (a,b)->(b+a).compareTo(a+b));
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<arr.length; i++){
            sb.append(arr[i]);
        }
        String ans = sb.toString();

        if(ans.charAt(0)=='0'){
            return "0";
        }
        return ans;
    }
}