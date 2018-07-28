package readFileLog;

import java.io.IOException;

public class readingFileMain {

	public static void main(String[] args) throws IOException {
		
		String dateStr = "Jul 28 10:";
		ReadFile rf = new ReadFile(args[0].toString());
		
		FindInLogFile.findLinesInLog(dateStr, rf);

	}

}
