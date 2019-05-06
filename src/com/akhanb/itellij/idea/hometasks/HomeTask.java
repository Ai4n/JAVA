package com.akhanb.itellij.idea.hometasks;

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
        String inPutLine = scan.nextLine();
        String number = findLineMax(inPutLine);
        System.out.println(outPutNumber(number));
        scan.close();
        //String s1, s2, s3;
        //10012
        //10011
        //
        //1 - '49'
        //2 - '50'
    }
    static String outPutNumber( String number) {
        String numberOut = "";
        //200143
        //341 02
        int counter = 0;
        for(int i = number.length() - 1; i >= 0;) {
            if(counter < 3) {
                numberOut += number.charAt(i);
                ++counter;
                --i;
            }else {
                numberOut += " "; counter = 0;
            }
        } return reverse(numberOut);
    }

    static String reverse(String numberOut) {
        String out = "";

        for(int i = numberOut.length() - 1; i >= 0; i--) {
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
