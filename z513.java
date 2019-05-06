package smartPoint;
import java.util.Scanner;

public class z513 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
//________________________________________________________513_________________________
		String [][]array = {{"Tom",     "Mary",    "Jon",      "Rachel",   "Sherry"},
				
							{"555-3322","555-8976","555-1037","555-1400","555-8873"}};
        int index = -1;
        
//		String name = scan.next();
//		
//		for(int i = 0; i < array[0].length; i++) {
//			if(array[0][i].equals(name)) {
//				index = i; break;
//			}
//		}
//		
//		if(index != -1)
//			System.out.println(array[1][index]);
//		else {
//			System.out.println("no name");
//		}
//_____________________________________определение по 4-ем последним номерам
        String phone = scan.next();//3322
        
		for(int i = 0; i < array[1].length; i++) {
			if(phone.charAt(0) == array[1][i].charAt(4) && phone.charAt(1) == array[1][i].charAt(5) 
					&& phone.charAt(2) == array[1][i].charAt(6) && phone.charAt(3) == array[1][i].charAt(7)) {
				index = i;
				break;
			}
		} 		
		if(index < 0) {
			System.out.println("wrong number");
		}
		else {System.out.println(array[0][index]);}
		
		scan.close();
	}

}
