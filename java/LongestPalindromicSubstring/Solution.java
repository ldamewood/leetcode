// O(n) time O(n) space solution here:
// 	http://leetcode.com/2011/11/longest-palindromic-substring-part-ii.html
// This is O(n^2) in time, O(1) in space
public class Solution {
	public String longestPalindrome(String s) {
		int longestStart = 0;
		int longestEnd = 0;
		int i = 0, j = 0, f = 0;
		while (i < s.length() && j < s.length()) {
			int start = i;
			int end = j;
			while (start >= 0 && end < s.length()
					&& s.charAt(start) == s.charAt(end)) {
				if (end - start > longestEnd - longestStart) {
					longestStart = start;
					longestEnd = end;
				}
				start--;
				end++;
			}
			if (f % 2 == 1)
				i++;
			else
				j++;
			f++;
		}
		return s.substring(longestStart, longestEnd + 1);
	}
}