import java.util.ArrayList;
import java.util.List;

public class Solution {

	private String[] vals = { " ", "", "abc", "def", "ghi", "jkl", "mno",
			"pqrs", "tuv", "wxyz" };

	public List<String> letterCombinations(String digits) {
		int dim = 1;
		for (int i = 0; i < digits.length(); i++)
			dim *= 4;
		ArrayList<String> result = new ArrayList<String>(dim);
		result.add("");
		int val, size;
		String cur;
		for (char digit : digits.toCharArray()) {
			val = digit - '0';
			size = result.size();
			for (int i = 0; i < size; i++) {
				cur = result.get(i);
				result.set(i, cur + vals[val].charAt(0));
				for (int j = 1; j < vals[val].length(); j++) {
					result.add(cur + vals[val].charAt(j));
				}
			}
		}
		return result;
	}
}