
public class Application {

	public static void main(String[] args) {

		Human tom = new Human();
		// tom.walk();
		// walker(tom);
		Robot wale = new Robot();
		// wale.walk();
		// walker(wale);

		/*
		 * walker(new Walkable() {
		 * 
		 * @Override public void walk() {
		 * 
		 * System.out.println("Custom Object Walking....");
		 * 
		 * } });
		 */

		walker(() -> System.out.println("Custom Object Walking...."));

		Walkable aBlockOfCode = () -> {
			System.out.println("Hi My Name: ");
			System.out.println("is Ashutosh ");
		};
		walker(aBlockOfCode);
		ALamdaInterface helloVar = () -> System.out.println("Hello Java");
		Walkable sumVar = () -> System.out.println(sum(19, 20));
		walker(sumVar);
	}

	public static void walker(Walkable walkableEntity) {
		walkableEntity.walk();
	}

	public void sayHello() {
		System.out.println("Hello Java");
	}

	public static int sum(int arg1, int arg2) {
		int sum = arg1 + arg2;
		//System.out.println(sum);
		return sum;
	}

}
