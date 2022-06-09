package collections_and_generics;

import java.util.*;

public class Application {

	public static void main(String[] args) {

		// List without Generics
		/*
		 * ArrayList words = new ArrayList(); words.add("hello"); words.add("there");
		 * words.add(10); words.add(9); words.add(12.00); words.add('H'); int item1
		 * =(int)words.get(2); int item2 = (int)words.get(3);
		 * System.out.println(item1+item2);
		 */

		// List with Generics

		ArrayList<String> words = new ArrayList<String>();
		words.add("hello");
		words.add("there");

		String item1 = (String) words.get(0);
		System.out.println(item1);

		LinkedList<Integer> numbers = new LinkedList<Integer>();
		numbers.add(0);
		numbers.add(230);
		numbers.add(1270);
		numbers.add(2270);
		numbers.add(3270);
		numbers.add(5270);
		numbers.add(6270);
		numbers.add(7270);
		numbers.add(9270);
		numbers.add(8270);
		numbers.add(2700);
		numbers.add(2710);

		/*
		 * int item2 = numbers.get(0); System.out.println(item2);
		 */
		for (int number : numbers) {

			System.out.println(number);

		}

	}

}
