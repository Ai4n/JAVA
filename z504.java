package smartPoint;
import java.util.Scanner;

public class z504 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//-----------------------504---------------------------
		int N = 0, M = 0;
		Scanner scan = new Scanner(System.in);
		N = scan.nextInt();
		M = scan.nextInt();
		int[][] array = new int[N][M];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				array[i][j] = scan.nextInt();// array fill
			}
		}

		int Ni = 0, Mj = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (array[i][j] == -1) {
					Ni = i + 1;
					Mj = j + 1;
					// break;// safe first or safe last
				}

			}
		}

		System.out.println(Ni + " " + Mj);
		scan.close();
	}

}
