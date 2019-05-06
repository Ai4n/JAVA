package smartPoint;
import java.util.Scanner;

public class z1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

//		      вывод дней недели
		int day = 1;
		if (day == 1) {
			System.out.println("monday");
		} else if (day == 2)
			System.out.println("tuesday");
		else if (day == 3)
			System.out.println("wednesday");

		switch (day) {
		case 1:
			System.out.println("monday");
			break;
		case 2:
			System.out.println("tuesday");
			break;

		default:
			System.out.println("not a day");
		}
		scan.close();
	}

}
