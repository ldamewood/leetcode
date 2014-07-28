public class Test {

	public static void main(String[] args) {
		for (int N = 1; N < 100000; N *= 2) {
			int sum = 0;
			for (int i = 0; i < N * N; i++)
				for (int j = i; j < N; j++)
					sum++;
			System.out.println(N + "\t" + sum);
		}
	}

}
