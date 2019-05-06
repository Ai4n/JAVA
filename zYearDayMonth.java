package smartPoint;
import java.util.Scanner;
public class zYearDayMonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		boolean answer = false;
		int day = scan.nextInt(), month = scan.nextInt(), year = scan.nextInt();
		if (year >= 0) {
			if (month <= 12 && month > 0) {
				if (month % 2 == 1 && month < 8 || month % 2 == 0 && month >= 8) {
					if (day > 0 && day < 32) {
						answer = true;
					}
				} else if (month == 4 || month == 6 || month == 9 || month == 11) {
					if (day > 0 && day < 31) {
						answer = true;
					}
				} else if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
					if (day > 0 && day < 30) {
						answer = true;
					} else if (day > 0 && day < 29) {
						answer = true;
					}
				}
			}
		}

		if (answer == true) {
			System.out.println("yes");
		} else
			System.out.println("no");
		    scan.close();
	}

}
