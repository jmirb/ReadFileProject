package readFileLog;

import java.io.IOException;

public class readingFileMain {

	public static void main(String[] args) throws IOException {
		
		String dateStr = "Sat Jul 28 10:";
		
		ReadFile rf = new ReadFile(args[0]);
		
		FindInLogFile.findLinesInLog(dateStr, rf);


	}

}
