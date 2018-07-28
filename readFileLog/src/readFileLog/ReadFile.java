package readFileLog;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ReadFile {
	
	static File file;
	
	private ReadFile(String nameFile){
		file = new File(nameFile);
	}
	
	/*
	 * 
	 */
	public static BufferedReader readFileWithBuffer(final String nameFile) throws FileNotFoundException{
		
		new ReadFile(nameFile);
		
		BufferedReader br = new BufferedReader(new FileReader(file));
		
		return br;
	}

}
