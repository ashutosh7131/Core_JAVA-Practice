package java_basics;

public class ControlFlow {

	public static void main(String[] args) {
		boolean hungry = true;
		if(!hungry) {
			System.out.println("I'm Starving....");
		}else {
			System.out.println("I'm not hungry");
		}
		
		int hungerRating =5;
		if(!(hungerRating<6)) {
			System.out.println("Not Hungry");
		}else {
			System.out.println("I was hungry");
		}
       
		int favouriteTemp = 75;
		int currentTemp = 50;
		String opinion;
		if(currentTemp < favouriteTemp-30) {
			opinion ="It is pretty Darn cold";
			System.out.println(opinion);
		}else if(currentTemp < favouriteTemp-20) {
			opinion ="It is kind of  cold";
			System.out.println(opinion);
		}else if(currentTemp > favouriteTemp+20) {
			opinion ="It is hot out";
			System.out.println(opinion);
		}else {
			opinion ="It is a beautiful day.....";
			System.out.println(opinion);
		}
		
		int month = 6;
		String monthString;
		
		switch(month) {
		case 1: monthString = "January";
		break;
		case 2: monthString = "February";
		break;
		case 3: monthString = "March";
		break;
		case 4: monthString = "April";
		break;
		default: monthString = "Unknown Month";
		break;
		}
		System.out.println(monthString);
	}
	

}
