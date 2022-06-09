package car_dealership;

public class Dealership {

	public static void main(String[] args) {
		
		Customer cust1 = new Customer();
		cust1.setName("Tom");
		cust1.setAddress("123 Anything St..");
		cust1.setCashInHand(12000);
		
		Vehicle vehicle = new Vehicle();
		vehicle.setMake("Honda");
		vehicle.setModel("Accord");
		vehicle.setPrice(10000);
		Employee emp = new Employee();
		
		cust1.purchaseCar(vehicle, emp, false);
		Customer cust2 = new Customer();
		cust2.setName("Tom");
		cust2.setAddress("123 Anything St..");
		cust2.setCashInHand(12000);
		
		boolean value = cust2.equals(cust2);
		System.out.println(value);
	}

}
