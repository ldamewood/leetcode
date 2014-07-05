import java.util.Arrays;
import java.util.Random;

public class Test {
	public static void main(String[] args) {
		Solution s = new Solution();
		Random r = new Random();
		int[] a = new int[10];
		int[] b = new int[10];
		int[] c = new int[20];
		for (int i = 0; i < 10; i++) {
			a[i] = r.nextInt(100);
			b[i] = r.nextInt(100);
			c[i] = a[i];
			c[i + 10] = b[i];
		}
		s.findMedianSortedArrays(a, b);
	}
}
