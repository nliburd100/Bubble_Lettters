import java.util.*;

public class MainBubble {
	public static void main(String[] args) {
		//initializes a bunch of variables
		CharMapper charMap = new CharMapper();
		String[][] map = charMap.map();
		Scanner scan = new Scanner(System.in);
		String inputString;
		char[] charASCII;
		final int length;
		
		//takes in lowercase version of the input string
		System.out.println("Please enter a string: ");
		inputString = scan.nextLine().toLowerCase();
		
		
		//determines string length, and creates int array based on length
		length = inputString.length();
		charASCII = new char[length];
		
		//assigns a int array the character values of each character
		for (int i = 0; i < length; i++) {
			charASCII[i] = inputString.charAt(i);
		}
		//prints bubble letter lines, 6 times, for each layer
		for (int l = 0; l < 6; l++) {
			for (int c = 0; c < length; c++) {
				//if the character is not a to b it's replaced by a space
				if (charASCII[c]-97 >= 25 || charASCII[c]-97 <= 0) {
					System.out.print("    ");
					c++;
				}
				//prints the pieces of the letters
				System.out.print(map[l][charASCII[c]-97]);
			}
			//creates a new line each time the line is complete
			System.out.println();
		}
		scan.close();
	}
}
