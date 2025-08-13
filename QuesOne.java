package Task5;

public class QuesOne {

	public static void main(String[] args) {
		String s = "LEVEL";
		
		int len = s.length() - 1;
		boolean isPalindrome = true;
		for(int i=0;i<=(len/2); i++ ) {
			if(s.charAt(i) != s.charAt(len)) {
				isPalindrome = false;
			}
			len--;
		}
		if(isPalindrome) System.out.println("Given string is Palindrome");
		else System.out.println("Given string is not a Palindrome");
	}
}

/* output: 

Given string is Palindrome

*/