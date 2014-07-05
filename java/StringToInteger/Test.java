public class Test {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();
		assert s.atoi("0") == 0;
		assert s.atoi("hello") == 0;
		assert s.atoi("+1234567") == 1234567;
		assert s.atoi("-1234567") == -1234567;
		assert s.atoi("+12345678901234567890") == Integer.MAX_VALUE;
		assert s.atoi("-12345678901234567890") == Integer.MIN_VALUE;
		assert s.atoi("-1234 is my number") == -1234;
		assert s.atoi("") == 0;
		assert s.atoi("    010") == 10;
		assert s.atoi(" 1") == 1;
		assert s.atoi(" 1 ") == 1;
		assert s.atoi("1 ") == 1;
		assert s.atoi("1+2") == 1;
		assert s.atoi(" +2") == 2;
		assert s.atoi("-+1") == 0;
		assert s.atoi("2147483648") == Integer.MAX_VALUE;
		assert s.atoi("-2147483648") == Integer.MIN_VALUE;
		assert s.atoi("3147483640") == 2147483647;
	}
}
