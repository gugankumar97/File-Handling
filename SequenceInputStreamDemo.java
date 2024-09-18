package FileHandling;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

public class SequenceInputStreamDemo {

	public static void main(String[] args) throws IOException {
		
		FileInputStream f1 = new FileInputStream("E:\\test1.txt");
		FileInputStream f2 = new FileInputStream("E:\\test2.txt");
		SequenceInputStream inst = new SequenceInputStream(f1, f2);
		int j;
		while ((j = inst.read()) != -1) {
			System.out.print((char) j);
		}
		
		inst.close();
		

		System.out.println("\n***************************************\n");
		// FOR MORE THAN TWO FILES

		// creating Vector object to all the stream
		FileInputStream input1 = new FileInputStream("E:\\test1.txt");
		FileInputStream input2 = new FileInputStream("E:\\test2.txt");
		FileInputStream input3 = new FileInputStream("E:\\testin.txt");
		
		Vector<FileInputStream> v = new Vector<FileInputStream>();
		v.add(input1);
		v.add(input2);
		v.add(input3);

		// creating enumeration object by calling the elements method
		Enumeration<FileInputStream> e = v.elements();

		// passing the enumeration object in the constructor
		SequenceInputStream bin = new SequenceInputStream(e);
		int i = 0;
		while ((i = bin.read()) != -1) {
			System.out.print((char) i);
		}

		bin.close();	

		
		input1.close();
		input2.close();
		input3.close();

	}

	}



