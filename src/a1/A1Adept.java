package a1;

import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		int numProducts = scan.nextInt();
		String[] products = new String[numProducts];
		double[] productPrices = new double[numProducts];
		for (int i = 0; i < numProducts; i++) {
			String productName = scan.next();
			double productPrice = scan.nextDouble();
			products[i] = productName;
			productPrices[i] = productPrice;
		} 
		int numCustomers = scan.nextInt();
		String maxCustomer = " ";
		double maxSpending = 0.00;
		String minCustomer = " ";
		double minSpending = 0.00;
		double sumAll = 0.00;
		for (int i = 0; i < numCustomers; i ++) {
			String customerName = scan.next();
			customerName += ' ';
			customerName += scan.next();
			int numPurchases = scan.nextInt();
			double sumCharges = 0.00;
			for (int j = 0; j < numPurchases; j++) {
				int numItems = scan.nextInt();
				String itemName = scan.next();
				int index = findIndex(itemName, products);
				sumCharges += numItems * productPrices[index];
			}
			if (i == 0) {
				minCustomer = customerName; 
				minSpending = sumCharges;
			}
			if (sumCharges > maxSpending) {
				maxCustomer = customerName;
				maxSpending = sumCharges;
			}
			else if (sumCharges <= minSpending) {
				minCustomer = customerName;
				minSpending = sumCharges;
			}
			sumAll += sumCharges;
		}
		double average = sumAll / numCustomers;
		System.out.println("Biggest: " + maxCustomer + " (" + String.format("%.2f", maxSpending) + ')');
		System.out.println("Smallest: " + minCustomer + " (" + String.format("%.2f", minSpending) + ')');
		System.out.println("Average: " + String.format("%.2f", average));
	    scan.close();
	}
	
	public static int findIndex(String itemName, String[] products) {
		int index = 0;
		for (int k = 0; k < products.length; k++) {
			if (products[k].equals(itemName)) {
				index = k;
			}
		}
		return index;
	}
}
