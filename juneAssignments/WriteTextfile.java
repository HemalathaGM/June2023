package juneAssignments;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteTextfile {
	public static void main(String[] args) throws IOException {
		BufferedWriter obufferedwriter=null;
		//1.Path of the file where to write.
		String userdir=System.getProperty("user.dir");
		String fileSeparator=System.getProperty("file.separator");
		
		String spath=userdir+fileSeparator+"Filesfolder"+fileSeparator+"WriteFile.txt";
		//2.File Writer
		FileWriter ofilewriter;
		try {
			ofilewriter=new FileWriter(spath);
			obufferedwriter=new BufferedWriter(ofilewriter);
			obufferedwriter.write("Welcome to Java Session");
			obufferedwriter.write("\n");
			obufferedwriter.write("Welcome to Manual sessions");
			obufferedwriter.write("\n");
			obufferedwriter.write("Edited by Mary");
		}catch(IOException e) {
			
			e.printStackTrace();
			
		}finally {
			obufferedwriter.close();
		}
		
	}

}
