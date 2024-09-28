package ch9.calculator;

import ch09.StatefulCalculator;

public class StatefulCalculator {

	String name;

	int firstArgument;
	int secondArgument;
	double result;
	char operation;

	CalculatorWithMemory calculatorWithMemory = new CalculatorWithMemory();

	// That's the engine that does calculations.
	Calculator calculator = new Calculator();

	public String getName() {
		return name;
	}

	public void setName(String newName) {
		name = newName;
	}

	void whoAreYou() {
		System.out.println("I'm a Calculator, my name is " + name);
	}

	public int getFirstArgument() {
		return firstArgument;
	}

	public void setFirstArgument(int newFirstArgument) {
		firstArgument = newFirstArgument;
	}

	public int getSecondArgument() {
		return secondArgument;
	}

	public void setSecondArgument(int newSecondArgument) {
		secondArgument = newSecondArgument;
	}

	public char getOperation() {
		return operation;
	}

	public void setOperation(char newOperation) {
		operation = newOperation;
	}

	public double getResult() {
		switch (operation) {
		case '+':
			result = calculator.add(firstArgument, secondArgument);
			break;
		case '-':
			result = calculator.subtract(firstArgument, secondArgument);
			break;
		case '*':
			result = calculator.multiply(firstArgument, secondArgument);
			break;
		case '/':
			result = calculator.divide(firstArgument, secondArgument);
			break;
		}
//		calculatorWithMemory.addFirstArgument(firstArgument);
//		calculatorWithMemory.addSecondArgument(secondArgument);
//		calculatorWithMemory.addOperation(operation);
//		calculatorWithMemory.addResult(result);
		
		calculatorWithMemory.addToList(firstArgument, secondArgument, operation, result);

		return result;
	}

	public void showLastTenFirstArguments() {
		System.out.print("The Last Ten First Arguments: ");
		for (int argument : calculatorWithMemory.firstArgumentArray) {
			System.out.print(argument + " ");
		}
		System.out.println("");
	}

	public void showLastTenSecondArguments() {
		System.out.print("The Last Ten Second Arguments: ");
		for (int argument : calculatorWithMemory.secondArgumentArray) {
			System.out.print(argument + " ");
		}
		System.out.println("");
	}

	public void showLastTenOperations() {
		System.out.print("The Last Ten Operations: ");
		for (char argument : calculatorWithMemory.operationArray) {
			System.out.print(argument + " ");
		}
		System.out.println(""); 
	}

	public void showLastTenResults() {
		System.out.print("The Last Ten Results: ");
		for (double argument : calculatorWithMemory.resultArray) {
			System.out.print(argument + " ");
		}
		System.out.println(""); 
	}

	public void showLastTenCalculates() {
		System.out.println("The Last Ten Calculates: ");
		for (int i = 0; i < 10; i++) {
			System.out.print(i + 1 + ". " + calculatorWithMemory.firstArgumentArray[i] + " "
					+ calculatorWithMemory.operationArray[i] + " " + calculatorWithMemory.secondArgumentArray[i] + " = " 
					+ calculatorWithMemory.resultArray[i] + "\n");

		}
	}
}
