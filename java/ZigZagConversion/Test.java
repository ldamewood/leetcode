public class Test {

	public static void main(String[] args) {
		Solution s = new Solution();
		assert s.convert("PAYPALISHIRING", 3) == "PAHNAPLSIIGYIR";
		assert s.convert("", 3) == "";
		assert s.convert("AB", 1) == "AB";
	}

}
