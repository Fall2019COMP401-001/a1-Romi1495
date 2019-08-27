package a1;

import java.util.Scanner;
import java.util.Arrays;
public class A1Jedi {

public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		// Your code follows here.
		int numProducts = scan.nextInt();
		String[] products = new String[numProducts];
		int[] numPurchases = new int[numProducts];
		int[] numPurchased = new int[numProducts];
		for (int i = 0; i < numProducts; i++) {
			String productName = scan.next();
			double empty = scan.nextDouble();
			products[i] = productName;
			numPurchases[i] = 0;
			numPurchased[i] = 0;
		}
		int numCustomers = scan.nextInt();
		for (int i = 0; i < numCustomers; i ++) {
			String customerName = scan.next();
			customerName += ' ';
			customerName += scan.next();
			int numItems = scan.nextInt();
			String[] scanned = new String[numItems];
			for (int j = 0; j < numItems; j++) {
				int numItem = scan.nextInt();
				String itemName = scan.next();
				int index = findIndex(itemName, products);
				if (isUnique(itemName, scanned)) {
					scanned[j] = itemName;
					numPurchases[index] += 1;
					numPurchased[index] += numItem;
				}
				else {
					numPurchased[index] += numItem;
				}
			}
	}
	scan.close();
	for (int o = 0; o < products.length; o++) {
		if (numPurchased[o] == 0) {
			System.out.println("No customers bought " + products[o]);
		}
		else {
			System.out.println(numPurchases[o] + " customers bought " + numPurchased[o] + ' ' + products[o]);
		}
	}
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
	public static boolean isUnique(String itemName, String[] scanned) {
		for (int e = 0; e < scanned.length; e++) {
			if (itemName.equals(scanned[e])) {
				return false;
				}
		}
		return true;
	}
}
