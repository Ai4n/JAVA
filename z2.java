package smartPoint;
import java.util.Scanner;

public class z2 {

	public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
		 int x, y;
				 float z, c;
				 x = scan.nextInt();
				
				 y = scan.nextInt();
				
				 z = scan.nextFloat();
				
				 c = (x * x + y - z / 2);
				 System.out.println(c);
				 scan.close();
	}
}
