import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import javax.swing.*;

public class InputFrame extends JFrame implements ActionListener {
	private static final long serialVersiomnUID = -6888861450765530843L;
	boolean bool = false;
	public JFrame f = new JFrame("Bubble Letter Converter");
	Container c = new Container();
	String[] fontList = { "Graffiti", "Sample Text", "Lmao", "Font2", "Font4" };
	@SuppressWarnings({ "unchecked", "rawtypes" })
	JComboBox fontSelection = new JComboBox(fontList);
	JTextField inputField = new JTextField("Enter any text here");
	JLabel outputField = new JLabel();
	JButton convert = new JButton("Convert");
	
	public InputFrame() {
		initialize();
	}
	
	private void initialize() {
		Dimension d = new Dimension(600, 400);
		Dimension sd= new Dimension (100, 100);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fontSelection.setSelectedIndex(0);
		f.setSize(d);
		outputField.setSize(sd);
		convert.addActionListener(this);
		
		f.add(fontSelection, BorderLayout.CENTER);
		f.add(inputField, BorderLayout.LINE_START);
		f.add(outputField, BorderLayout.PAGE_END);
		f.add(convert, BorderLayout.LINE_END);
		
		f.setVisible(true);
		f.setResizable(false);
	}
	public String getInput(int v) {
		String input;
		switch (v) {
			case 1:
			input = inputField.getText();
			break;
			case 2:
			input = (String)fontSelection.getSelectedItem();
			break;
			default:
			input = null;
			break;
		}
		return input;
	}
	public void actionPerformed(ActionEvent cp) {
		String action = cp.getActionCommand();
		if (action.equals("Convert")) {
			bool = true;
		}
	}
	public boolean go() {
		return bool;
	}
	public static String convertToMultiline(String orig) {
	    return "<html>" + orig.replaceAll("\n", "<br>");
	}
	public void setLabelText(String formatted) {
		outputField.setText(convertToMultiline("<html><pre>" + formatted + "</pre><html>"));
		
	}
}

