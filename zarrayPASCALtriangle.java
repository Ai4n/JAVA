package smartPoint;
import java.util.Scanner;
public class zarrayPASCALtriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// Pascal piramid array
		Scanner scan = new Scanner(System.in);
		int n;
		n = scan.nextInt();
		int[][] pascal = new int[n][n];
		for (int i = 0; i < n; i++) {
			pascal[i][0] = 1;
			pascal[i][i] = 1;
		}
		for (int i = 2; i < n; i++) {
			for (int j = 1; j < i; j++) {
				pascal[i][j] = pascal[i - 1][j] + pascal[i - 1][j - 1];
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(pascal[i][j] + " ");
			}
			System.out.println();
			scan.close();
		}
	}
}
