package collections_and_generics_4;
import java.util.*;

public class Application {

	public static void main(String[] args) {
		
		/*
		 * HashMap<String, String> dictionary = new HashMap<String, String>();
		 * dictionary.put("Brave",
		 * "ready to face and endure danger or pain; showing courage.");
		 * dictionary.put("Brilliant", "exceptionally clever or talented.");
		 * dictionary.put("Joy", "a feeling of great pleasure and happiness.");
		 * dictionary.put("Confidence",
		 * "the state of feeling certain about the truth of something.");
		 * 
		 * for(String word : dictionary.keySet()) { System.out.println(word); }
		 */
		
		LinkedHashMap<String, String> dictionary1 = new LinkedHashMap<String, String>();
		dictionary1.put("Brave", "ready to face and endure danger or pain; showing courage.");
		dictionary1.put("Brilliant", "exceptionally clever or talented.");
		dictionary1.put("Joy", "a feeling of great pleasure and happiness.");
		dictionary1.put("Confidence", "the state of feeling certain about the truth of something.");
		
		/*
		 * for(String word1 : dictionary1.keySet()) { //System.out.println(word1);
		 * System.out.println(word1 +": "+ dictionary1.get(word1)); }
		 */
		
		System.out.println("-------------------------------------------------------------------------------------------------");
		for(Map.Entry<String, String> entry : dictionary1.entrySet()) {
			
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}

	}

}
