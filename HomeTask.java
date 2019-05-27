package smartPoint;

import java.util.Scanner;

public class HomeTask {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
//		String inPut = scan.nextLine();
//		if (iituF(inPut)) {
//			System.out.println("YES");
//		} else
//			System.out.println("NO");
		// homework:
		// repeat searching substring in string by own method
		// 9th week 903...911
//		String inPut = scan.nextLine();
//		replace(inPut);
//        System.out.println(replace(inPut));
		// ______903__________________________
		// 3
		// 15 2434 624876 928347238974 2834981237
//		int n = scan.nextInt();
//		scan.skip("\n");
//		//scan.nextLine();
//		String inPut = scan.nextLine();
//
//		//System.out.println(inPut);
//		System.out.println(sortIn(inPut, n));
		// Can you can the can with can?
		// CAN 2
		// YOU 1

//		String inPut = scan.nextLine();
//		inPut = inPut.toUpperCase();
//		//String[] keys = new String[100];
//		//int [] values = new int[100];
//		int iBeg = 0; //int iEnd = 0;
//		int counterW = 0;
//		for(int i = 0; i < keys.length; i++) keys[i] = "";
//		
//		for(int i = 0; i < inPut.length(); i++) {
//			if(inPut.charAt(i) == ' ' || inPut.charAt(i) == '?' 
//					|| inPut.charAt(i) == '!' || inPut.charAt(i) == '.' 
//					|| inPut.charAt(i) == ',' || inPut.charAt(i) == ':') {
//				 if(finDer(keys, inPut.substring(iBeg, i)) != -1) {
//					 int index = finDer(keys, inPut.substring(iBeg, i));
//					 values[index]++;
//				 } else { 
//					// counterW
//					 keys[counterW] = inPut.substring(iBeg, i);
//					 values[counterW] = 1;
//					 ++counterW;
//				 }
//				//System.out.println(inPut.substring(iBeg, i));
//				iBeg = i + 1;
//			}
//		}
//		
//		for(int i = 0; i < counterW; i++) {
//			System.out.println(keys[i] + " " + values[i]);
//		}

		// Can you can the can with can?
		// CAN 2
		// CAN CAN YOU
		// 101redtfyguh102
		// 102
//		String inPutLine = scan.nextLine();
//		String number = findLineMax(inPutLine);
//		System.out.println(outPutNumber(number));
//		scan.close();
		// String s1, s2, s3;
		// 10012
		// 10011
		// 234 567 890
		// 1 - '49'
		// 2 - '50'
//		String str1 = scan.next();
//		String str2 = scan.next();
//		String str3 = scan.next();
		// System.out.println(findMax(str1, str2, str3));

		// String num1 = scan.next();
		// String num2 = scan.next();

//		   String inPutLine = scan.next();
//		   String arrow1 = ">>-->";
//		   String arrow2 = "<--<<";
		// System.out.println(multOfNum(num1, num2));
		// System.out.println(sumOfNum(num1, num2));
//		boolean flag = checkNum(num1, num2);
//		if (flag == true) {
//			System.out.println("YES");
//		} else
//			System.out.println("NO");
//		System.out.println(subsTwoNum(num1, num2));
//		System.out.println(calcNum(inPutLine, arrow1, arrow2));
//		int n = scan.nextInt();
//		int m = scan.nextInt();
		// System.out.print();
//		crossTab(n,m);
		String inPutLine = scan.nextLine();
		System.out.println(calcAverWord(inPutLine));
		// x.x.x
		// .x.x.
		scan.close();
	}

	static float calcAverWord(String inPutLine) {
		float amount = 0;
		int countBack = 0;
		String wordLine = "";
		//     *  *   *     *       *
		// This is div2 easy problem.#
		// 4.0
		int len = inPutLine.length();
		for (int i = 0; i < len - 1; i++) {
			if (isItLett(inPutLine.charAt(i))) {
				wordLine += inPutLine.charAt(i);
				if(!(isItLett(inPutLine.charAt(i + 1)) )){
					countBack++;
				}
			}
		//a b 
		//1
		}
		//System.out.println(wordLine);
		//System.out.println(wordLine.length());
		if(isItLett(inPutLine.charAt(len - 1))){
			countBack++;
		}System.out.println(countBack);
		amount = (float) (wordLine.length()) / countBack ;
		return amount;
	}

	static boolean isItLett(char a) {
		if (a >= 'A' && a <= 'Z' || a >= 'a' && a <= 'z') {
			return true;
		}
		return false;
	}

	static void crossTab(int n, int m) {
		String x = "";
		String y = "";
		// 6
		// .x.x.x x
		// x.x.x. y
		for (int j = 0; j < m; j++) {
			if (j % 2 == 0) {
				x += 'X';
				y += '.';
			} else {
				x += '.';
				y += 'X';
			}
		}
		for (int i = 0; i < n; i++) {
			if (n % 2 == 0) {
				System.out.println((i % 2 == 0) ? x : y);
			} else {
				System.out.println((i % 2 == 0) ? y : x);
			}
//			if(n % 2 == 0) {
//				if(i % 2 == 0) {
//					System.out.println(x);
//				} else System.out.println(y);
//			} else {
//				if(i % 2 == 0) {
//				System.out.println(y);
//				} else System.out.println(x);
//			}
		}
	}

	static int calcNum(String inPutLine, String arrow1, String arrow2) {
		// <<<<>>--><--<<--<<>>>--><<<<<
		// num =

		int num = 0;
		for (int i = 0, j = 0; i < inPutLine.length() - arrow1.length(); i++) {

			if (countSubsIn(inPutLine, arrow1, i, j) || countSubsIn(inPutLine, arrow2, i, j)) {
				++num;
			}

		}
		return num;

	}

	static boolean countSubsIn(String inPutLine, String substring, int i, int j) {

		while (inPutLine.charAt(i) == substring.charAt(j)) {
			j++;
			i++;
			if (j == substring.length()) {
				return true;
			}
		}

		return false;
	}
	// 111111 // minus
	// 77

	static String subsTwoNum(String num1, String num2) {
		String result = "";
		String max = "";
		String min = "";
		if (num1.length() != num2.length()) {
			while (num1.length() > num2.length()) {
				num2 = '0' + num2;
			}
			while (num1.length() < num2.length()) {
				num1 = '0' + num1;
			}

		}
		max = compTwoDig(num1, num2);
		if (max.equals(num1)) {
			min = num2;
		} else
			min = num1;
		// ,
		// 11031
		// 00042
		// 989
		int temp;
		boolean flag = false;
		for (int i = max.length() - 1; i >= 0; i--) {
			if (!flag) {
				if (max.charAt(i) < min.charAt(i)) {
					temp = (int) ((max.charAt(i) + 10) - min.charAt(i));
					flag = true;
				} else {
					temp = (int) (max.charAt(i) - min.charAt(i));
				}

			} else {
				if ((max.charAt(i) - 1) >= min.charAt(i)) {
					temp = (int) ((max.charAt(i) - 1) - min.charAt(i));
					flag = false;
				} else {
					temp = (int) ((max.charAt(i) - 1) - min.charAt(i) + 10);
					flag = true;
				}
			}
			result += temp;

			System.out.println(temp);
		}
		// System.out.println(max + " " + min);
		return reverse(result);
	}

	static boolean checkNum(String number, String divider) {
		String tempDiv = divider; // "11"

		if (number.equals(divider)) {
			return true;
		}
		while (compTwoDig(number, tempDiv).equals(number)) {
			tempDiv = sumOfNum(tempDiv, divider);
			if (tempDiv.equals(number)) {
				return true;
			}
		}
		return false;
	}

	// *
	// 3 111 = 0+111+111+111
	// 222
	static String multOfNum(String num1, String num2) {
		String answer = "0";
		String maxTmp = num1;
		String count = num2;
		if (num1.length() != num2.length()) {
			if (num1.length() > num2.length()) {
				maxTmp = num1;
				count = num2;
			} else {
				maxTmp = num2;
				count = num1;
			}
		}

		for (long i = 0; i < Long.valueOf(count); i++) {
			answer = sumOfNum(maxTmp, answer);
		}

		return answer;
	}

	//
	// 1272376324893
	// 0000356482714
	static String sumOfNum(String num1, String num2) {
		if (num1.length() != num2.length()) {
			if (num1.length() > num2.length()) {
				while (!(num2.length() == num1.length())) {
					num2 = '0' + num2;
				}
			} else {
				while (!(num1.length() == num2.length()))
					num1 = "0" + num1;
			}
		}
		byte tempNum; // this number is not more than 9 (0....9)
		boolean sign = false;
		String answer = "";
		//
		// 1272376324893
		// 0000356482714
		for (int i = num1.length() - 1; i >= 0; i--) {
			tempNum = (byte) ((num1.charAt(i) - 48) + (num2.charAt(i) - 48));
			if (sign == true) {
				tempNum++;
			}
			if (tempNum > 9) {
				sign = true;
				tempNum %= 10;
				answer += (char) (tempNum + 48);
			} else {
				answer += (char) (tempNum + 48);
				sign = false;
			}
		}
		if (sign == true) {
			answer += '1';
		}
		return reverse(answer);

	}

	static String findMax(String number1, String number2, String number3) {

		String maxTmp = "";
		// 7890989786574653 7890989786574652 789098978657465
		if (number1.length() > number2.length() && number1.length() > number3.length()) {
			return number1;
		}
		if (number2.length() > number1.length() && number2.length() > number3.length()) {
			return number2;
		}
		if (number3.length() > number2.length() && number3.length() > number1.length()) {
			return number3;
		}
		maxTmp = compTwoDig(number1, number2);
		return compTwoDig(maxTmp, number3);
	}

	// 99 88888 88
	// max12 = comp(num1,num2)
	//

	static String compTwoDig(String dig1, String dig2) {
		if (dig1.length() > dig2.length()) {
			return dig1;
		} else if (dig1.length() < dig2.length()) {
			return dig2;
		}
		// 1 2 3
		for (int i = 0; i < dig1.length(); i++) {
			if (dig1.charAt(i) > dig2.charAt(i)) {// 4
				return dig1;
			} else if (dig2.charAt(i) > dig1.charAt(i)) {
				return dig2;
			}
		}
		return dig1;
	}

	static String outPutNumber(String number) {
		String numberOut = "";
		// 200143
		// 341 02
		int counter = 0;
		for (int i = number.length() - 1; i >= 0;) {
			if (counter < 3) {
				numberOut += number.charAt(i);
				++counter;
				--i;
			} else {
				numberOut += " ";
				counter = 0;
			}
		}
		return reverse(numberOut);
	}

	static String reverse(String numberOut) {
		String out = "";

		for (int i = numberOut.length() - 1; i >= 0; i--) {
			out += numberOut.charAt(i);
		}
		return out;
	}

	static String findLineMax(String inPutLine) {
		String numberMax = "", numberTemp = "";

		for (int i = 0; i < inPutLine.length(); i++) {
			if (inPutLine.charAt(i) >= '0' && inPutLine.charAt(i) <= '9') {
				numberTemp += inPutLine.charAt(i);
				if (i + 1 == inPutLine.length()) {
					if (numberTemp.length() >= numberMax.length()) {
						numberMax = numberTemp;
						numberTemp = "";
					}
				} else if (!(inPutLine.charAt(i + 1) >= '0' && inPutLine.charAt(i + 1) <= '9')) {
					if (numberTemp.length() >= numberMax.length()) {
						numberMax = numberTemp;
						numberTemp = "";
					}
				}
			}
		}

		return numberMax;

	}

	static boolean finDer(String inPut, String find) {

		for (int i = 0, j = 0; i <= inPut.length() - find.length(); i++) {
			for (j = 0; inPut.charAt(i) == find.charAt(j); i++, j++) {
				if ((j == find.length() - 1))
					return true;
			}
		}
		return false;
	}

	static int finDer(String[] keys, String what) {
		for (int i = 0; i < keys.length; i++) {
			if (keys[i].equals(what))
				return i;
		}

		return -1;
	}

	static String sortIn(String inPut, int n) {
		String outPut = "";
		String answer = "";
		// 5464566 - 5 464 566

		for (int i = inPut.length() - 1; i >= 0;) {
			for (int j = 0; j < n && i >= 0; j++) {
				outPut += inPut.charAt(i);
				--i;
			}
			if (i >= 0)
				outPut += ' ';
		}

		for (int i = outPut.length() - 1; i >= 0; i--) {
			answer += outPut.charAt(i);
		}
		return answer;
	}

	static String replace(String inPut) {
		String outPut = "";
		for (int i = 0; i < inPut.length(); i++) {
			if (inPut.charAt(i) == '!') {
				outPut += '.';
			} else
				outPut += inPut.charAt(i);
		}
		return outPut;
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
}
