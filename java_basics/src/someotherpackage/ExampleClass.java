package someotherpackage;

import java_basics.MyUtils;

public class ExampleClass {
	
	public static void doSomething() {
		
		MyUtils.add10(10);
		MyUtils.privacyToThisClass1();
		MyUtils myUtils = new MyUtils();
	    int sumOfAddition = myUtils.sum(10, 20);
	    System.out.println("Sum Of Addition is: "+ sumOfAddition);
		
		
	}

}
