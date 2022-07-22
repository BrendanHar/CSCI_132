package Program01;

import java.util.Scanner;
import java.util.Random;

public class Calculator {

	// FIELDS
	private double answer;
	private Scanner scannedInput = new Scanner(System.in);
	public String usageInstructions = "Valid operations are: \n"
			+ " + \t add \n - \t subtract \n * \t multiply \n / \t divide \n"
			+ " c \t clear  \n neg \t negate \n % \t percent \n"
			+ " ^ \t raise to power of next value entered \n inv \t invert the current value \n"
			+ " rand \t radomize current value by a fractional amount \n"
			+ " round \t round to number of places given next \n" + " = \t print answer \n ? \t Help \n q \t Quit \n";

	// CONSTRUCTORS
	Calculator() {
		this.answer = 0;
	};

	// METHODS
	// prompt user for a double and check before returning
	public double getUserNum() {
		boolean validNumber = false;
		double userVal = 0;

		System.out.print("Enter number\n>>> ");

		while (validNumber == false) {
			if (scannedInput.hasNext("pi")) {
				userVal = 3.1415;
				scannedInput.next();
				validNumber = true;
			} else if (scannedInput.hasNextDouble()) {
				userVal = scannedInput.nextDouble();
				validNumber = true;
			} else {
				System.out.print("That's not a number. \nEnter a valid number\n>>> ");
				scannedInput.next();
			}
		}
		return userVal;
	}

	// prompt user for operation and check before returning
	public String getUserOp() {
		String op;

		System.out.print("Enter operation\n>>> ");
		op = scannedInput.next();
		while (!(this.checkUserOp(op))) {
			op = scannedInput.next();
		}
		return op;
	}

	// private helper method for getUserInput()
	private boolean checkUserOp(String op) {
		if (op.equals("+") || op.equals("-") || op.equals("=") || op.equals("?") || op.equals("Q") || op.equals("q")
				|| op.equals("*") || op.equals("/") || op.equals("c") || op.equals("C") || op.equals("neg")
				|| op.equals("%") || op.equals("^") || op.equals("inv") || op.equals("rand") || op.equals("round")) {
			return true;
		} else {
			System.out.print("Invalid Entry. Enter '?' for help." + "\nEnter a valid operation \n>>> ");
			return false;
		}
	}

	public double calculateAnswer(String op, double num) {
		switch (op) {
		case "+":
			add(num);
			break;
		case "-":
			subtract(num);
			break;
		case "*":
			multiply(num);
			break;
		case "/":
			divide(num);
			break;
		case "c":
		case "C":
			clear();
			break;
		case "neg":
			turnnegative();
			break;
		case "%":
			percentage();
			break;
		case "^":
			exponent(num);
			break;
		case "inv":
			invertNum();
			break;
		case "rand":
			Random rand = new Random();
			double double_rand = rand.nextDouble();
			this.answer = answer + double_rand;
			return this.answer;
			case "round":
			round();
			break;
		case "=":
			printAnswer();
			break;
		case "?":
			System.out.println(this.usageInstructions);
			break;
		default:
			System.out.println("Invalid Operator");
		}
		return this.answer;
	}

	public double add(double operand) {
		this.answer += operand;
		return this.answer;
	}

	public double subtract(double operand) {
		this.answer -= operand;
		return this.answer;
	}

	public double clear(){
		this.answer = 0;
		return this.answer;
	}

	public double multiply(double operand){
		this.answer *= operand;
		return this.answer;
	}

	public double divide(double operand){
		this.answer /= operand;
		return this.answer;
	}

	public double turnnegative(){
		this.answer = -answer;
		return this.answer;
	}

	public double percentage(){
		this.answer = answer/100;
		return this.answer;
	}

	public double exponent(double operand){
		this.answer = Math.pow(answer, operand);
		return this.answer;
	}

	public double invertNum(){
		this.answer = 1/answer;
		return this.answer;
	}

	public double round(){
		this.answer = Math.round(answer*100)/100.0;
		return this.answer;
	}

	public double getAnswer() {
		return this.answer;
	}

	public void printAnswer() {
		// https://www.fileformat.info/info/unicode/block/box_drawing/list.htm
		// https://www.homeandlearn.co.uk/java/java_formatted_strings.html

		// TODO: right justify the output inside a unicode box drawing
		String answerOutput = "| Your Answer is: ";

		System.out.println("┌--------------------------------------┐");
		System.out.printf("%-15s %15s %n", answerOutput, this.answer);
//		System.out.println("| Your Answer is: " + this.answer);
		System.out.println("└--------------------------------------┘");
	}

}
