package ch7.stack;

public class StackTest {

	public static void main(String[] args) {
		Stack stack = new Stack();

		System.out.println(stack.push("birinci"));
		System.out.println(stack.push("ikinci"));
		System.out.println(stack.push("ucuncu"));
		System.out.println(stack.push("dorduncu"));
		System.out.println(stack.push("besinci"));
		System.out.println(stack.push("altinci"));
		
		//stack.clear();

		for (String string : stack.array) {
			System.out.println(string);

		}

		System.out.println("Capacity: " + stack.getCapacity());
		System.out.println("Empty: " + stack.isEmpty());
		System.out.println("Full: " + stack.isFull());
		System.out.println("Size: " + stack.size());
		stack.showElements();

		System.out.println("*****************");
		
		for(int i = 0; i < 6; i++) {
			System.out.println("Pop: " + stack.pop());
			System.out.println("Size: " + stack.size());
			System.out.println("Full: " + stack.isFull());
			System.out.println("Empty: " + stack.isEmpty() + "\n");			
		}

		stack.showElements();
		
		System.out.println(stack.push("yeni eleman"));
		
		stack.showElements();
		
	}

}
