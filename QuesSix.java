package Task5;

import java.util.Scanner;

public class QuesSix {

	public static void main(String[] args) {
		        Scanner s = new Scanner(System.in);
		        int month = s.nextInt();
		        float rrp = s.nextFloat();
		        int nods = s.nextInt();
		        
		        float amount = rrp * nods;
		        boolean isPeakSeason = false;

		        switch (month) {
		            case 4:
		            case 5:
		            case 6:
		            case 11:
		            case 12:
		                isPeakSeason = true;
		                break;
		            default:
		                isPeakSeason = false;
		        }
		        if (isPeakSeason) {
		        	amount += amount * 0.20;
		        }
		        System.out.printf("%.2f\n", amount);
		    }
}

/* Output
5
1500
4
7200.00
*/
