public class Solution {
	public int reverse(int x) {
		int z, result = 0;

		// z is abs(x)
		// pop LSD
		for (z = x < 0 ? -x : x; z > 0; z /= 10) {
			// Handle overflow explicitly
			if (result > (Integer.MAX_VALUE - z % 10) / 10) {
				return x < 0 ? Integer.MIN_VALUE : Integer.MAX_VALUE;
			}
			// shift LSD to result
			result = 10 * result + z % 10;
		}
		return x < 0 ? -result : result;
	}
}