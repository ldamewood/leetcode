import java.util.List;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();
		List<List<Integer>> result = s.threeSum(new int[] { -4, -4, -1, 0, 1,
				13, -12, 8, 4 });
		System.out.println(result.size());
		for (List<Integer> sum : result) {
			System.out.println(sum);
		}
		result = s.threeSum(new int[] { 0, 7, -4, -7, 0, 14, -6, -4, -12, 11,
				4, 9, 7, 4, -10, 8, 10, 5, 4, 14, 6, 0, -9, 5, 6, 6, -11, 1,
				-8, -1, 2, -1, 13, 5, -1, -2, 4, 9, 9, -1, -3, -1, -7, 11, 10,
				-2, -4, 5, 10, -15, -4, -6, -8, 2, 14, 13, -7, 11, -9, -8, -13,
				0, -1, -15, -10, 13, -2, 1, -1, -15, 7, 3, -9, 7, -1, -14, -10,
				2, 6, 8, -6, -12, -13, 1, -3, 8, -9, -2, 4, -2, -3, 6, 5, 11,
				6, 11, 10, 12, -11, -14 });
		System.out.println(result.size());
		for (List<Integer> sum : result) {
			System.out.println(sum);
		}
	}

}
