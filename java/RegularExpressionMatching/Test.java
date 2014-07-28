public class Test {

	public static void main(String[] args) {
		Solution s = new Solution();
		assert !s.isMatch("aa", "a");
		assert s.isMatch("aa", "aa");
		assert !s.isMatch("aaa", "aa");
		s.isMatch("aa", "a*");
		s.isMatch("aa", ".*");
		s.isMatch("ab", ".*");
		s.isMatch("aab", "c*a*b");
	}
}
