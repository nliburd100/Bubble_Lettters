
import java.io.File;
import java.util.Scanner;

public class CharMapper {
	String filename;
	String[][] charMap = new String[6][26];

	public CharMapper(String fontType) {	
		filename = fontType;
	}

	public String[][] map() {
		String workingDirectory = System.getProperty("user.dir");
		String absoluteFilePath = workingDirectory + File.separator + "src" + File.separator + filename + ".txt";
		File file = new File(absoluteFilePath);
		try {
			int character = 0;
			int line = 0;
			Scanner scan = new Scanner(file);
			while (line < 26 * 6) {
				charMap[line%6][character]  = scan.nextLine();
				++line;
				if (line%6 == 0) {
					character++;
				}
			}
			scan.close();
		}
		catch (Exception ex) {
		ex.printStackTrace();
		}
		return charMap;
	}
} 
