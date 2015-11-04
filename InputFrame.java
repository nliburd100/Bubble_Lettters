import java.awt.Dimension;
import java.util.*;
import java.awt.*;
import javax.swing.*;

public class InputFrame extends JFrame {
	public JFrame f = new JFrame("Bubble Letter Converter");
	String[] fontList = { "Bubble Letters", "Sample Text", "Lmao", "Font2", "Font4" };
	JComboBox fontSelection = new JComboBox(fontList);
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public InputFrame() {
		Dimension d = new Dimension(600, 400);
		Dimension sd = new Dimension(80, 40);
		Container c = new Container();
		c.setSize(sd);	
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(d);
		fontSelection.setSelectedIndex(0);
		fontSelection.setMaximumSize(sd);
		c.add(fontSelection, BorderLayout.CENTER);
		
		f.getContentPane().add(c, BorderLayout.CENTER);
		f.setResizable(false);
		f.setVisible(true);
	}
	public String getInput(int v) {
		String input;
		switch (v) {
			case 1:
			input = null;
			break;
			case 2:
			input = null;
			break;
			default:
			input = null;
			break;
		}
		return input;
	}
}

