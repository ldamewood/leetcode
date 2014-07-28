public class Test {

	public static void main(String[] args) {
		Solution s = new Solution();
		assert s.longestPalindrome("Hello").equals("ll");
		assert s.longestPalindrome("Mooo").equals("ooo");
		assert s.longestPalindrome("MoooM").equals("MoooM");
		assert s.longestPalindrome("Moo2M").equals("oo");
		assert s.longestPalindrome("Moo2Mooo").equals("ooo");
	}

}
