package smartPoint;
import java.util.Scanner;

public class z512 {

	
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
//________________________________________512____________________________________
		int n = scan.nextInt();
		int m = scan.nextInt();
		int ar[][] = new int[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				ar[i][j] = scan.nextInt();
			}
		} 
		int res[][] = new int [m][n];
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				//res[m-1-j][i] = ar[i][j]; //512a
				 res[j][n-1-i] = ar[i][j];
			}
		}
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.format("%4d", res[i][j]);
			}
			System.out.println();
		}
		scan.close();
	}
}
