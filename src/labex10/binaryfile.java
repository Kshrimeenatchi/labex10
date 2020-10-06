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
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class binaryfile {
    public static void main(String[] args) throws IOException {
		FileInputStream fip=null;
		FileOutputStream fop=null;
		fip=new FileInputStream("input pic.PNG");
		fop=new FileOutputStream("output bin.PNG");
		int i;
		while((i=fip.read())!=-1)
		{
			fop.write(i);
		}
		fop.close();
		

	}
    
}
