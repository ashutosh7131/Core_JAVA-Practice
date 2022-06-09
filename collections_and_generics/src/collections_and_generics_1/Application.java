package collections_and_generics_1;

import java.util.*;

public class Application {

	public static void main(String[] args) {

		/*
		 * ArrayList<String> animals = new ArrayList<String>(); animals.add("lion");
		 * animals.add("tiger"); animals.add("bird"); animals.add("dog");
		 * animals.add("cat");
		 * 
		 * for (int i = 0; i < animals.size(); i++) {
		 * System.out.println(animals.get(i)); }
		 * 
		 * for (String animal : animals) { System.out.println(animal); }
		 */

		ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
		Vehicle vehicle2 = new Vehicle("Toyota", "Camrey", 12000, false);
		vehicles.add(new Vehicle("Honda", "accord", 15000, false));
		vehicles.add(vehicle2);
		vehicles.add(new Vehicle("Jeep", "wrangler", 25000, true));

		for (Vehicle vehicle3 : vehicles) {
			System.out.println(vehicle3.toString());
		}
		printElements(vehicles);
		
	}

	public static void printElements(List someList) {
		for (int i = 0; i < someList.size(); i++) {
			System.out.println(someList.get(i));
		}

	}
}
