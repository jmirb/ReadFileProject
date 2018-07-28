package readFileLog;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FindString {
	
	public static final String stringToFind = "Jul 28 10:00:00";
	public static final String nameFile =  "/var/log/system.log" ;


	public static int countString() throws IOException {
	
		BufferedReader br = ReadFile.readFileWithBuffer(nameFile);
		
		String line;
		int count = 0;
		
		do {
			
			line = br.readLine();
			System.out.println(line);
			count++;
			
		}while ( line != null || count < 10); 
		
		return 0;

	}


}
