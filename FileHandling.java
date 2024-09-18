package FileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileHandling {

	public static void main(String[] args) throws IOException {
		
		File file1 = new File("C:\\Users\\GUGAN\\Documents\\java documents\\Documents\\Gugan.txt");

		
		writeToFile1(file1);
		 	 
		readFromFile(file1);
		 
		 	}

		

		private static void readFromFile(File file1) throws IOException {
			FileInputStream fIn = new FileInputStream(file1);
				
			int c;  // we are taking only byte values it is number so we are taking a int variable
			        // -1 is the last value while reading

			while ((c = fIn.read()) != -1) {
				System.out.print((char) c);
			}
			System.out.println("\n");
			fIn.close();
			
			
			
		}

		private static void writeToFile1(File file1) throws IOException {
			
			// the string to be written into file
			String toWrite = "Hi How Are you !!! " ;

			if (file1.createNewFile()) {
				System.out.println("File Created Succesfully");
			} else {
				System.out.println("Files Already Exists");
			}

			// To write into a file  
			
			FileOutputStream fOut = new FileOutputStream(file1);

			fOut.write(toWrite.getBytes());
			fOut.close();

			
			System.out.println("Successfully written.");
			
		}


	}


