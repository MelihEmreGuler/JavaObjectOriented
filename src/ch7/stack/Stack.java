package ch7.stack;

import java.util.Arrays;

public class Stack {
//	Default maximum stack size
	public static final int MAX_STACK_SIZE = 5;

	boolean full = false;
	boolean empty = true;

	String[] array = new String[MAX_STACK_SIZE];

	int pointer = 0; // soldan sağa boş olan ilk elemanı göstersin.

//	Put element on the top
	public boolean push(String newElement) {

		if (!full) {
			array[pointer] = newElement;
			pointer++;
			empty = false;
			if (pointer == MAX_STACK_SIZE)
				full = true;
			return true;
		} else {
			return false;
		}
	}

//	Pop element from the top
	public String pop() {
		String lastItem = null;
		
		if(!empty) {			
			lastItem = array[pointer - 1];
			array[pointer - 1] = null;
			
			pointer--;
			if (pointer != MAX_STACK_SIZE)
				full = false;
			if(pointer == 0)
				empty = true;
		}
		return lastItem;
	}

	// Remove all elements from stack
	public void clear() {
		Arrays.fill(array, null);
		pointer = 0;
		empty = true;
		full = false;
	}

//	Stack status operations
//	Is stack empty?
	public boolean isEmpty() {
		return empty;

	}

// 	Is stack full?
	public boolean isFull() {
		return full;
	}

//  How many elements in stack?
	public int size() {
		return pointer ;
	}

//	Capacity of stack?
	public int getCapacity() {
		return MAX_STACK_SIZE;
	}

// 	Outputs the elements in the stack
	public void showElements() {
		System.out.println("*** Elements in the stack ***");
		for (String string : array) {
			System.out.println(string);
		}
	}
}
