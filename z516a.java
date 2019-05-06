package smartPoint;
import java.util.Scanner;

public class z516a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner scan = new Scanner(System.in);
	int n = scan.nextInt();
	int m = scan.nextInt();
	int ar[][] = new int[n][m];
	int array[] = new int[n * m];
	int k = 0;
	for (int i = 0; i < n; i++) {
		for (int j = 0; j < m; j++) {
			ar[i][j] = scan.nextInt();
			if (ar[i][j] > 0) {
				array[k] = ar[i][j];
				k++;
			}
		}
	}
	Sorting.sorting(array, true);
	for (int q : array) {
		if (q > 0) {
			System.out.print(q + " ");
		}
	}
	scan.close();
	}
}
//   		for (int i = 0; i < n; i++) {
//			if (i % 2 == 0) {
//				for (int j = 0; j < m; j++) {
//					ar[i][j] = k++;
//				}
//			} else {
//				for (int j = m-1; j >= 0; j--) {
//                  ar[i][j] = k++;
//				}
//			}
//			
//		}
//		
//		for (int i = 0; i < n; i++) {
//			for (int j = 0; j < m; j++) {
//				System.out.format("%4d", ar[i][j]);
//			}
//			System.out.println();
//		}
//	}
//		int a = 0;
//
//		int n;
//		int k = 1;
//		n = scan.nextInt();
//		int[][] a1 = new int[n][n];
//		for (int j = n - 1; j >= 0; --j) {
//			for (int i = n - 1; i >= 0; --i) {
//				a1[i][j] = k;
//				k++;
//			}
//		}		
//		ArrayMethods.printArray(n, a1);

