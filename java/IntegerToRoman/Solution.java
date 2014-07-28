public class Solution {

	private String underTen(int val, char places[]) {
		switch (val) {
		case 0:
			return "";
		case 1:
			return "" + places[0];
		case 2:
			return "" + places[0] + places[0];
		case 3:
			return "" + places[0] + places[0] + places[0];
		case 4:
			return "" + places[0] + places[1];
		case 5:
			return "" + places[1];
		case 6:
			return "" + places[1] + places[0];
		case 7:
			return "" + places[1] + places[0] + places[0];
		case 8:
			return "" + places[1] + places[0] + places[0] + places[0];
		case 9:
			return "" + places[0] + places[2];
		}
		return "";
	}

	public String intToRoman(int num) {
		String result = "";
		result = underTen(num % 10, new char[] { 'I', 'V', 'X' });
		num /= 10;
		result = underTen(num % 10, new char[] { 'X', 'L', 'C' }) + result;
		num /= 10;
		result = underTen(num % 10, new char[] { 'C', 'D', 'M' }) + result;
		num /= 10;
		for (int i = 0; i < num; i++)
			result = "M" + result;
		return result;
	}
}