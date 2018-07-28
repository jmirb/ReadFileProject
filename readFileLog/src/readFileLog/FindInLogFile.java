package readFileLog;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

public class FindInLogFile {
	
	//public static final String stringToFind = "Jul 28 10:";

	public static void findLinesInLog(String dateStr, ReadFile rf) throws IOException {
		
		BufferedReader br = rf.readFileWithBuffer();
				
		String line = br.readLine();
		
		while( line != null ) {
			
			boolean isDateValid = line.startsWith(dateStr);
			if (isDateValid) {
				System.out.println(line);
			}
			
			line = br.readLine();
			
		}
	}


}
