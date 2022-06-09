package Client;

import java.util.*;

public class Applicaton {

	public static void main(String[] args) {

		Container<Integer, String> container = new Container<>(12, "Hello");
		int val1 = container.getItem1();
		String val2 = container.getItem2();
		System.out.println("item 1: " + val1 + " item 2: " + val2);

		Set<String> mySet1 = new HashSet<>();
		mySet1.add("first");
		mySet1.add("second");
		mySet1.add("third");

		Set<String> mySet2 = new HashSet<>();
		mySet2.add("first");
		mySet2.add("second");
		mySet2.add("computer");

		// System.out.println(union(mySet1, mySet2));
		Set<String> resultSet = union(mySet1, mySet2);
		Iterator<String> itr = resultSet.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

	public static <E> Set<E> union(Set<E> set1, Set<E> set2) {
		Set<E> result = new HashSet<>(set1);
		result.addAll(set2);
		return result;

	}

}
