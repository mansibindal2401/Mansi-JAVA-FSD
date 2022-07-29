package ChoiceSelection;


import java.util.Scanner;

 class Step2 {

public static void BLODemo() {
		 
		 String[] arr1 = {"1.To Add a File in a Directory, press 1 and Enter..!!",
	                "2. To Delete the File from the Directory, press 2 and Enter..!!",
	                "3. To search  a file and if it exists,to read the content,press 3 and Enter..!! ",
	                "4. Navigate from BLO to main menu"
	               
	        };
		 int[] arr = {1,2,3};
	        int  slen = arr1.length;
	        for(int i=0; i<slen;i++){
	            System.out.println(arr1[i]);
	            
	        }
	        System.out.print("\nEnter your choice: ");
	        Scanner sc = new Scanner(System.in);
	        int  options =  sc.nextInt();
	        for(int j=1;j<=slen;j++){
	            if(options==j){
	                switch (options){
	                    case 1:
	                        System.out.println("Adding a file and writing a content on that file.. \n");
	                       try {
	                    	  CreateFile.AddFile();
						} catch (Exception e) {
							// TODO: handle exception
							System.out.println("file not found");
						}
	                       System.out.println("\n");
	                        BLODemo();
	                       // optionsSelection();
	                        break;
	                    case 2:
	                    	System.out.println("Deleting a file from its location\n");
	                    
	                       DeleteFile.Delete();
	                       System.out.println("\n");
	                       BLODemo();
	                        break;
	                    case 3:
	                    	System.out.println("Searching a file and showing its content");
	                    	try {
	                    		SearchReadFile.SearchingFileAndContent();
							} catch (Exception e) {
								// TODO: handle exception
								System.out.println("File not found!!!\n Please enter the correct file name\n Thank you");
							}
	                    	System.out.println("\n");
	                    	BLODemo();
	                    	break;
	                    case 4:
	                    	System.out.println("Closing your BLO menu \nAlert, you are navigating to Main menu");
	                    	System.out.println("\n");
						try {
							Step1.optionsSelection();
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
	                    	break;
	                }
	            }
	        } 
	 }
	 
	
	
	 
	
	 
 }
