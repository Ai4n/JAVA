package smartPoint;
public class z507 {

	public static void main(String[] args) {
//--------------------------507--------------------------

		int N = 4;
		int[][] a = { { 1, 2, 1, 2 }, { 3, 4, 3, 4 }, { 2, 3, 2, 3 }, { 1, 2, 3, 4 } };
		int sum = 0;
		// below
		for (int i = 0; i < N - 1; i++) { // under i = 1; i < N
			for (int j = i + 1; j < N; j++) {// under j = 0; j < i
				sum += a[i][j];
			}
		}
		System.out.println(sum);
	}

}
