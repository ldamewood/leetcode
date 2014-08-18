public class Solution {
	public int removeElement(int[] A, int elem) {
		int i = 0;
		int j = A.length - 1;
		int tmp;
		while (j > 0 && A[j] == elem)
			j--;
		while (i <= j) {
			if (A[i] == elem) {
				tmp = A[j];
				A[j] = A[i];
				A[i] = tmp;
				j--;
			}
			i++;
		}
		return j + 1;
	}
}
