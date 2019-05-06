package smartPoint;
import java.util.Scanner;
public class zarray2 {
//How many maximums array have?
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = 0;
		n = scan.nextInt();
		int[] array = new int[n];

		for (int i = 0; i < n; i++) {

			array[i] = scan.nextInt();
		}
		// max = 1000 nmax = 0

		int max = array[0];
		int nmax = 0;
		for (int i = 1; i < n; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		for (int i = 0; i < n; i++) {

			if (array[i] == max) {
				nmax++;
			}
		}
		System.out.println(nmax);
		scan.close();

	}

}
