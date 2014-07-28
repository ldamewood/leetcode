import java.util.HashSet;

public class Solution {
	public boolean isValidSudoku(char[][] board) {
		HashSet<Character> hashA = new HashSet<Character>();
		HashSet<Character> hashB = new HashSet<Character>();
		HashSet<Character> hashC = new HashSet<Character>();
		int k, l;
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				k = 3 * (i % 3) + j % 3;
				l = 3 * (i / 3) + j / 3;
				if (board[i][j] != '.' && hashA.contains(board[i][j]))
					return false;
				if (board[j][i] != '.' && hashB.contains(board[j][i]))
					return false;
				if (board[l][k] != '.' && hashC.contains(board[l][k]))
					return false;
				hashA.add(board[i][j]);
				hashB.add(board[j][i]);
				hashC.add(board[l][k]);

			}
			hashA.clear();
			hashB.clear();
			hashC.clear();
		}
		return true;
	}
}