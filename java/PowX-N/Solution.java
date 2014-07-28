public class Solution {
	private double powOdd(double x, int n) {
		double result = 1.;
		System.out.println("Odd :" + result + " " + x + " " + n);
		if (n == 1)
			return x;
		result = result * x;
		n--;
		return result * powEven(x, n);
	}

	private double powEven(double x, int n) {
		double result = 1.;
		System.out.println("Even:" + result + " " + x + " " + n);
		while (n % 2 == 0) {
			result = result * x;
			n /= 2;
		}
		return result * powOdd(x, n);
	}

	public double pow(double x, int n) {
		if (x == 1.)
			return x;
		if (n % 2 == 0) {
			return powEven(x, n);
		} else {
			return powOdd(x, n);
		}
	}
}