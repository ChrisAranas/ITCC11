/**
 * @author Chris Andrew R. Aranas
 * ITCC11 - A 2
 * Oct. 5,2020
 */
import javax.swing.*;
import java.awt.*;

public class  Calculator {
	private JFrame frame;
	private JPanel mainPanel;
	private JTextField textField;
	private JButton one;
	private JButton two;
	private JButton three;
	private JButton four;
	private JButton five;
	private JButton six;
	private JButton seven;
	private JButton eight;
	private JButton nine;
	private JButton zero;
	private JButton backspace;
	private JButton divide;
	private JButton multiply;
	private JButton add;
	private JButton subtract;
	private JButton dot;
	private JButton equals;
	private GridLayout grid;


	/**Constructor**/
	public Calculator() {
		frame = new JFrame("Calculator");
		textField = new JTextField(50);
		
		grid = new GridLayout(5, 4);
		
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Calculator");
		frame.setSize(500, 400);
		frame.pack();
		frame.setVisible(true);
		
		mainPanel = new JPanel(grid);
		one = new JButton ("1");
		two = new JButton ("2");
		three = new JButton ("3");
		four = new JButton ("4");
		five = new JButton ("5");
		six = new JButton ("6");
		seven = new JButton ("7");
		eight = new JButton ("8");
		nine = new JButton ("9");
		zero = new JButton ("0");
		backspace = new JButton ("<--");
		divide = new JButton ("/");
		multiply = new JButton ("*");
		add = new JButton ("+");
		subtract = new JButton ("-");
		dot = new JButton (".");
		equals = new JButton ("=");
		
		
		mainPanel.add(textField);
		mainPanel.add(one);
		mainPanel.add(two);
		mainPanel.add(three);
		mainPanel.add(four);
		mainPanel.add(five);
		mainPanel.add(six);
		mainPanel.add(seven);
		mainPanel.add(eight);
		mainPanel.add(nine);
		mainPanel.add(zero);
		mainPanel.add(backspace);
		mainPanel.add(divide);
		mainPanel.add(multiply);
		mainPanel.add(add);
		mainPanel.add(subtract);
		mainPanel.add(dot);
		mainPanel.add(equals);
		
		
		frame.add(mainPanel);	
			
	}
	
/*show the program*/
	public void show() {
		
	frame.setVisible(true);
	
	}
	
	public static void main(String[] args) {
		
		new Calculator();
		
	}

}
