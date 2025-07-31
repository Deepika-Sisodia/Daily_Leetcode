// Last updated: 7/31/2025, 2:07:39 PM
class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int boat=0;
        int i=0;
        int j=people.length-1;
        while(i<=j){
            int sum=people[i]+people[j];
            if(sum<=limit){
                boat++;
                i++;
                j--;
            }
            else{
                boat++;
                j--;
            }
        }
        return boat;
    }
}