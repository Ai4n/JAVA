package smartPoint;
import java.util.Scanner;
public class zYear_Check {

	public static void main(String[] args) {
		// Проверка високосного года
		Scanner scan = new Scanner(System.in);
		int year = scan.nextInt();
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			System.out.println("366");
		} else {
			System.out.println("365");
			scan.close();
		}
	}

}
