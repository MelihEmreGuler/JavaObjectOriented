package ch9.calculator;

public class CalculatorWithMemory {
//	int firstArgumentPointer = 0;
//	int secondArgumentPointer = 0;
//	int operationPointer = 0;
//	int resultPointer = 0;
	int listPointer = 0;

	int[] firstArgumentArray = new int[10];
	int[] secondArgumentArray = new int[10];
	char[] operationArray = new char[10];
	double[] resultArray = new double[10];
	
	public void addToList(int firstArgumentParameter, int secondArgumentParameter, char operationParameter, double resultParameter) {
		if(listPointer < 10) {
			firstArgumentArray[listPointer] = firstArgumentParameter;
			secondArgumentArray[listPointer] = secondArgumentParameter;
			operationArray[listPointer] = operationParameter;
			resultArray[listPointer] = resultParameter;
			listPointer++;
		}else {
			for(int i = 0; i < 9; i++) {
				firstArgumentArray[i] = firstArgumentArray[i+1];
				secondArgumentArray[i] = secondArgumentArray[i+1];
				operationArray[i] = operationArray[i+1];
				resultArray[i] = resultArray[i+1];
			}
			listPointer--;
			addToList(firstArgumentParameter, secondArgumentParameter, operationParameter, resultParameter);
		}
	}

//	public void addFirstArgument(int firstArgumentParameter) {
//		if (firstArgumentPointer < 10) {
//			firstArgumentArray[firstArgumentPointer] = firstArgumentParameter;
//			firstArgumentPointer++;
//		} else {
//			for(int i = 0; i < 9; i++) {
//				firstArgumentArray[i] = firstArgumentArray[i+1];
//			}
//			firstArgumentPointer--;
//			addFirstArgument(firstArgumentParameter);
//		}
//	}
//
//	public void addSecondArgument(int secondArgumentParameter) {
//		if (secondArgumentPointer < 10) {
//			secondArgumentArray[secondArgumentPointer] = secondArgumentParameter;
//			secondArgumentPointer++;
//		} else {
//			for(int i = 0; i < 9; i++) {
//				secondArgumentArray[i] = secondArgumentArray[i+1];
//			}
//			secondArgumentPointer--;
//			addSecondArgument(secondArgumentParameter);
//		}
//	}
//
//	public void addOperation(char operationParameter) {
//		if (operationPointer < 10) {
//			operationArray[operationPointer] = operationParameter;
//			operationPointer++;
//		} else {
//			for(int i = 0; i < 9; i++) {
//				operationArray[i] = operationArray[i+1];
//			}
//			operationPointer--;
//			addOperation(operationParameter);
//		}
//	}
//
//	public void addResult(double resultParameter) {
//		if (resultPointer < 10) {
//			resultArray[resultPointer] = resultParameter;
//			resultPointer++;
//		} else {
//			for(int i = 0; i < 9; i++) {
//				resultArray[i] = resultArray[i+1];
//			}
//			resultPointer--;
//			addResult(resultParameter);
//		}
//	}

	

}
