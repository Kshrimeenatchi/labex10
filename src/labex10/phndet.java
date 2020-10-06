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
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class phndet {
    public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
   Scanner obj=new Scanner(System.in);
   FileWriter f=new FileWriter("details.txt");
   BufferedWriter b=new BufferedWriter(f);
   String s[]= {"aa-1234567890","bb-2345678901","cc-3456789012","dd-4567890123","ee-5678901234"};
   for(String i:s)
   {
	   b.write(i);
	   b.newLine();
   }
   b.close();
   System.out.println("enter the name");
   String s1=obj.next();
   int index=0;
   int c=0;
   boolean found=false;
  
  for(int i=0;i<s.length;i++)
   {  
 
	   if(s[i].contains(s1))
	   {
		   index=i;
		   found=true;
		   c=s1.length();
		   break;
	   }
	     
   }
   
   if(found)
   {
	   System.out.println(s[index].substring(c+1));
   }
   else
   {
	   System.out.println("invalid");   
   }
	}
}
    

