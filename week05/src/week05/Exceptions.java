package week05;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Exceptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numbers = new int[3];
		System.out.println("Hi");
		
		if(numbers.length > 3) {
			System.out.println(numbers[3]);
		}
		
		System.out.println("Bye");
		
		/*
		 * Checked Exception - explicitly check for in our code.
		 * try catch block - handles checked exceptions
		 * 
		 * Unchecked Exception - something we have control over and only occurs if we make mistakes in coding.
		 * 
		 */
		
		try {
			System.out.println(numbers[3]);
			System.out.println("In the try");
		} catch (Exception e) {
			System.out.println(e.toString());
			System.out.println(e.getMessage());
		}
		
		try {
			FileReader fileReader = new FileReader("something.txt");
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println(e.getMessage());
		} catch (Exception e) {
			
		}
		
		finally {
			System.out.println("Finally!");
		}	
		
		try {
			openFile("anotherfile.jpg");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public static FileReader openFile(String fileName) throws FileNotFoundException {
		return new FileReader(fileName);
	}

}
