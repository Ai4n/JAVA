package smartPoint;
import java.util.Scanner;
public class zTimeArray1 {

	public static void main(String[] args) {
		// Task for time compare in array
//      Times fomat is: hh mm ss
//      Find maximum
//		10 20 30 
//      7  30 00 
//		23 59 59
//		13 30 30 
		int n;
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		int[][] arraytime = new int[n][4];
		for (int i = 0; i < n; i++) { // move to rows
			arraytime[i][3] = arraytime[i][0] * 3600 + arraytime[i][1] * 60 + arraytime[i][2];
		}
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				if (arraytime[i][3] > arraytime[j][3]) {
					int temp[] = arraytime[i];
					arraytime[i] = arraytime[j];
					arraytime[j] = temp;
				}
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(arraytime[i][j] + " ");
			}
			System.out.println();
			scan.close();
		} // for(int j = 0; j < 3; j++) {
		// arraytime [i][j] = scan.nextInt();}
	}
}
