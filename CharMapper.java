
import java.io.File;
import java.util.Scanner;

public class CharMapper {
	String filename;
	String[][] charMap = new String[6][26];
	public int spacing;

	public CharMapper(String fontType) {	
		filename = fontType;
		switch (fontType) {
			case "Bubble Letters":
				spacing = 6; break;
			case "Graffiti":
				spacing = 8; break;
			default:
				spacing = 1; break;
		}
	}
	public int getSpacing() {
		return spacing;
	}
	public String[][] map() {
		//dynamic file paths!!
		String workingDirectory = System.getProperty("user.dir");
		String absoluteFilePath = workingDirectory + File.separator + "src" + File.separator + filename + ".txt";
		File file = new File(absoluteFilePath);
		try {
			int character = 0;
			int line = 0;
			Scanner scan = new Scanner(file);
			while (line < 26 * spacing) {
				charMap[line%6][character]  = scan.nextLine();
				++line;
				if (line%spacing == 0) {
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
