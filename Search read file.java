package ChoiceSelection;

import java.io.FileReader;
import java.util.Scanner;

 class SearchReadFile {
	 public static void SearchingFileAndContent() throws Exception {
		 Scanner sc = new Scanner(System.in);
		System.out.println("Enter the file name you want to search :");
		 String Str= sc.nextLine();
		String Fname=Str+".txt";
		 String Path="D:\\Crud_Operation\\"+Fname;
		 FileReader reader= new FileReader(Path);
			
			int data;
			System.out.println("The Content of File you are searching is :");
			while((data=reader.read())!=-1){
				
				System.out.print((char)data);
				
			}	
			reader.close();
		 
	 }
	 

}
