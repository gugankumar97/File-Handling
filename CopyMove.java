package FileHandling;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files; //importing the nio package 
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class CopyMove {

	public static void main(String[] args) {
		
		File f1 = new File("D:\\gugan.txt");
		
		Path path = Paths.get(f1.toURI()); // initializing the Path object

		Path destination = Paths.get("D:\\gug.Directory\\gugan.txt");

		try { // creating a file Path
			if (!f1.exists()) {
				Path createdFilePath = Files.createFile(path); // Created a file path.
				

				System.out.println("Created a file at : " + createdFilePath); // printing the path of the new file that
																				// has  been created
			} else
				System.out.println("File Already exists");

			Files.move(path, destination, StandardCopyOption.REPLACE_EXISTING);

		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}

}
