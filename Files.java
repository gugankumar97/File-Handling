package FileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Files {

	public static void main(String[] args) throws IOException  {
		
		File file = new File("C:\\Users\\GUGAN\\Documents\\java documents\\Documents\\giridhar.txt");
//	    File file1 = new File("C:\\Users\\GUGAN\\Documents\\java documents\\Documents\\gug.Directory");

	writefile(file);
//	Readfile(file);	
//    Directory(file1);
		
		

}
	public static void writefile(File file) throws IOException{
		
		
		if(file.createNewFile()) {
			
			System.out.println("file sucessfully created");
			System.out.println("Name of the file:"+file.getName());
			System.out.println("Path of the file:"+file.getAbsolutePath());
			System.out.println("File can be read or not:"+file.canRead());
			System.out.println("File can write or not:"+file.canWrite());
			System.out.println("File is exists or not:"+file.exists());
			System.out.println("File can execute or not:"+file.canExecute());
			
		}else {
			System.out.println("Files already exists:");
		}
		
		
		
		String towrite = "WELCOME TO JAVA L1";
		
		FileOutputStream fout = new FileOutputStream(file);  // Byte Stream
		
		fout.write(towrite.getBytes());
		fout.close();
		
		System.out.println("Successfully written on the file");
//		
//		
//		String towrites ="WELCOME TO JAVA";
//		
//		FileWriter fou = new FileWriter(file);   // Character Stream
//		fou.write(towrites);
//		fou.close();
//		
//		System.out.println("successfully written using FileWriter");
//		
//		}
	
//	public static void Readfile(File file) throws IOException {
//		
//		FileInputStream fin = new FileInputStream(file);     // Byte Stream
//		
//		int c;
//		while((c= fin.read())!=-1) {
//			System.out.print((char)c);    // converting byte to character
//		}
//		System.out.println("\n");
//		fin.close();
//		
//		
//		
//		FileReader fiR = new FileReader(file);           // Character Stream
//		
//		int d;
//		while((d=fiR.read())!=-1) {
//			System.out.print((char)d);   // converting byte to character
//		}
//		System.out.println("\n");
//		fiR.close();
//	}
//	
//	public static void Directory(File file1) throws IOException{
//		
//		if(file1.mkdir()) {
//			System.out.println("Successfully created Directories");
//		}else {
//			System.out.println("Return Nothing");
//		}
	}
}