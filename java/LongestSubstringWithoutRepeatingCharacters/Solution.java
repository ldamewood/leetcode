public class Solution {
	public int lengthOfLongestSubstring(String s) {

		// Holds location in array s of ASCII character
		int[] place = new int[256];

		// Start of current substring
		int start = 0;

		// Length of current substring
		int counter = 0;

		// Maximum substring
		int max = 0;

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (place[c] > start) {
				// Decrease counter to ignore repeated character
				counter += start - place[c];
				// Skip ahead past repeated character
				start = place[c];
			}
			// Update location array
			place[c] = i + 1;
			counter++;
			if (counter > max)
				max = counter;
		}
		return max;
	}
}