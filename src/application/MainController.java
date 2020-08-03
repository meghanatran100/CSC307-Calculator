package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Button;


public class MainController {
	
	@FXML
	private Label result;
	private float x = 0;
	private String operation = "";
	private String calculation = "";
	private boolean start = true;
	private Operation op;

	private float output;
	
	
	public void processNumbers(ActionEvent event) {
		if (start) {
			result.setText("");
			start = false;
		}
		String value = ((Button)event.getSource()).getText();
		calculation += value;
		result.setText(result.getText() + value);
	}
	
	public void processOperators(ActionEvent event) {
		String value = ((Button)event.getSource()).getText();
		
		if (!value.equals("=")) {
			if (!operation.isEmpty())
				return;
			operation = value;
			x = Long.parseLong(result.getText());
			calculation = calculation + operation;
			result.setText("");
		}
		
		else {
			if (operation.isEmpty())
				return;
			
			float y = Long.parseLong(result.getText());
			
			switch (operation) {
				case "+":
					op = new Addition(x, y);
					break;
					
				case "-":
					op = new Subtraction(x, y);
					break;
					
				case "*":
					op = new Multiplication(x, y);
					break;
					
				case "/":
					op = new Division(x, y);
					break;
				case "log":
					op = new Logarithm(x, y);
					break;
					
				default:
					
			}
			output = op.Calc();
			calculation += "=";
			if (output == -1)
				calculation += "undefined";
			else 
				calculation += output;
			result.setText(calculation);
			operation = "";
			calculation = "";
			start = true;
		}
		
	}
}
