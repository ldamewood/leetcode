public class Solution {
	public boolean isPalindrome(int x) {
		if (x < 0)
			return false;
		int reverse = 0, z;
		int c = 0;
		for (z = x < 0 ? -x : x; z > 0; z /= 10) {
			c = z % 10;
			if (reverse > (Integer.MAX_VALUE - c) / 10)
				return false;
			reverse *= 10;
			reverse += c;
		}
		return x < 0 ? -x == reverse : x == reverse;
	}
}