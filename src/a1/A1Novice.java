package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		int numCustomers = scan.nextInt();
		for (int i = 0; i < numCustomers; i++) {
			String firstName = scan.next();
			char firstInitial = firstName.charAt(0);
			String lastName = scan.next();
			int numItems = scan.nextInt();
			double sumCharges = 0.0;
			for (int j = 0; j < numItems; j++) {
				int numItem = scan.nextInt();
				String nameItem = scan.next();
				double priceItem = scan.nextDouble();
				sumCharges += numItem * priceItem;
			}
			System.out.println(firstInitial + ". " + lastName + ": " + String.format("%.2f", sumCharges));
		} 
	    scan.close();
	}
}
