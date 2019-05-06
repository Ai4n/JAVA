package smartPoint;
import java.util.HashMap;
import java.util.Scanner;

public class WordFinder {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//buffalo can buffalo buffalo buffalo buffalo buffalo you can the you
		String inPutStr = scan.nextLine();
		String delWord = "";
		int iBeg = 0;
		HashMap<String , Integer> wordContainer = new HashMap<>();
		for(int i = 0; i < inPutStr.length(); i++) {
			if(inPutStr.charAt(i) == ' ') {
				String tempWord = inPutStr.substring(iBeg,i);
				if(!wordContainer.containsKey(tempWord)) {
					wordContainer.put(tempWord, 1);
					delWord += tempWord + " ";
				} 
				iBeg = i + 1;
			}
		}
		System.out.println(delWord);
//		for(String word: wordContainer.keySet()) {
//			System.out.print(word + " ");
//		}
		
		scan.close();

	}
	
	
	
	
 static void findWord(Scanner scan){
	 
	 String inPut = scan.nextLine();
		String maxWord = "";
		inPut = inPut.toUpperCase();
		int iBeg = 0;
		int maxTemp = 0;
		HashMap<String, Integer> wordContainer = new HashMap<>();
		//buffalo 2
		//can 2
		//you 1
		for(int i = 0; i < inPut.length(); i++) {
			if(inPut.charAt(i) == ' ' || inPut.charAt(i) == '?' 
					|| inPut.charAt(i) == '!' || inPut.charAt(i) == '.' 
					|| inPut.charAt(i) == ',' || inPut.charAt(i) == ':') {
				String tempWord = inPut.substring(iBeg, i);
				if(!wordContainer.containsKey(tempWord)) {
					wordContainer.put(tempWord, 1);
				} else {
					wordContainer.put(tempWord, wordContainer.get(tempWord) + 1);
				}
				iBeg = i + 1;
			}
		}
		
		for(String tempWord: wordContainer.keySet()) {
				if(maxTemp < wordContainer.get(tempWord)) {
					maxTemp = wordContainer.get(tempWord);
					maxWord = tempWord;
				}
		} 
		System.out.println(maxWord + " " + wordContainer.get(maxWord));
 }
}
