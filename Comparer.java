package vo.compare;

import java.io.*;

//to do later. Make a GUI and replace the arguments with a chooser
//Put file with path in arguments


public class Comparer {
public static void main(String args [])

{
	int i=0, j=0;
	
	if(args.length !=2) {
		System.out.println("Usage : Compa Files f1 & f2");
		return;
	}

		try (FileInputStream File1 = new FileInputStream(args[0]);
		 FileInputStream File2 = new FileInputStream(args[1]))


{
	do {
		i = File1.read();
		j = File2.read();
		if(i != j)break;
	} while(i != -1 && j != -1);
	
	if(i !=j)
		System.out.println("Files Differ");
	else
		System.out.println("Files are Same");
	} catch(IOException exc) {
		System.out.println("I/O Error : " + exc);

}
}
}
