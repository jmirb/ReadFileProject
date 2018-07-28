package readFileLog;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FindString {
	
	public static final String stringToFind = "Jul 28 10:";
	public static final String nameFile =  "/var/log/system.log" ;


	public static int countString() throws IOException {
	
		BufferedReader br = ReadFile.readFileWithBuffer(nameFile);
		
		
		int count = 0;
		
		String line = br.readLine();
		
		while( line != null ) {
			
			boolean isDateValid = line.startsWith(stringToFind);
			if (isDateValid) {
				System.out.println(line);
				System.out.println(count);
			}
			line = br.readLine();
			count++;
			
		}
		return 0;

	}


}
