public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();
		int[] testArray;
		int[] answer;
		
		testArray = new int[] { 2, 7, 11, 15 };
		answer = s.twoSum(testArray, 9);
		assert answer[0] == 1 && answer[1] == 2;
		
		testArray = new int[] { 5, 75, 25 };
		answer = s.twoSum(testArray, 100);
		assert answer[0] == 2 && answer[1] == 3;
		
		testArray = new int[] { -3, 4, 3, 90 };
		answer = s.twoSum(testArray, 0);
		assert answer[0] == 1 && answer[1] == 3;
	}
}
