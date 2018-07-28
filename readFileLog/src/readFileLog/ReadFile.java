package readFileLog;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ReadFile {
	
	private File file;
	
	public ReadFile(String nameFile){
		file = new File(nameFile);
	}
	
	/*
	 * 
	 */
	public BufferedReader readFileWithBuffer() throws FileNotFoundException{
				
		BufferedReader br = new BufferedReader(new FileReader(file));
		
		return br;
	}

}
