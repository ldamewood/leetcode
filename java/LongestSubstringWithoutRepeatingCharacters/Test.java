public class Test {

	public static void main(String[] args) {
		Solution s = new Solution();
		assert s.lengthOfLongestSubstring("abcabcbb") == 3;
		assert s.lengthOfLongestSubstring("bbbbbb") == 1;
		assert s.lengthOfLongestSubstring("") == 0;
		assert s.lengthOfLongestSubstring("ababababab") == 2;
		assert s.lengthOfLongestSubstring("hello") == 3;
	}
}
