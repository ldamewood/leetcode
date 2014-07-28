public class Solution {
	public int sqrt(int x) {
		double guess = x / 2;
		double corr = 1;
		while (guess * guess != x && corr > 0.1) {
			corr = guess * guess - x;
			guess += -corr / 2 / guess;
		}
		return (int) guess;
	}
}