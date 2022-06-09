package car_dealership;

public class Employee {

	public void handleCustomer(Customer cust, boolean finance, Vehicle vehicle) {
		
		if(finance==true) {
			
			double loanAmount = vehicle.getPrice() + cust.getCashInHand();
			runCreditHistory(cust,loanAmount);
		}
		
		else if(vehicle.getPrice()<= cust.getCashInHand()) {
			processTransaction(cust, vehicle); 
		}
		else {
			System.out.println("Customer will need more money to purchase the vehicle: "+ vehicle);
		}
	}
		

	public void runCreditHistory(Customer cust, double loanAmount) {
		System.out.println("Ran credit hsitory for Customer....");
		System.out.println("Customer has been Approved to purchase the vehicle....");
		
	}
	
	public void processTransaction(Customer cust, Vehicle vehicle) {
		//System.out.println("Customer has purchased the vehicle: "+ vehicle.getMake()+" "+vehicle.getModel()+" for the price: "+vehicle.getPrice());
		System.out.println("Customer has purchased the vehicle: "+ vehicle+" for the price: "+vehicle.getPrice());
	}

}
