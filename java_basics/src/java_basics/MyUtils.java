package java_basics;

public class MyUtils {

	//default modifier not visible outside package
	//class MyUtils{
	
	public static void printSumJunk(String argument) {
		System.out.println("ha ha ha..... "+ argument);
	}
	
	public static void printSumJunk(int argument) {
		System.out.println("Integer Passed is "+ argument);
	}
	
	public static void sum2Numbers(int firstArg, int secondArg) {
		System.out.println("Integer Sum is " + (firstArg+secondArg));
	}
	
	public static void add10(int someArgument) {
		System.out.println("Integer Sum with 10 is " + (someArgument+10));
	}
	
	public static int add20(int someArgument) {
		int result = someArgument + 20;
		return result;
	}
	
	public static String printSomeMessage(String someMessage) {
		String someMessageHasToBePrintedHere = someMessage+ " and I am an IT GEEK!!!";
		return someMessageHasToBePrintedHere;
	}
    
	private static void privacyToThisClass() {
		System.out.println("This is a Private Method!!!");
		
	}
	
	public static void privacyToThisClass1() {
		System.out.println("This is a Public Method!!!");
		
	}
	
	protected static void privacyToThisClass2() {
		System.out.println("This is a Protected Method!!!");
		
	}
	
	static void privacyToThisClass3() {
		System.out.println("This is a Default Method!!!");
		
	}
	
	public int sum(int a, int b) {
		 int result = a + b;
		 return result;
		
	}

}
