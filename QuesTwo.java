package Task5;

public class QuesTwo {

	public static void main(String[] args) {
		String org = "level";
		String rev = "";
		
		for(int i=0; i<=(org.length()-1);i++) {
			rev = rev + (org.charAt(i));
		}
		System.out.println("Original string- "+org);
		System.out.println("Reverse string- "+rev);
		if(rev.equals(org)) System.out.println("Given string is Palindrome");
		else System.out.println("Given string is not a Palindrome");
		}
		
}

/* output
Original string- level
Reverse string- level
Given string is Palindrome
*/
