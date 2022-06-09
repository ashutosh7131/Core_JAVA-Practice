package java_basics;

import someotherpackage.ExampleClass;

public class LearningMethods {

	public static void main(String[] args) {
		System.out.println("I am fine!");
		MyUtils.printSumJunk("This is an argument");
		MyUtils.printSumJunk(34);
		MyUtils.printSumJunk("34");
		MyUtils.sum2Numbers(23, 10);
		MyUtils.add10(10);
		int var = MyUtils.add20(20)+1000-50;
		System.out.println(var);
		String message = MyUtils.printSomeMessage("Hi There Myself Ashutosh");
	    System.out.println(message);
	    ExampleClass.doSomething();
	    MyUtils.privacyToThisClass2();
	    MyUtils.privacyToThisClass3();
	    MyUtils myUtils = new MyUtils();
	    int sumOfAddition = myUtils.sum(10, 20);
	    System.out.println("Sum Of Addition is: "+ sumOfAddition);
	}
	
	
}
