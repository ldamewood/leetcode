public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();
		int[] l;
		l = new int[] { 1, 4, 3, 4, 4, 4, 5, 6, 7, 4 };
		System.out.println(s.removeElement(l, 4));
		for (int i = 0; i < l.length; i++) {
			System.out.print(l[i] + " ");
		}
		System.out.println();
		l = new int[] { 4, 4 };
		System.out.println(s.removeElement(l, 4));
		for (int i = 0; i < l.length; i++) {
			System.out.print(l[i] + " ");
		}
		System.out.println();
		l = new int[] { 1, 2, 3 };
		System.out.println(s.removeElement(l, 4));
		for (int i = 0; i < l.length; i++) {
			System.out.print(l[i] + " ");
		}
		System.out.println();
		l = new int[] { -1, 4, -1, 4, -1, 4, -1, 4 };
		System.out.println(s.removeElement(l, 4));
		for (int i = 0; i < l.length; i++) {
			System.out.print(l[i] + " ");
		}
		System.out.println();
	}
}
