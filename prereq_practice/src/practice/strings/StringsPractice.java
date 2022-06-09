package practice.strings;

public class StringsPractice {

	public static void main(String[] args) {
		
		String a = "Hello";
		System.out.println(a);
		System.out.println(a.length());
		
		String str = "ABCDEFG";
		String extractedString = str.substring(1);
		System.out.println(extractedString);
		String extractedString1 = str.substring(0,3);
		System.out.println(extractedString1);
		if(a == "Hello") {
			//don't do this it's a trap
		}
		if(a.equals("Hello")) {
			System.out.println("this is true");
		}
		if(a.equalsIgnoreCase("hellO")) {
			System.out.println("this is also true as long as contents are the same");
		}
		

	}

}
