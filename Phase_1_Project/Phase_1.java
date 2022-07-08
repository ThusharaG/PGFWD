package Phase_1_Project;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

class Phase_1_Project {
	
	String filename = "D:\\PGFWD\\";
	File fileDir = new File(filename);
	
	
	
	public String[] getTheFileNames()
	{
		String pathnames[] = fileDir.list();
		System.out.println("List of Files in the Directory");
		for(String pathname:pathnames)
		{
			System.out.println(pathname);
		}
	
		return pathnames;
		
	}
	
	public void createFile(String s)
	{
	 
		System.out.println(filename + s);
		File newFile = new File(filename + s);
		
		try {
			if(newFile.createNewFile())
				System.out.println(s+"File has been created sucessfully");
			else if(newFile.exists())
				System.out.println("File already exists with file name"+s);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void deleteFile(String s)
	{
		try
		{
			System.out.println("You have selected delete files");
			System.out.println("Please select file from the below list");
			
			String fileList[] = getTheFileNames();
				
				File delFile = new File(filename+s);
				
				if(!delFile.exists())
				{
			
					throw new FileNotFoundException("File is not present in the Directory");
				}
				
				else if(delFile.delete())
				System.out.println(s+"File has been deleted sucessfully");
			
		}catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
	}
	
	public void searchFile(String s)
	{
		
		File searchFile = new File(filename+s);
		System.out.println(filename+s);
		if(searchFile.exists())
			System.out.println("File is exists in the path "+filename);
		else
			System.out.println("File is not available in the path");
	}
	
}


public class Phase_1
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
 
        System.out.println("Welcome to Phase 1 Project\n");
        System.out.println("Developed by Thushara ");
        
       
        /* creating object of class arrayQueue */
        Phase_1_Project q = new Phase_1_Project();        
        /* Perform Queue Operations */        
        char ch;
        do{
            System.out.println("\n Project Operations");
            System.out.println("1. Display file names in Ascending order");
            System.out.println("2. Add a file to the Directory");
            System.out.println("3. Delete the file from the Directory");
            System.out.println("4. Search the file from the Directory");
            System.out.println("5. Exit from the Application");
   
            System.out.println("\nPlease enter your choice(1 or 2 or 3 or 4 or 5)");
            int choice = scan.nextInt();
            switch (choice)
            {
            case 1 : 
               
                String s[]=q.getTheFileNames();
                                        
                break;                         
            case 2 : 
            	Scanner s1 = new Scanner(System.in);
                try
                {
                    System.out.println("Please enter the file name to be created");
                    String s3 = s1.nextLine();
                    q.createFile(s3);
                }
                catch(Exception e)
                {
                    System.out.println("Error : " +e.getMessage());
                }
                break;  
                
            case 3 :
            	Scanner s2 = new Scanner(System.in);
               
                	System.out.println("Please enter the file name to be deleted from the Directory");
                	String s3 = s2.nextLine();
                	q.deleteFile(s3);
                
                break;   
                
            case 4 : 
            	Scanner s4 = new Scanner(System.in);

                System.out.println("Please enter the file to be Searched");
                String s5 = s4.nextLine();
                q.searchFile(s5);
                break;   
                
            case 5 : 
                System.exit(0);
                break;                          
                                    
            default : System.out.println("Wrong Entry \n ");
                break;
            }
            /* display Queue */            
            System.out.println("\nDo you want to continue (Type y or n) \n");
            ch = scan.next().charAt(0);
 
        } while (ch == 'Y'|| ch == 'y');                                                        
    }    
}