public class Test {
	public static void main(String[] args) {
		Solution s = new Solution();
		assert s.isPalindrome(12321);
		assert !s.isPalindrome(-12321);
		assert s.isPalindrome(123212321);
		assert s.isPalindrome(0);
		assert !s.isPalindrome(1233212321);
		assert !s.isPalindrome(-2147447412);
	}

}
