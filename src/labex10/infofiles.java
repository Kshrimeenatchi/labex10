/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labex10;

/**
 *
 * @author Kathiresan
 */
import java.io.File;
import java.util.Scanner;

public class infofiles {
    Scanner obj=new Scanner(System.in);
		System.out.println("enter the file name");
	    String filename=obj.next();
	    File f=new File(filename);
	    System.out.println(".....details in that file is.....");
	    char d;
	    do
	    {
	    	System.out.println("1.availability of file \n 2.readable or writeable or both \n 3.type of the file \n 4.lengths of the file");
	        System.out.println("enter the choice");
	        int a=obj.nextInt();
	        switch(a)
	        {
	           case 1:
	           {
	        	  System.out.println("availability of file  :"+f.exists());
	        	  break;
	           }
	           case 2:
	           {
	        	   if(f.canRead()&&f.canWrite())
	        	   {
	        	      System.out.println("the file is both readable and writeable");
	        	   }
	        	   else if(f.canRead())
	        	   {
		        	      System.out.println("the file is readable ");
		        	}  
	        	   else
	        	   {
		        	      System.out.println("the file is  writeable");
		           }  
	        	   break;
	           }
	           case 3:
	           {
	        	   int s=filename.length();
	        	   System.out.println("type of the file");
	        	   int index=filename.lastIndexOf(".");
	        	   if(index>0)
	        	   {
	        		   String type=filename.substring(index+1);
	        		   System.out.println(type);
	        	   }
	        	   break;
	           }
	           case 4:
	           {
	        	   System.out.println("length of the file :"+f.length()+ "bytes");
	        	   break;
	           }
	        }
	        System.out.println("--------");
	        System.out.println("enter 'y' to continue");
	        d=obj.next().charAt(0);
	        System.out.println("---------");
	    }while(d=='y'||d=='Y');
	
	}

}
    


