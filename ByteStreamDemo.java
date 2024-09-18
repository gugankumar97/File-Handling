package FileHandling;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo {

	public static void main(String[] args) throws IOException {
		 FileOutputStream fout1=new FileOutputStream("C:\\Users\\GUGAN\\Music\\testin.txt");    
	     FileOutputStream fout2=new FileOutputStream("C:\\Users\\GUGAN\\Music\\testout.txt");    
	       
	     String s="How are you";
	     ByteArrayOutputStream bout=new ByteArrayOutputStream();    
	     bout.write(s.getBytes());    
	     bout.writeTo(fout1);    
	     bout.writeTo(fout2);   
	     
	     bout.close();
	     
	     
	     byte[] barray = {23,28,45,56,78,90,34,67,12,55,88,99,100};
	     ByteArrayInputStream byt = new ByteArrayInputStream(barray);  
	     int k = 0;  
	     while ((k = byt.read()) != -1) {  
	       //Conversion of a byte into character  
	       char ch = (char) k;  
	       System.out.println("ASCII value of Character is:" + k + "; Special character is: " + ch);  
	     } 
		 byt.close();
	}

}
