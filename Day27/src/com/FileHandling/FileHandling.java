package com.FileHandling;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling {

	public static void main(String[] args) throws IOException {
		
		File fa = new File("Demo.txt");
		try {
			fa.createNewFile();
		} catch (IOException e) {
		
			e.printStackTrace();
		}
		
		try {
			FileWriter filewriter = new FileWriter(fa);
			filewriter.write("Hello");  // We can right text by using write operation.
			filewriter.append("Want to join microsoft");
			filewriter.close();  // If we not used close method data is not inserted into the file.
			// It is mandatory to close the file.
		} catch (IOException e) {
		
			e.printStackTrace();
		}    
		
	  try {
			FileReader filereader = new FileReader(fa);
		    System.out.println(filereader.read());
	  } catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		

	}

}
