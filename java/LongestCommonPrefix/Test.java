public class Test {

	public static void main(String[] args) {
		Solution s = new Solution();
		assert s.longestCommonPrefix(
				new String[] { "hello", "monkey", "money", "hell" }).equals("");
		assert s.longestCommonPrefix(new String[] { "hello", "hell" }).equals(
				"hell");
		assert s.longestCommonPrefix(new String[] { "monkey", "money" })
				.equals("mon");
		assert s.longestCommonPrefix(new String[] {}).equals("");
	}

}
