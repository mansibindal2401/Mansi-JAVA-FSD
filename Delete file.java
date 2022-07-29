package ChoiceSelection;

import java.io.File;
import java.util.Scanner;

class DeleteFile {
	 public static void Delete() {
		 String st;
		 Scanner sc = new Scanner(System.in);
		 System.out.print("Enter the Name of File to Delete ");
		 st = sc.nextLine();
		 String FileName=st+".txt";
		String Fname="D:\\Crud_Operation\\"+FileName;
		 File myfile = new File(Fname);
		 if(myfile.delete())
	         System.out.println("\nThe file is deleted successfully!");
	      else
	         System.out.println("\nSomething went wrong!");
		
		 
	 }
}
