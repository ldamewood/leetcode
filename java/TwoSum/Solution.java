import java.util.Arrays;
import java.util.Comparator;

public class Solution {
	public int[] twoSum(int[] numbers, int target) {
		Integer[] index = indexSort(numbers);
		int minVal = numbers[index[0]];

		// Ignore values less than target
		int end = 0;
		while (end < index.length && numbers[index[end]] <= target - minVal)
			end++;

		for (int i = 0; i < end; i++) {
			int check = target - numbers[index[i]];
			int j = search(numbers, index, check, 0, end);
			if (j > -1) {
				if (index[i] < index[j])
					return new int[] { index[i] + 1, index[j] + 1 };
				else
					return new int[] { index[j] + 1, index[i] + 1 };
			}
		}
		return null;
	}

	private int search(int[] a, Integer[] i, int val, int l, int r) {
		int half = (l + r) / 2;
		if (r - l < 1 || l > i.length || r > i.length)
			return -1;
		if (a[i[half]] == val)
			return half;
		else if (a[i[half]] < val)
			return search(a, i, val, half + 1, r);
		else
			return search(a, i, val, 0, half);
	}

	private Integer[] indexSort(final int[] a) {
		Integer[] idx = new Integer[a.length];
		for (int i = 0; i < a.length; i++)
			idx[i] = i;
		Arrays.sort(idx, new Comparator<Integer>() {
			@Override
			public int compare(final Integer o1, final Integer o2) {
				return Integer.compare(a[o1], a[o2]);
			}
		});
		return idx;
	}
}
