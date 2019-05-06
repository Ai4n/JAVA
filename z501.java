package smartPoint;
import java.util.Scanner;

public class z501 {

	public static void main(String[] args) {
//----------------------------------------501
		int N = 0, M = 0;
		Scanner scan = new Scanner(System.in); // scan initialization
		N = scan.nextInt(); // enter N value

		if (1 < N && N < 100) { // check N
			M = scan.nextInt();// enter M value
			if (1 <= M && M <= 100) {// check M
				// array making
				int[][] array = new int[N][M];
				for (int i = 0; i < N; i++) {
					for (int j = 0; j < M; j++) {
						array[i][j] = scan.nextInt();// array fill
					}
				}
				System.out.println("Двумерный массив:");
				for (int i = 0; i < array.length; i++) {
					for (int j = 0; j < array[i].length; j++) {
						System.out.format("%4d", array[i][j]);
					}
					System.out.println();
				}
				int min = array[0][0];

				for (int i = 0; i < array.length; i++) {
					for (int j = 0; j < array[0].length; j++) {
						if (min > array[i][j]) {
							min = array[i][j];
						}
					}
				}
				System.out.print("Минимальный элемент " + min + " \n\n");

			} else
				System.out.println("M Out of range");
		} else
			System.out.println("N Out of range");
		scan.close();
	}

}
