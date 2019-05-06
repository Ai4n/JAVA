package smartPoint;
public class zChar_arr1 {

	public static void main(String[] args) {
//      AAAABBBCDD
//      counter
//    Sample output 2:
//  Подсчет количества букв в массиве
		char array[] = { 'A', 'A', 'A', 'B', 'B', 'C' };

		for (int i = 0; i < array.length;) {
			int counter = 1;
			if (i < array.length - 1) {
				while (array[i] == array[i + 1]) {
					counter++;
					i++;
				}
			}
			System.out.println(array[i] + " " + counter);
			i++;
		}

	}

}
