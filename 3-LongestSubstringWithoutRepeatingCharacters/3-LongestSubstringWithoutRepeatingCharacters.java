// Last updated: 7/31/2025, 2:12:37 PM
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int left = 0, right = 0;
        int maxLength = 0;
        HashSet<Character> window = new HashSet<>();

        while (right < n) {
            char currentChar = s.charAt(right);

            // If character is already in the window, shrink from the left
            while (window.contains(currentChar)) {
                window.remove(s.charAt(left));
                left++;
            }

            // Add current character to the window
            window.add(currentChar);
            maxLength = Math.max(maxLength, right - left + 1);
            right++;
        }

        return maxLength;
        
    }
}