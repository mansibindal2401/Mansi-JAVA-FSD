package ChoiceSelection;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

class CreateFile {
	 public static void AddFile() throws IOException {
		 try {
		 Scanner sc = new Scanner(System. in ); 
	      System.out.print("Please enter the file name ");
	      String name = sc.nextLine(); 
	      String Fname=name+".txt";
	      String Path="D:\\Crud_Operation\\"+Fname;
	    
	      FileOutputStream fos = new FileOutputStream(Path, true);
	      // true for append mode  
	      System.out.print("Enter file content: ");
	      String str = sc.nextLine() + "\n";
	      
	     
	      byte[] b = str.getBytes(); //converts string into bytes  
	      fos.write(b);  
	      fos.close(); //close the file  
	      System.out.println("The file has been Created and the content is written on it...!!");
	}
		 catch(Exception e) {
			 System.out.println("Cannot Add File due to exception :"+e);
		 }
			
	 }
	 
}
