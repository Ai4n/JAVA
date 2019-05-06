package smartPoint;
public class z509 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//_____________________________509_________________________	
		int n = 3, m = 4;
		int[][] a = { { 1, 2, 3, 1 }, { 1, 5, 6, 1 }, { 1, 1, 8, 1 } };
		int[] sum = new int[m];
		for (int j = 0; j < m; j++) {
			for (int i = 0; i < n; i++) {

				sum[j] += a[i][j];
			}
		}
		int indexMax = 0;
		int max = sum[0];
		for (int i = 0; i < m; i++) {
			if (sum[i] > max) {
				max = sum[i];
				indexMax = i;
			}
		}
		System.out.println(max + " " + indexMax);

	}

}
