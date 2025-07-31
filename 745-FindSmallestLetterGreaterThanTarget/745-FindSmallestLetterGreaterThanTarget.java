// Last updated: 7/31/2025, 2:07:56 PM
class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int l = letters.length;
        int s = 0;
		int e = l-1;
		while(s<=e) {
			int mid = s+(e-s)/2;
			if(letters[mid]>target) {
				e = mid-1;
			}
			else {
				s = mid+1;
			}
		}
        return letters[s%l];
    }
}