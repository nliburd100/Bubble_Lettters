import java.util.*;
import java.awt.*;
import javax.swing.*;

public class MainBubble {
	public static void main(String[] args) {
		//initializes a bunch of variables
		InputFrame newFrame = new InputFrame();
		Scanner scan = new Scanner(System.in);
		String inputString;
		char[] charASCII;
		final int length;
		int spacing;
		
		//takes in lowercase version of the input string
		synchronized(newFrame){
            try{
                newFrame.wait();
            }catch(InterruptedException e){
                e.printStackTrace();
            }
		
		CharMapper charMap = new CharMapper(newFrame.getInput(2));
		spacing = charMap.getSpacing();
		String[][] map = charMap.map();
		inputString = newFrame.getInput(1).toLowerCase();
		
		//determines string length, and creates int array based on length
		length = inputString.length();
		charASCII = new char[length];
		
		//assigns a integer array the character values of each character
		for (int i = 0; i < length; i++) {
			charASCII[i] = inputString.charAt(i);
		}
		//prints bubble letter lines, 6 times, for each layer
		for (int l = 0; l < spacing; l++) {
			for (int c = 0; c < length; c++) {
				//if the character is not a to b it's replaced by a space
				if (charASCII[c]-97 <= 26 && charASCII[c]-97 >= 0) {
					System.out.print(map[l][charASCII[c]-97]);
				} else {
				//prints the pieces of the letters
				System.out.print("    ");
				}
			}
			//creates a new line each time the line is complete
			System.out.println();
		}
		scan.close();
	}
	}
}
