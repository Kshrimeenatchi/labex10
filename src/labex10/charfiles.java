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
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class charfiles {
    public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
   FileReader fip=null;
   FileWriter fop=null;
   fip=new FileReader("input pic.PNG");
   fop=new FileWriter("output char .PNG");
   int i;
   while((i=fip.read())!=-1)
   {
	   fop.write(i);
   }
   fop.close();
	}

}
    
