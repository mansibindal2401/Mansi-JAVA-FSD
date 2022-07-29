package ChoiceSelection;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Step1 {
	  public static void main(String[] args) {
	        System.out.println("\n*******************************************************************************************\n");
	        System.out.print("\tDeveloped By :");
	        System.out.println("MANSI BINDAL");
	        System.out.println("\n*******************************************************************************************\n");
	        System.out.print("Phase-1 Project-->");
	        System.out.println(" Virtual Key For your Repository \n");
	        System.out.println("*********************************************************************************************");
	      try {
			optionsSelection();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	    }
	    public static void optionsSelection() throws Exception {
	    	System.out.println("Please choose the option from below :-\n");
	        String[] arr = {"1.Retrieve Current File Name in Ascending Order",
	                "2. Business Level Operation Menu",
	                "3. Close the application"
	        };


	    int[] arr1 = {1,2,3};
        int  slen = arr1.length;
        for(int i=0; i<slen;i++){
            System.out.println(arr[i]);
            // display the all the Strings mentioned in the String array
            
        }
       System.out.println("\nEnter your choice:\t");
        Scanner sc = new Scanner(System.in);
        int  options =  sc.nextInt();
        int count=0;
        for(int j=1;j<=slen;j++){
            if(options==j){
            	count=1;
                switch (options){
                    case 1:
                        System.out.println("RETRIEVEING FILE IN ASCENDING ORDER \n");
                      retrieveFile();
                         optionsSelection();
                         break;

                    case 2:
                    	Step2.BLODemo();
                    
                    	optionsSelection();
					 break;
                    case 3:
                        closeApp();
                        break;
                    default:
                        System.out.println("Invalid Selection!");
                        break;
                }
            }
           
        }
        if(count==0) {
        	System.out.println("Invalid Choice!!");
        	optionsSelection();
        }
       

    }
	    private static void closeApp() {
	        System.out.println("Closing your application... \nThank you!");
	            }
	    public static void retrieveFile(){

	    	 System.out.println("Please enter the path of folder you want to retrieve :-");
		      Scanner s1 = new Scanner(System.in);
		      String folderPath = s1.next();
		     
			 File f = new File(folderPath);
			 if(f.isDirectory()){
				 List<String> listFile = Arrays.asList(f.list());
				 
				 Collections.sort(listFile);
					System.out.println("---------------------------------------");
					System.out.println("**Sorting by Filename in ascending order**");
					for(Object o:listFile){
						String s =o.toString();
						System.out.println(s);
					}
	        
}}}

