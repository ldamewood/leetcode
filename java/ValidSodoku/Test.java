public class Test {

	public static void main(String[] args) {
		Solution s = new Solution();
		char[][] board = new char[9][9];
		for (int i = 0; i < 9; i++) {
			board[i] = ".........".toCharArray();
		}
		assert s.isValidSudoku(board);
		for (int i = 0; i < 9; i++) {
			board[i] = "111111111".toCharArray();
		}
		assert !s.isValidSudoku(board);
		board[0] = ".87654321".toCharArray();
		board[1] = "2........".toCharArray();
		board[2] = "3........".toCharArray();
		board[3] = "4........".toCharArray();
		board[4] = "5........".toCharArray();
		board[5] = "6........".toCharArray();
		board[6] = "7........".toCharArray();
		board[7] = "8........".toCharArray();
		board[8] = "9........".toCharArray();
		assert s.isValidSudoku(board);
	}

}
