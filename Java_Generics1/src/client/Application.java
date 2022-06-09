package client;

import java.util.*;

public class Application {

	public static void main(String[] args) {

		Object myObject = new Object();
		String myVar = "Hello";
		myObject = myVar;
		
		Employee emp = new Employee();
		Accountant acc = new Accountant();
		emp = acc;
		
		ArrayList<Employee> employees = new ArrayList<>();
		employees.add(new Employee());
		ArrayList<Accountant> accountants = new ArrayList<>();
		accountants.add(new Accountant());
		//employees = accountants;----> this won't work as they are both of different types of generics
		
		ArrayList<?> employees1 = new ArrayList<>();
		ArrayList<Accountant> accountants1 = new ArrayList<>();
		employees1 = accountants1;//---> this will work as we have used wildcard ? here for employees
		
		ArrayList<? extends Employee> employees2 = new ArrayList<>();
		ArrayList<Accountant> accountants2 = new ArrayList<>();
		employees2 = accountants2;
		
		ArrayList<? super Employee> employees3 = new ArrayList<>();
		ArrayList<Accountant> accountants3 = new ArrayList<>();
		//employees3 = accountants3;--this will also not work as the generics should be either of type employee or greater.
		makeEmployeesWork(employees);
		makeEmployeesWork(accountants);

	}
	
	public static void makeEmployeesWork(List<? extends Employee> employees) {
		
		for(Employee emp:employees) {
			
			emp.work();
			
		}
		
	}

}
