package anagram;

import java.util.Arrays;

public class Anagram {

	public static boolean ana (String word, String word2) {
		char[] wordArr = word.toCharArray();
		char[] word2Arr = word2.toCharArray();
		Arrays.sort(wordArr);
		Arrays.sort(word2Arr);
		return Arrays.equals(wordArr, word2Arr);
		
	}
	
	public static void main (String[] arg) {	
		
		boolean yesOrNo = Anagram.ana("good", "odog");
		
		if (yesOrNo == true) {
			System.out.println("Its true!");
		} else {
			System.out.println("Its false!");
		}
		
		
	}
	
}
