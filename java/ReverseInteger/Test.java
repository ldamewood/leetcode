public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();
		assert s.reverse(1234) == 4321;
		assert s.reverse(-1234) == -4321;
		assert s.reverse(0) == 0;
		assert s.reverse(1000000003) == Integer.MAX_VALUE;
		assert s.reverse(Integer.MAX_VALUE) == Integer.MAX_VALUE;
		assert s.reverse(-1000000003) == Integer.MIN_VALUE;
	}
}
