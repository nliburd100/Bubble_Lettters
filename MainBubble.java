import java.util.*;
import java.util.concurrent.TimeUnit;

public class MainBubble {
	public static void main(String[] args) {
		//initializes a bunch of variables
		InputFrame newFrame = new InputFrame();
		Scanner scan = new Scanner(System.in);
		String inputString;
		char[] charASCII;
		final int length;
		int spacing;
		boolean bool = false;
		
		//takes in lower case version of the input string
		while (bool == false) {
			bool = newFrame.go();
			try {
				TimeUnit.MILLISECONDS.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("done");
		CharMapper charMap = new CharMapper(newFrame.getInput(2));
		spacing = charMap.getSpacing();
		String[][] map = charMap.map();
		inputString = newFrame.getInput(1).toLowerCase();
		
		//determines string length, and creates integer array based on length
		length = inputString.length();
		charASCII = new char[length];
		
		//assigns a integer array the character values of each character
		for (int i = 0; i < length; i++) {
			charASCII[i] = inputString.charAt(i);
		}
		//prints bubble letter lines, 6 times, for each layer
		String formatted = "<html>";
		for (int l = 0; l < spacing; l++) {
			for (int c = 0; c < length; c++) {
				//if the character is not a to b it's replaced by a space
				
				if (charASCII[c]-97 <= 26 && charASCII[c]-97 >= 0) {
					formatted += map[l][charASCII[c]-97];
				} else {
				//prints the pieces of the letters
					formatted += "    ";
				}
			}
			//creates a new line each time the line is complete
			formatted += "\n";
		}
		newFrame.setLabelText(formatted);
		scan.close();
	}
}
