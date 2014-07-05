public class Solution {
	public String convert(String s, int nRows) {
		// Edge cases
		if (s.length() <= nRows)
			return s;
		if (nRows == 1)
			return s;

		char[] result = new char[s.length()];
		// Stride
		int n = 2 * nRows - 2;
		int pos = 0;

		// O( len(S)/nRows )
		for (int i = 0; i < nRows; i++) {
			int start = i;
			int nc = n - 2 * i;

			// Max of s.length / nRows
			while (start < s.length()) {
				if (nc > 0) {
					result[pos++] = s.charAt(start);
					start += nc;
				}
				if (n - nc > 0) {
					if (start < s.length())
						result[pos++] = s.charAt(start);
					start += (n - nc);
				}
			}
		}
		return new String(result);
	}
}