package Task5;

import java.util.Scanner;

public class QuesFive {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Marks between 0 to 100");
		int marks = input.nextInt();
		
		if(marks==100)System.out.println("S - Grade");
		else if((marks>=90) && (marks<=99)) System.out.println("Grade - A");
		else if((marks>=80) && (marks<=89)) System.out.println("Grade - B");
		else if((marks>=70) && (marks<=79)) System.out.println("Grade - C");
		else if((marks>=60) && (marks<=69)) System.out.println("Grade - D");
		else if((marks>=50) && (marks<=59)) System.out.println("Grade - E");
		else if(marks<50 && marks>=0)System.out.println("Grade - F");
		else System.out.println("Enter the Marks between 0 to 100 only");
	}

}

/*Output: 
Enter the Marks between 0 to 100
78
Grade - C
*/