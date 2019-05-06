package smartPoint;
import java.util.Scanner;

public class z5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		 double answer = Math.sqrt(2);
		 int n = scan.nextInt();
		 for(int i = 1; i < n; i++) {
		 answer = answer + 2;
		 answer = Math.sqrt(answer);		
		 }
		 System.out.println(answer);
		 scan.close();
	}

}
