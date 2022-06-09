package collections_and_generics_4;

import java.util.*;

public class Application2 {

	public static void main(String[] args) {
		
		TreeMap<String, String> dictionary1 = new TreeMap<String, String>();
		dictionary1.put("Brave", "ready to face and endure danger or pain; showing courage.");
		dictionary1.put("Brilliant", "exceptionally clever or talented.");
		dictionary1.put("Joy", "a feeling of great pleasure and happiness.");
		dictionary1.put("Confidence", "the state of feeling certain about the truth of something.");
		dictionary1.put("Brilliant", "XXXXXXXXXXXXXXXXXXX.");
		System.out.println("-------------------------------------------------------------------------------------------------");
		for(Map.Entry<String, String> entry : dictionary1.entrySet()) {
			
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}

	}

}
