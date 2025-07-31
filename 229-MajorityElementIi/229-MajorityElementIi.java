// Last updated: 7/31/2025, 2:09:35 PM
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> ll = new ArrayList<>();
        Moore_Voting(nums,ll);
        return ll;
    }
    public static void Moore_Voting(int[] arr, List<Integer> ll) {
        int firstsum=0, secondsum=0, firstmajor=Integer.MAX_VALUE, secondmajor=Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==firstmajor){
                firstsum++;
            }
            else if(arr[i]==secondmajor){
                secondsum++;
            }
            else if(firstsum==0){
                firstmajor=arr[i];
                firstsum=1;
            }
            else if(secondsum==0){
                secondmajor=arr[i];
                secondsum=1;
            }
            else{
                firstsum--;
                secondsum--;
            }
        }
        
        firstsum=0; 
        secondsum=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==firstmajor){
                firstsum++;
            }
            else if(arr[i]==secondmajor){
                secondsum++;
            }
        }
        if(firstsum>arr.length/3){
            ll.add(firstmajor);
        }
        if(secondsum>arr.length/3){
            ll.add(secondmajor);
        }

	}
}