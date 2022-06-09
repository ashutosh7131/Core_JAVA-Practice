package collections_and_generics_3;

import java.util.*;

public class Application {

	public static void main(String[] args) {

		/*
		 * HashSet<Integer> hashSet = new HashSet<Integer>(); hashSet.add(12);
		 * hashSet.add(43); hashSet.add(15); hashSet.add(67); hashSet.add(43);
		 * hashSet.add(41); hashSet.add(10); hashSet.add(11); hashSet.add(19);
		 * hashSet.add(45); hashSet.add(43);
		 * 
		 * ArrayList<Integer> myList = new ArrayList<Integer>(); myList.addAll(hashSet);
		 * Collections.sort(myList); System.out.println(myList); HashSet<String>
		 * hashSet1 = new HashSet<String>(); hashSet1.add("clothes");
		 * hashSet1.add("bat ball"); hashSet1.add("shriansh"); hashSet1.add("ashutosh");
		 * hashSet1.add("zebra"); ArrayList<String> myList1 = new
		 * ArrayList<String>(hashSet1); Collections.sort(myList1);
		 * System.out.println(myList1);
		 * 
		 * 
		 * 
		 */
  
		/*
		 * ArrayList<Integer> newlist = new ArrayList<Integer>(); newlist.add(10);
		 * 
		 * 
		 * list1.addAll(newlist); System.out.println(list1); list1.removeAll(newlist);
		 * System.out.println(list1); list1.clear(); System.out.println(list1);
		 */
		
		HashSet<Employee> hashSet = new HashSet<Employee>();
		hashSet.add(new Employee("Mike", 3500, "Accounting"));
		hashSet.add(new Employee("Paul", 3000, "Admin"));
		hashSet.add(new Employee("Peter", 4000, "IT"));
		hashSet.add(new Employee("Angel", 2000, "Maint"));
		hashSet.add(new Employee("Ashutosh", 5500, "PP"));
		
		ArrayList<Employee> myList = new ArrayList<Employee>(hashSet);
		Collections.sort(myList);
		System.out.println(myList);
		
		

	}

}
