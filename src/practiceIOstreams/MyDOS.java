package practiceIOstreams;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;

public class MyDOS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args[0].equals("dir")) {
			File f = new File(args[1]);
			String[] paths = f.list();
			for(String p:paths) {
				System.out.println(p);
			}
			
		}
		else if(args[0].equals("copy")) {
			File f1 = new File(args[1]);
			File f2 = new File(args[2]);
			
			try {
				
				FileInputStream f1Input = new FileInputStream(f1);
				
				FileOutputStream f2Output = new FileOutputStream(f2);
				
				BufferedInputStream br1 = new BufferedInputStream(f1Input);
				
				BufferedOutputStream br2 = new BufferedOutputStream(f2Output);
				
				int c = 0;
				while(c!=-1) {
					c = f1Input.read();
					f2Output.write(c);
					
				}
				
			}
			catch(Exception e) {
				System.out.println(e);
			}
			
			
		}
		else if(args[0].equals("type")) {
			File fileName = new File(args[1]);
			try {
				FileReader fr = new FileReader(fileName);
				int c = 0 ;
				while(c!=-1) {
					c = fr.read();
					System.out.println(c);
					
				}
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
