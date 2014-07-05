public class Solution {
	public double findMedianSortedArrays(int a[], int b[]) {
		double medA = this.median(a);
		double medB = this.median(b);
		System.out.println(medA + "," + medB);
		return 0;
	}

	public double median(int[] a, int[] b) {
		int totalLength = a.length + b.length;
		int half = (totalLength) / 2;
		if (a.length > b.length)
			if (totalLength % 2 == 1)
				return a[half];
			else
				return 0.5 * (a[half] + a[half + 1]);
		else if (a.length < b.length)
			if (totalLength % 2 == 1)
				return a[half];
			else
				return 0.5 * (b[half - a.length] + b[half + 1 - a.length]);
		else
			return 0.5 * (a[a.length-1] + b[0]);
	}

	public double median(int[] a) {
		int half = a.length / 2;
		if (a.length % 2 == 1)
			return a[half];
		else
			return 0.5 * (a[half - 1] + a[half]);
	}
}