package ch9.calculator;

public class StatefulCalculatorTest {
	public static void main(String[] args) {
		StatefulCalculator calculator = new StatefulCalculator();
		
		int a = 12;
		int b = 52;

//		calculator.setFirstArgument(a);
//		calculator.setSecondArgument(b);
//		calculator.setOperation('*');
//		double result = calculator.getResult();
		
//		calculator.setFirstArgument(13);
//		calculator.setSecondArgument(b);
//		calculator.getResult();
//		calculator.setFirstArgument(14);
//		calculator.setSecondArgument(b);
//		calculator.getResult();
//		calculator.setFirstArgument(15);
//		calculator.setSecondArgument(b);
//		calculator.getResult();
//		calculator.setFirstArgument(16);
//		calculator.setSecondArgument(b);
//		calculator.getResult();
//		calculator.setFirstArgument(17);
//		calculator.setSecondArgument(b);
//		calculator.getResult();
//		calculator.setFirstArgument(18);
//		calculator.getResult();
//		calculator.setFirstArgument(19);
//		calculator.getResult();
//		calculator.setFirstArgument(20);
//		calculator.getResult();
//		calculator.setFirstArgument(21);
//		calculator.getResult();
//		calculator.setFirstArgument(22);
//		calculator.getResult();
//		calculator.setFirstArgument(23);
//		calculator.getResult();
		for(int i = 0; i < 30; i++) {
			calculator.setFirstArgument(a);
			calculator.setSecondArgument(b);
			if(i % 3 == 0) {				
				calculator.setOperation('*');
			}else if(i % 4 == 0){
				calculator.setOperation('/');
			}else if(i % 5 == 0){
				calculator.setOperation('-');
			}else {
				calculator.setOperation('+');
			}
			calculator.getResult();
			a++; b++;
		}
		
//		System.out.println("Result: " + result);
//		System.out.println(calculator.getFirstArgument() + " " + calculator.getOperation() + " " + 
//				calculator.getSecondArgument() + " = " + result);
		System.out.println("************");
		calculator.showLastTenFirstArguments();
		calculator.showLastTenSecondArguments();
		calculator.showLastTenOperations();
		calculator.showLastTenResults();
		calculator.showLastTenCalculates();
		System.out.println("************");
		
//		calculator.setFirstArgument(17);
//		calculator.setSecondArgument(92);
//		calculator.setOperation('/');
//		result = calculator.getResult();
//		System.out.println("Result: " + result);
//		System.out.println(calculator.getFirstArgument() + " " + calculator.getOperation() + " " + calculator.getSecondArgument() + " = " + result);
	}
}
