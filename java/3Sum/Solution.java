import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
	public List<List<Integer>> threeSum(int[] num) {
		// two pointer runner solution O(N^2 + NlogN)
		if (num.length < 3)
			return new ArrayList<List<Integer>>();
		Arrays.sort(num);
		List<List<Integer>> triplets = new ArrayList<>();
		for (int i = 0; i < num.length - 1;) {
			int j = i + 1;
			int k = num.length - 1;
			while (j < k) {
				int sum = num[i] + num[j] + num[k];
				// remove duplication when you move i,j or k
				if (sum > 0)
					while (num[k] == num[--k] && num[j] <= num[k] && j < k)
						;
				else if (sum < 0)
					while (num[j] == num[++j] && num[j] <= num[k] && j < k)
						;
				else {
					ArrayList<Integer> list = new ArrayList<>();
					list.add(num[i]);
					list.add(num[j]);
					list.add(num[k]);
					triplets.add(list);
					while (num[k] == num[--k] && num[j] <= num[k] && j < k)
						;
					while (num[j] == num[++j] && num[j] <= num[k] && j < k)
						;
				}
			}
			while (num[i] == num[++i] && i < num.length - 2)
				;
		}
		return triplets;
	}
}