package palindrome;

public class Palindrome {

	public static String reverseWord(String word) {
		String newWord = new StringBuffer(word).reverse().toString();
		
		
		return newWord;
	}
	
	public static void main(String[] args) {

		System.out.println(Palindrome.reverseWord("Hello World"));
	}
	
	
	/*
	 * String reverse = "";
	 * for (int i = word.length() -1 ; i >=0; i--){
	 * 	reverse += source.CharAt(i)	 
	 * 	return reverse;
	 * }
	 * 
	 */

}
