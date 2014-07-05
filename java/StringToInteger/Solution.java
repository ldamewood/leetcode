public class Solution {

	static final String validChars = "0123456789";
	static final String validFirstChars = "+-";

	public int atoi(String str) {
		str = trim(str);
		if (str.length() == 0)
			return 0;
		int sign = 1;
		if (str.charAt(0) == '-') {
			str = str.substring(1);
			sign = -1;
		}
		if (str.charAt(0) == '+')
			str = str.substring(1);
		int result = 0;
		int charVal;
		for (int i = 0; i < str.length(); i++) {
			charVal = (int) str.charAt(i) - 0x30;
			if (sign * result > (Integer.MAX_VALUE - charVal)/10)
				return sign * Integer.MAX_VALUE;
			if (sign * result < (Integer.MIN_VALUE + charVal)/10)
				return sign * Integer.MIN_VALUE;
			result *= 10;
			result += charVal;
		}
		return sign * result;
	}

	private String trim(String str) {
		if (str.length() == 0) return "0";
		int start = 0;
		int end;
		while (start < str.length()
				&& (str.charAt(start) == ' ' || str.charAt(start) == '\t'))
			start++;
		int realStart = start;
		if (validFirstChars.contains(str.subSequence(start, start+1))) {
			start++;
		}
		for (end = start; end < str.length(); end++) {
			if (!validChars.contains(str.subSequence(end, end + 1)))
				break;
		}
		if (end - start == 0)
			return "0";
		return str.substring(realStart, Math.min(end, str.length()));
	}
}