package smartPoint;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
//	int n = scan.nextInt();
//	
//	int arr1[] = new int[n];
//	int arr2[] = new int[n];
//	
//	scanArray(arr1, scan);
//	scanArray(arr2, scan);
//
//	String str = comp(arr1, arr2);

		// homework - 6 week
		// not to do 609-611
		// power(3,4);

		// System.out.println(power(3,4));
		// Scanner scan = new Scanner(System.in);
		/*
		 * int n = scan.nextInt();//3 int m = scan.nextInt();//4
		 * 
		 * int array [][] = new int[n][m]; int arrayOut[] = new int [n];
		 * 
		 * for(int i = 0; i < n; i++) { for(int j =0; j < m; j++) { array [i][j] =
		 * scan.nextInt(); if(array [i][j] > 0) { ++arrayOut[i]; } } }
		 * 
		 * int index = 0; int max = arrayOut[0];
		 * 
		 * //7 6 5 3 //0 9 8 2 //0 0 0 5
		 * 
		 * for(int i = 0; i < n; i++) { if(arrayOut[i] > max) { max = arrayOut[i]; index
		 * = i; } }
		 * 
		 * //max int counter = 0; for(int i = 0; i < n; i++) { if(arrayOut[i] == max) {
		 * ++counter; } }
		 * 
		 * if(counter > 1) { System.out.println("Number are equal"); }else
		 * System.out.println(index + 1);
		 * 
		 */

		// 4 4 4 2 2 7 7 7 7 7 7 8 8 8 6

//	int n = scan.nextInt();
//	int m = scan.nextInt();
//	int array[][] = new int[n][m];
//	int arrayOut[] = new int[n];
//	int max = 0;
//	int index = 0;
//	for (int i = 0; i < n; i++) {
//		for (int j = 0; j < m; j++) {
//			array[i][j] = scan.nextInt();
//		}
//		arrayOut[i] = arrayRow(array[i]);
//		if (max < arrayOut[i]) {
//			max = arrayOut[i];
//			index = i;
//		}
//	}

		// String text = scan.nextLine();

//	System.out.println(convertUpc(text)); 613
		// System.out.println(convert(text)); //614

		// String time1 = scan.next(), time2 = scan.next();
		// Input: 02:34:45 02:35:00

		// Output: 00:00:15
		// System.out.println(calculateTime(calculateSeconds(time2) -
		// calculateSeconds(time1)));
		// "1100"
		// "0011";
		// String digitSequence = scan.next();
//	int x = scan.nextInt();
//	System.out.println(decTostr(x));

// 5      10 12 13 15 10
		// Одеть в метод int n = scan.nextInt();
//	int[]array = new int[n];
//	for(int i = 0; i < n; i++) {
//		array[i] = scan.nextInt();
//	}
//	int min = Integer.MAX_VALUE;
//
//	int index1 = 0;
//	int index2 = 0;
//	if(Math.abs(array[0] - array[n - 1]) < min) {
//				min = Math.abs(array[0] - array[n - 1]);
//				index1 = 0;
//				index2 = n - 1;
//	}
//	
//	for (int i = 0; i < array.length - 1; i++) {
//		if(Math.abs(array[i] - array[i + 1]) < min) {
//			index1 = i;
//			index2 = i + 1;
//			min = Math.abs(array[i] - array[i + 1]);
//		}
//	}    
//	

//	System.out.println(++index1 + " " + ++index2);
//	String expression = scan.next();
//	if(checkIsCorrect(expression) == true) {
//		System.out.println("YES");
//	} else System.out.println("NO");	

		// homework 804 806 813*
		// 12 32 34 54 3 9 17 44
		// 12 34 3 17

		// 1 2 3 4 5 6 7 8 positions
		// 0 1 2 3 4 5 6 7 i

		//
//	int n = scan.nextInt();
//	int[]array = new int[n];
//	for(int i = 0; i < array.length; i ++) {
//		array[i] = scan.nextInt();
//	}
//	arrSortOE(array);
		// 1u[nivercity11
		// univercity
//	String message = scan.next();
//	String message2 = scan.next();
//	messComp(message, message2);
//	if(messComp(message, message2)) {
//	System.out.println("YES");
//	} System.out.println("NO");

//	String word = scan.next();
//	palindrom(word);
//	if(palindrom(word)) {
//		System.out.println("YES");
//	}else System.out.println("NO");

		// homework!!! 812

		// XPSE
		// WORD
//	String inText = scan.next();
//	int k = scan.nextInt();
//	String outText = cipher(inText, k);		
//	
//	System.out.println(deCipher(outText, k));
		// 127.111.00 0
		// 01234567891011
		// true
//	String ipTextin = scan.nextLine();
//	
//	if(ipOut(ipTextin)) {
//		System.out.println("YES");
//	} 
//	else
//	System.out.println("NO");
		// homework 815
		// first:
		// create method which inputs one ticket
		// and output if the ticket is lucky (boolean)

		// 11111110 1
		// 11111112
//	Scanner scan = new Scanner(System.in);
//	String n1 = scan.nextLine();
//	String n2 = scan.nextLine();
//
//	System.out.println(answerN(n1, n2));

//	if(asnw("12345500")) {
//		System.out.println("YES");
//	} else System.out.println("NO");
		String inPut = scan.nextLine();
		if (iituF(inPut)) {
			System.out.println("YES");
		} else
			System.out.println("NO");
//		System.out.println("Hello");
		scan.close();
	}

	static boolean iituF(String inPut) {
		String N = "IITU";
		for (int i = 0; i < inPut.length(); i++) {
			if (inPut.charAt(i) == N.charAt(0) && inPut.charAt(i + 1) == N.charAt(1)
					&& inPut.charAt(i + 2) == N.charAt(2) && inPut.charAt(i + 3) == N.charAt(3)) {

				return true;
			}
		}
		return false;
	}

	static boolean asnw(String n) {
		// 1234 5500
		String fHalf = "", sHalf = "";

		int fNum = 0, sNum = 0;

		fHalf = n.substring(0, n.length() / 2);
		sHalf = n.substring(4, n.length());
		for (int i = 0; i < n.length() / 2; i++) {
			fNum += fHalf.charAt(i);
			sNum += sHalf.charAt(i);
		}
		// 10 13

		if (fNum == sNum) {
			return true;
		}

		return false;
	}

	public static int answerN(String n1, String n2) {
		int iN1 = Integer.valueOf(n1);
		int iN2 = Integer.valueOf(n2);
		int dif = iN2 - iN1;
		int count = 0;

		for (int i = 0; i < dif; i++) {
			if (asnw(String.valueOf(iN1))) {
				count += 1;
			}
			iN1 += 1;
		}
		return count;
	}

	static boolean ipOut(String ipTextin) {
		int ip1d = 0, ip2d = 0, ip3d = 0, ip4d = 0;
		int i = 0;
		for (; ipTextin.charAt(i) != '.'; i++)
			;
		String ip1 = ipTextin.substring(0, i);
		ip1d = Integer.valueOf(ip1);
		if (!(ip1d < 256 && ip1d >= 0)) {
			return false;
		}
		int beginD = i + 1;
		for (i = beginD; ipTextin.charAt(i) != '.'; i++)
			;
		String ip2 = ipTextin.substring(beginD, i);
		ip2d = Integer.valueOf(ip2);
		if (!(ip2d < 256 && ip2d >= 0)) {
			return false;
		}
		beginD = i + 1;
		for (i = beginD; ipTextin.charAt(i) != '.'; i++)
			;
		String ip3 = ipTextin.substring(beginD, i);
		ip3d = Integer.valueOf(ip3);
		if (!(ip3d < 256 && ip3d >= 0)) {
			return false;
		}
		beginD = i + 1;
		String ip4 = ipTextin.substring(beginD, ipTextin.length());
		ip4d = Integer.valueOf(ip4);
		if (!(ip4d < 256 && ip4d >= 0)) {
			return false;
		}
		System.out.println(ip1d + " " + ip2d + " " + ip3d + " ");
		return true;
	}

	static String cipher(String inText, int k) {
		String plainText = "";

		for (int i = 0; i < inText.length(); i++) {
			if ((inText.charAt(i) >= 'A' && inText.charAt(i) <= 'Z')) {
				plainText += (char) ((((inText.charAt(i) - 'A') - k + 26 * ((k + 26) / 26)) % 26) + 'A');
			}
		}
		return plainText;
	}

	static String deCipher(String plainText, int k) {
		String inText = "";
		for (int i = 0; i < plainText.length(); i++) {
			if ((plainText.charAt(i) >= 'A' && plainText.charAt(i) <= 'Z')) {
				inText += (char) (((((plainText.charAt(i)) - 'A') + k) % 26) + 'A');
			}
		}
		return inText;
	}

//	retStr(message);
//	System.out.println(retStr(message));

	static boolean palindrom(String word) {
		for (int i = 0; i < (word.length() / 2);) {
			i += 1;
			if (word.charAt(i) != word.charAt(word.length() - 1 - i)) {
				return false;
			}
			return true;

		}
		return false;

	}

	static boolean messComp(String message, String message2) {
		if (!(message.length() == message2.length()))
			return false;
		for (int i = 0; i < message.length(); i++) {
			if (message.charAt(i) != message2.charAt(i)) {
				return false;
			}
		}
		return true;
	}

	static String retStr(String message) {
		String newMess = "";
		for (int i = 0; i < message.length(); i++) {
			if (isAlpha(message.charAt(i))) {
				newMess += message.charAt(i);
			}
		}

		return newMess;

	}

	static boolean isAlpha(char x) {
		if ((x >= 'a' && x <= 'z') || (x >= 'A' && x <= 'Z')) {
			return true;
		}
		return false;
	}

	static int arrSortOE(int[] array) {
		int[] arrayTmp = new int[array.length];
		int j = 0;
		for (int i = 0; i < array.length; i += 2) {
			arrayTmp[j] = array[i];
			j++;
		}
		for (int i = 1; i < array.length; i += 2) {
			arrayTmp[j] = array[i];
			j++;
		}

		for (int k = 0; k < array.length; k++) {
			System.out.print(" " + arrayTmp[k]);
		}

		return array[0];
	}

	static boolean checkIsCorrect(String expression) {
		// "2+3*+"
		for (int i = 0; i < expression.length(); i++) {
			if (!((expression.charAt(i) >= '0' && expression.charAt(i) <= '9') // Character.isDigit(expression.charAt(i))
					|| checkIsSign(expression.charAt(i)))) {
				return false;
			}
			if (checkIsSign(expression.charAt(i))) {
				if (checkIsSign(expression.charAt(i + 1))) {
					return false;
				}
			}

		}
		return true;
	}

	static boolean checkIsSign(char x) {
		if (x == '+' || x == '-' || x == '/' || x == '*') {
			return true;
		}
		return false;
	}

	static String decTostr(int x) {
		// 35 1

		// 100011
		// 110001
		String str = "";
		String rewStr = "";
		while (x != 0) {
			str += (char) ((x % 2) + 48);// '1'
			x /= 2;
		}
		for (int i = str.length() - 1; i >= 0; i--) {
			rewStr += str.charAt(i);
		}

		return rewStr;
	}

	static int strToDec(String x) {
		// 100011 1+2+0+0+0+32=35
		int finalAnswer = 0;

		for (int i = x.length() - 1, n = 0; i >= 0; i--, n++) {
			int temp = (x.charAt(i) - 48);
			finalAnswer += temp * Math.pow(2, n);

			if (i == 0) {
				System.out.print(temp * (int) Math.pow(2, n));
			} else
				System.out.print(temp * (int) Math.pow(2, n) + "+");

		}
		System.out.print(" = ");
		return finalAnswer;
	}

	static int calculateSeconds(String time) {
		// "12:34:45"
		// '1' = 49-48 = 1
		// int hour = (time.charAt(0) - 48) * 10 + (time.charAt(1) - 48);//10

		String hours = time.substring(0, 2);// 12
		String min = time.substring(3, 5);// 34
		String sec = time.substring(6, 8);// 45

		int h = Integer.valueOf(hours);
		int m = Integer.valueOf(min);
		int s = Integer.valueOf(sec);

		return h * 3600 + m * 60 + s;
	}

// 3600 = 01:00:00
// 541/3600 = 0

// 541/60 = 9

// 541%60 = 1

	static String calculateTime(int seconds) {
		String result = "";
		int hours = seconds / 3600; // 3661
		int minutes = (seconds % 3600) / 60;
		int sec = (seconds % 3600) % 60;
		if (hours < 10) {
			result += "0" + String.valueOf(hours); // "97"
		} else {
			result += String.valueOf(hours);
		}
		result += ":";
		if (minutes < 10) {
			result += "0" + String.valueOf(minutes);
		} else {
			result += String.valueOf(minutes);
		}
		result += ":";
		if (sec < 10) {
			result += "0" + String.valueOf(sec);
		} else {
			result += String.valueOf(sec);

		}
		return result;
	}

	static String convert(String message) {
		String newMessage = "";

		for (int i = 0; i < message.length(); i++) {
			if (Character.isUpperCase(message.charAt(i))) {
				newMessage += (char) (message.charAt(i) + 32);

			}
			if (message.charAt(i) >= 'a' && message.charAt(i) <= 'z') {
				newMessage += (char) (message.charAt(i) - 32);
			}

		}

		return newMessage;
	}

	static int arrayRow(int array[]) { // what you set
		int max = 1;
		int maxTmp = 1;
		for (int i = 0; i < array.length - 1; i++) {
			maxTmp = 1; // каждый раз "обнулять" временную переменную
			for (; array[i] == array[i + 1];) {
				++maxTmp;
				// check for end of array
				if (i + 1 < array.length - 1)
					i++;
				else
					break; // method quit
			}

			if (max < maxTmp) {
				max = maxTmp;
			}

		}

		return max; // what you get

	}

	static String convertUpc(String message) {
		// message "Hello"
		// HELLO

		String newMessage = "";
		for (int i = 0; i < message.length(); i++) {
			if (message.charAt(i) >= 'a' && message.charAt(i) <= 'z') { // y Y
				newMessage += (char) (message.charAt(i) - 32);
			} else
				newMessage += message.charAt(i);

			System.out.println(newMessage);
		}
		return newMessage;
	}
	// 601 ___________________________________________________

	static int min(int a, int b, int c, int d) {

		int x = a;
		if (b < x) {
			x = b;
		}
		if (c < x) {
			x = c;
		}
		if (d < x) {
			x = d;
		}

		return x;
	}

	// 602 ___________________________________________________
	static double power(double x, int n) { // 3 4 3*3*3*3

		double answer = 1;

		for (int i = 0; i < n; i++) {
			answer *= x;
		}
		return answer;
	}

	// 603 ___________________________________________________
	static boolean myxor(boolean x, boolean y) {

		if (x != y) {
			return true;
		}

		return false;

	}

	// 604 ___________________________________________________
	static boolean election(boolean x, boolean y, boolean z) {
		if (x != y) {
			return true;
		}
		if (y != z) {
			return true;
		}
		return false;
	}

	// 605 ___________________________________________________
	static char sign(int a, int b) {
		// 7 5
		if (a < b) {
			return '<';
		} else if (a > b) {
			return '>';
		}
		return '=';

	}

	// countPos
	// 6 3 4 9 0 6
	static int countPos(int array[]) {
		int a = 0;
		for (int k : array) {
			if (k > 0) {
				a += 1;
			}
		}

		return a;
	}

	static String comp(int arr1[], int arr2[]) {
		int a1 = 0, a2 = 0;

		a1 = countPos(arr1);
		a2 = countPos(arr2);

		if (a1 > a2) {
			return "Number of positives in the first array is greater";
		}

		if (a1 < a2) {
			return "Number of positives in the second array is greater";
		}

		return "Equal";
	}

	static void scanArray(int array[], Scanner scan) {
		for (int i = 0; i < array.length; i++) {
			array[i] = scan.nextInt();
		}
	}

}
