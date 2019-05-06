package smartPoint;
import java.util.Scanner;
public class zYearDayMonth1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int day = scan.nextInt();
		int month = scan.nextInt();
		int year = scan.nextInt();

		boolean isLeap = year % 4 == 0 && year % 100 != 0 || year % 400 == 0,
				isThirtyOne = month % 2 == 1 && month < 8 || month % 2 == 0 && month >= 8,
				isThirty = (month == 4 || month == 6 || month == 9 || month == 11);
		if (year >= 0) {
			if (month <= 12 && month > 0 && month != 2) {
				if (isThirtyOne) {
					if (month == 12 && day == 31) {
						month = 1;
						day = 1;
						year++;
					} else if (month != 12 && day == 31) {
						day = 1;
						month++;
					} else
						day++;
				} else if (isThirty && day == 30) {
					day = 1;
					month++;
				} else
					day++;
			} else if (isLeap) {
				if (day != 29)
					day++;
				else {
					day = 1;
					month++;
				}
			} else if (day == 28) {
				day = 1;
				month++;
			} else
				day++;
		}
		System.out.println(day + " " + month + " " + year);
        scan.close();
	}

}
