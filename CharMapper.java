import java.io.File;
import java.util.Scanner;

public class CharMapper {
	File file = new File("C:\\Users\\Administrator\\Workspace\\Bubble_Lettters\\src\\CharMap.txt");
	String[][] charMap = new String[6][26];
	
	public CharMapper() {	
	}
	
	public String[][] map() {
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
