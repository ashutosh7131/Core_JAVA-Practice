package com.jobready.inventory;

import java.util.*;

public class InventoryManager {

	List<Product> soldProductsList = new ArrayList<>();
	List<Product> purchasedProductsList = new ArrayList<>();
	Vector vector = new Vector<>();

	public void populateSoldProducts() {
		for (int i = 0; i < 1000; i++) {
			Product prod = new Product(i, "test_product_" + i);
			soldProductsList.add(prod);
			System.out.println("ADDED: " + prod);
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public void displaySoldProducts() {
		for (Product product : soldProductsList) {
			System.out.println("Printing The Sold: " + product);
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}
	}

}
