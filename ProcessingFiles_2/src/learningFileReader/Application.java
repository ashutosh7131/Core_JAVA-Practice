package learningFileReader;

import java.io.*;

public class Application {

	public static void main(String[] args) {

		
		//Here we are writing code with try with resource used in java7 first..commented lines are without resource one
		// File file = null;
		// BufferedReader bufferedReader = null;
		// FileReader fileReader = null;
		File file = new File("1.txt");
		try (FileReader fileReader = new FileReader(file);
				BufferedReader bufferedReader = new BufferedReader(fileReader);) {
			// file = new File("1.txt");
			// fileReader = new FileReader(file);
			// bufferedReader = new BufferedReader(fileReader);
			String line = bufferedReader.readLine();
			while (line != null) {
				System.out.println(line);
				line = bufferedReader.readLine();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.out.println("File Not Found: "+ file.getName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.out.println("Problem Reading the File: " + file.getName());
		} /*
			 * finally { try { if (bufferedReader != null) { bufferedReader.close(); } if
			 * (fileReader != null) { fileReader.close(); } } catch (IOException e) { //
			 * TODO Auto-generated catch block // e.printStackTrace();
			 * System.out.println("Unable to Close the File: " + file.getName()); } catch
			 * (NullPointerException ex) { // TODO Auto-generated catch block //
			 * e.printStackTrace(); System.out.println("File was probably never opened: " +
			 * ex); }
			 * 
			 * }
			 */

	}

}
