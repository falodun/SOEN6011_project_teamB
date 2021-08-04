package Model;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import Model.ScientificCalculatorComponents;
import Controller.CalculationForFunction5;
//import View.ScientificCalculator.FunctionHandler;
import Controller.CalculationForFunction7;



public class ScientificCalculatorComponents {
	
	public FunctionHandler functionHandler;
	public interface FunctionHandler { 
		void updateData(JFrame frame);
		String findResult(JFrame frame);
	}
	
	public JFrame frame;
	private JTextField textFieldResult;
	
	private static final List<String> numbers = Collections.unmodifiableList(Arrays.asList("0","1","2","3","4","5","6","7","8","9"));
		
	/**
	 * Create the application.
	 */
	public ScientificCalculatorComponents() { //constructor to initialize the structure of calculator
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 583, 632);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("SCIENTIFIC CALCULATOR");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 0, 467, 32);
		frame.getContentPane().add(lblNewLabel);
		
		//********TextField Result*****
		textFieldResult = new JTextField();
		textFieldResult.setHorizontalAlignment(SwingConstants.RIGHT);
		textFieldResult.setFont(new Font("Tahoma", Font.BOLD, 21));
		textFieldResult.setBounds(10, 43, 531, 82);
		frame.getContentPane().add(textFieldResult);
		textFieldResult.setColumns(10);
		textFieldResult.setEditable(false);
		
		//********Button 1**********
		final JButton btnOne = new JButton("1");
		btnOne.setEnabled(false);
		btnOne.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String input = textFieldResult.getText();
				if(input.contains("Enter the value of")) {
					input = "";
					input = btnOne.getText();
					
				}else if(input.contains(String.valueOf(numbers))) {
					input += btnOne.getText();
					
				}else if(input.contains("ERROR") || input.contains("Please select")) {
					input = "Please select one of the functions first!";
					
				}else {
					input += btnOne.getText();
					
				}
				
				textFieldResult.setText(input);
			}
		});
		btnOne.setFont(new Font("Tahoma", Font.BOLD, 23));
		btnOne.setBounds(20, 219, 80, 62);
		frame.getContentPane().add(btnOne);
		
		//********Button 2******************
		final JButton btnTwo = new JButton("2");
		btnTwo.setEnabled(false);
		btnTwo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String input = textFieldResult.getText();
				if(input.contains("Enter the value of")) {
					input = "";
					input = btnTwo.getText();
					
				}else if(input.contains(String.valueOf(numbers))) {
					input += btnTwo.getText();
					
				}else if(input.contains("ERROR") || input.contains("Please select")) {
					input = "Please select one of the functions first!";
					
				}else {
					input += btnTwo.getText();
					
				}
				
				textFieldResult.setText(input);
			}
		});
		btnTwo.setFont(new Font("Tahoma", Font.BOLD, 23));
		btnTwo.setBounds(110, 219, 80, 62);
		frame.getContentPane().add(btnTwo);
		
		
		//********Button 3******************
		final JButton btnThree = new JButton("3");
		btnThree.setEnabled(false);
		btnThree.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String input = textFieldResult.getText();
				if(input.contains("Enter the value of")) {
					input = "";
					input = btnThree.getText();
					
				}else if(input.contains(String.valueOf(numbers))) {
					input += btnThree.getText();
					
				}else if(input.contains("ERROR") || input.contains("Please select")) {
					input = "Please select one of the functions first!";
					
				}else {
					input += btnThree.getText();
					
				}
				
				textFieldResult.setText(input);
			}
		});
		btnThree.setFont(new Font("Tahoma", Font.BOLD, 23));
		btnThree.setBounds(200, 219, 80, 62);
		frame.getContentPane().add(btnThree);
		
		
		//********Button 4******************
		final JButton btnFour = new JButton("4");
		btnFour.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String input = textFieldResult.getText();
				if(input.contains("Enter the value of")) {
					input = "";
					input = btnFour.getText();
					
				}else if(input.contains(String.valueOf(numbers))) {
					input += btnFour.getText();
					
				}else if(input.contains("ERROR") || input.contains("Please select")) {
					input = "Please select one of the functions first!";
					
				}else {
					input += btnFour.getText();
					
				}
				
				textFieldResult.setText(input);
			}
		});
		btnFour.setFont(new Font("Tahoma", Font.BOLD, 23));
		btnFour.setBounds(20, 292, 80, 62);
		frame.getContentPane().add(btnFour);
		btnFour.setEnabled(false);
		
		
		//********Button 5******************
		final JButton btnFive = new JButton("5");
		btnFive.setEnabled(false);
		btnFive.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String input = textFieldResult.getText();
				if(input.contains("Enter the value of")) {
					input = "";
					input = btnFive.getText();
					
				}else if(input.contains(String.valueOf(numbers))) {
					input += btnFive.getText();
					
				}else if(input.contains("ERROR") || input.contains("Please select")) {
					input = "Please select one of the functions first!";
					
				}else {
					input += btnFive.getText();
					
				}
				
				textFieldResult.setText(input);
			}
		});
		btnFive.setFont(new Font("Tahoma", Font.BOLD, 23));
		btnFive.setBounds(110, 292, 80, 62);
		frame.getContentPane().add(btnFive);
		
		
		//********Button 6******************
		final JButton btnSix = new JButton("6");
		btnSix.setEnabled(false);
		btnSix.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String input = textFieldResult.getText();
				if(input.contains("Enter the value of")) {
					input = "";
					input = btnSix.getText();
					
				}else if(input.contains(String.valueOf(numbers))) {
					input += btnSix.getText();
					
				}else if(input.contains("ERROR") || input.contains("Please select")) {
					input = "Please select one of the functions first!";
					
				}else {
					input += btnSix.getText();
					
				}
				
				textFieldResult.setText(input);
			}
		});
		btnSix.setFont(new Font("Tahoma", Font.BOLD, 23));
		btnSix.setBounds(200, 292, 80, 62);
		frame.getContentPane().add(btnSix);
		
		
		//********Button 7******************
		final JButton btnSeven = new JButton("7");
		btnSeven.setEnabled(false);
		btnSeven.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String input = textFieldResult.getText();
				if(input.contains("Enter the value of")) {
					input = "";
					input = btnSeven.getText();
					
				}else if(input.contains(String.valueOf(numbers))) {
					input += btnSeven.getText();
					
				}else if(input.contains("ERROR") || input.contains("Please select")) {
					input = "Please select one of the functions first!";
					
				}else {
					input += btnSeven.getText();
					
				}
				
				textFieldResult.setText(input);
			}
		});
		btnSeven.setFont(new Font("Tahoma", Font.BOLD, 23));
		btnSeven.setBounds(20, 365, 80, 62);
		frame.getContentPane().add(btnSeven);
		
		//********Button 8******************
		final JButton btnEight = new JButton("8");
		btnEight.setEnabled(false);
		btnEight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String input = textFieldResult.getText();
				if(input.contains("Enter the value of")) {
					input = "";
					input = btnEight.getText();
					
				}else if(input.contains(String.valueOf(numbers))) {
					input += btnEight.getText();
					
				}else if(input.contains("ERROR") || input.contains("Please select")) {
					input = "Please select one of the functions first!";
					
				}else {
					input += btnEight.getText();
					
				}
				
				textFieldResult.setText(input);
			}
		});
		btnEight.setFont(new Font("Tahoma", Font.BOLD, 23));
		btnEight.setBounds(110, 365, 80, 62);
		frame.getContentPane().add(btnEight);
		
		
		//********Button 9******************
		final JButton btnNine = new JButton("9");
		btnNine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String input = textFieldResult.getText();
				if(input.contains("Enter the value of")) {
					input = "";
					input = btnNine.getText();
					
				}else if(input.contains(String.valueOf(numbers))) {
					input += btnNine.getText();
					
				}else if(input.contains("ERROR") || input.contains("Please select")) {
					input = "Please select one of the functions first!";
					
				}else {
					input += btnNine.getText();
					
				}
				
				textFieldResult.setText(input);
			}
		});
		btnNine.setFont(new Font("Tahoma", Font.BOLD, 23));
		btnNine.setBounds(200, 365, 80, 62);
		frame.getContentPane().add(btnNine);
		btnNine.setEnabled(false);
		
		
		//********Button 0******************
		final JButton btnZero = new JButton("0");
		btnZero.setEnabled(false);
		btnZero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String input = textFieldResult.getText();
				if(input.contains("Enter the value of")) {
					input = "";
					input = btnZero.getText();
					
				}else if(input.contains(String.valueOf(numbers))) {
					input += btnZero.getText();
					
				}else if(input.contains("ERROR") || input.contains("Please select")) {
					input = "Please select one of the functions first!";
					
				}else {
					input += btnZero.getText();
					
				}
				
				textFieldResult.setText(input);
			}
		});
		btnZero.setFont(new Font("Tahoma", Font.BOLD, 23));
		btnZero.setBounds(110, 438, 80, 62);
		frame.getContentPane().add(btnZero);
		
		
		//********Button Clear**************
		final JButton btnClear = new JButton("C");
		btnClear.setEnabled(false);
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFieldResult.setText(null);
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 21));
		btnClear.setBounds(110, 146, 80, 62);
		frame.getContentPane().add(btnClear);
		
		
		//********Button BackSpace**********
		final JButton btnBackSpace = new JButton("\uF0E7");
		btnBackSpace.setEnabled(false);
		btnBackSpace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				String input = textFieldResult.getText();
				
				if(input.length() > 0) {
					
					if(input.contains("ERROR")|| input.contains("enter")) {
						input = "";
						textFieldResult.setText(input);
						
					}else {
						
					String resultToDisplay = input.substring(0, input.length()-1);
					textFieldResult.setText(resultToDisplay);
					}
				}
			}
		});
		btnBackSpace.setFont(new Font("wingdings", Font.BOLD, 21));
		btnBackSpace.setBounds(200, 146, 80, 62);
		frame.getContentPane().add(btnBackSpace);
				

		
		//********Button Dot****************
		final JButton btnDot = new JButton(".");
		btnDot.setEnabled(false);
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String input = textFieldResult.getText();
				if(input.contains("ERROR")|| input.contains("Enter")) {
					input = "";
				}
				
				input += btnDot.getText();
				textFieldResult.setText(input);
			}
		});
		btnDot.setFont(new Font("Tahoma", Font.BOLD, 23));
		btnDot.setBounds(200, 438, 80, 62);
		frame.getContentPane().add(btnDot);
		
		
		//********Button Negative***********
		final JButton btnNegative = new JButton("-");
		btnNegative.setEnabled(false);
		btnNegative.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String input = textFieldResult.getText();
				if(input.contains("Enter")) {
					input = btnNegative.getText();
					textFieldResult.setText(input);
					
				}else if(input.isEmpty()) {
					
					input += btnNegative.getText();
					textFieldResult.setText(input);
				}else {
					
					textFieldResult.setText("ERROR"); //Cannot put MINUS in between digits!
				}
			}
		});
		
		btnNegative.setFont(new Font("Tahoma", Font.BOLD, 23));
		btnNegative.setBounds(20, 438, 80, 62);
		frame.getContentPane().add(btnNegative);
		

		
		
		//********Button Function1**********
		final JButton btnFunction1 = new JButton("F1: arccos(x)");
		btnFunction1.setEnabled(false);
		btnFunction1.setFont(new Font("Tahoma", Font.BOLD, 21));
		//btnFunction1.setBounds(335, 146, 206, 62);
		btnFunction1.setBounds(335, 146, 206, 62);
		frame.getContentPane().add(btnFunction1);
		
		//********Button Function3**********
		final JButton btnFunction3 = new JButton("F3: sinh(x)");
		btnFunction3.setEnabled(false);
		btnFunction3.setFont(new Font("Tahoma", Font.BOLD, 21));
		//btnFunction2.setBounds(335, 219, 206, 62);
		btnFunction3.setBounds(335, 219, 206, 62);
		frame.getContentPane().add(btnFunction3);
		
		//********Button Function5**********
		final JButton btnFunction5 = new JButton("F5: ab^x");
		btnFunction5.setEnabled(false);
		btnFunction5.setFont(new Font("Tahoma", Font.BOLD, 21));
		//btnFunction3.setBounds(335, 289, 206, 62);
		btnFunction5.setBounds(335, 289, 206, 62);
		frame.getContentPane().add(btnFunction5);
		
		btnFunction5.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent e) {
				
				functionHandler =  new CalculationForFunction5();
				functionHandler.updateData(frame);
				
			}
		});
		
		//********Button Function7**********
		final JButton btnFunction7 = new JButton("F7: x^y");
		btnFunction7.setEnabled(false);
		btnFunction7.setFont(new Font("Tahoma", Font.BOLD, 21));
		//btnFunction4.setBounds(335, 362, 206, 62);
		btnFunction7.setBounds(335, 362, 206, 62);
		frame.getContentPane().add(btnFunction7);
		
		
		btnFunction7.addActionListener(new ActionListener() {
			
		
			public void actionPerformed(ActionEvent e) {
				
				String input = textFieldResult.getText();
				
				if(input.contains("Please select one of the functions")) {
					textFieldResult.setText("Enter the value of x");
					functionHandler =  new CalculationForFunction7();
					
				}else if(input.isEmpty()) {
					textFieldResult.setText("Enter the value of x");
				}else {
					textFieldResult.setText("");
				}
				
				
//				functionHandler =  new CalculationForFunction4();
//				functionHandler.updateData(frame);
				
			}
		});
		
		
		//********Button Ok**************
		final JButton btnOk = new JButton("OK");
		btnOk.setFont(new Font("Tahoma", Font.BOLD, 23));
		btnOk.setEnabled(false);
		btnOk.setBounds(110, 511, 80, 62);
		frame.getContentPane().add(btnOk);
		btnOk.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				if(functionHandler instanceof CalculationForFunction7) {
					functionHandler.updateData(frame);
				}
				
			}
		});
		
		
		
		//********Button Equal**************
		final JButton btnEqual = new JButton("=");
		btnEqual.setEnabled(false);
		btnEqual.setFont(new Font("Tahoma", Font.BOLD, 23));
		//btnEqual.setBounds(359, 438, 100, 62);
		btnEqual.setBounds(335, 438, 206, 62);
		frame.getContentPane().add(btnEqual);
		
		btnEqual.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				if(functionHandler instanceof CalculationForFunction7) {
					textFieldResult.setText(functionHandler.findResult(frame));
					
				}else if(functionHandler instanceof CalculationForFunction5){
					functionHandler.updateData(frame);
					textFieldResult.setText(functionHandler.findResult(frame));
				}
				
			}
		});
		
		

		
		
		//********Button ON/OFF************
		final JButton btnOn = new JButton("ON");
		btnOn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(btnOn.getText().equals("ON")) { //when we switch Calculator ON
					
					btnOn.setText("OFF");
					
					textFieldResult.setEditable(true);
					textFieldResult.setText("Please select one of the functions");
					
					btnOne.setEnabled(true);
					btnTwo.setEnabled(true);
					btnThree.setEnabled(true);
					btnFour.setEnabled(true);
					btnFive.setEnabled(true);
					btnSix.setEnabled(true);
					btnSeven.setEnabled(true);
					btnEight.setEnabled(true);
					btnNine.setEnabled(true);
					btnZero.setEnabled(true);
					
					btnFunction1.setEnabled(true);
					btnFunction3.setEnabled(true);
					btnFunction5.setEnabled(true);
					btnFunction7.setEnabled(true);
					
					btnDot.setEnabled(true);
					btnClear.setEnabled(true);
					btnNegative.setEnabled(true);
					btnBackSpace.setEnabled(true);
					
					btnOk.setEnabled(true);
					
					
					btnEqual.setEnabled(true);
					
				}else { //case when we switch the Calculator OFF
					
					btnOn.setText("ON");
					
					textFieldResult.setText("");
					textFieldResult.setEditable(false);
					
					btnOne.setEnabled(false);
					btnTwo.setEnabled(false);
					btnThree.setEnabled(false);
					btnFour.setEnabled(false);
					btnFive.setEnabled(false);
					btnSix.setEnabled(false);
					btnSeven.setEnabled(false);
					btnEight.setEnabled(false);
					btnNine.setEnabled(false);
					btnZero.setEnabled(false);
					
					btnFunction1.setEnabled(false);
					btnFunction3.setEnabled(false);
					btnFunction5.setEnabled(false);
					btnFunction7.setEnabled(false);
					
					btnDot.setEnabled(false);
					btnClear.setEnabled(false);
					btnNegative.setEnabled(false);
					btnBackSpace.setEnabled(false);
					
					btnOk.setEnabled(false);
					
					btnEqual.setEnabled(false);
					
				}
				
			}
		});
		btnOn.setFont(new Font("Tahoma", Font.BOLD, 21));
		btnOn.setBounds(20, 146, 80, 62);
		frame.getContentPane().add(btnOn);
	}
}