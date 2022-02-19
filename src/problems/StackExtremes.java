package problems;

import corestructures.Stack;
import customexceptions.StackException;

public class StackExtremes {

	public static void main(String[] args) throws StackException {
		IntegerStack stack = new IntegerStack();
		stack.push(2);
		System.out.println(stack.getMinimum());
		System.out.println(stack.getMaximum());
		System.out.println();

		stack.push(1);
		System.out.println(stack.getMinimum());
		System.out.println(stack.getMaximum());
		System.out.println();

		stack.push(4);
		System.out.println(stack.getMinimum());
		System.out.println(stack.getMaximum());
		System.out.println();

		stack.push(1);
		System.out.println(stack.getMinimum());
		System.out.println(stack.getMaximum());
		System.out.println();

		stack.push(6);
		System.out.println(stack.getMinimum());
		System.out.println(stack.getMaximum());
		System.out.println();

		stack.push(-20);
		System.out.println(stack.getMinimum());
		System.out.println(stack.getMaximum());
		System.out.println();

		stack.pop();
		System.out.println(stack.getMinimum());
		System.out.println(stack.getMaximum());
		System.out.println();

		stack.pop();
		System.out.println(stack.getMinimum());
		System.out.println(stack.getMaximum());
		System.out.println();

		stack.pop();
		System.out.println(stack.getMinimum());
		System.out.println(stack.getMaximum());
		System.out.println();

		stack.pop();
		System.out.println(stack.getMinimum());
		System.out.println(stack.getMaximum());
		System.out.println();

		stack.pop();
		System.out.println(stack.getMinimum());
		System.out.println(stack.getMaximum());
		System.out.println();

		stack.pop();
		System.out.println(stack.getMinimum());
		System.out.println(stack.getMaximum());
		System.out.println();
	}

}

class IntegerStack extends Stack<Integer> {
	Stack<Integer> stack;
	Stack<Integer> auxMinStack;
	Stack<Integer> auxMaxStack;

	public IntegerStack() {
		stack = new Stack<>();
		auxMinStack = new Stack<>();
		auxMaxStack = new Stack<>();
	}

	public Integer push(Integer data) {
		try {
			if (stack.isEmpty() || data <= auxMinStack.peek())
				auxMinStack.push(data);
			if (stack.isEmpty() || data >= auxMaxStack.peek())
				auxMaxStack.push(data);
		} catch (StackException exception) {
			// control will never come to this part
		}
		return stack.push(data);
	}

	public Integer pop() throws StackException {
		if (auxMinStack.peek() == stack.peek())
			auxMinStack.pop();
		if (auxMaxStack.peek() == stack.peek())
			auxMaxStack.pop();

		return stack.pop();

	}

	public Integer getMinimum() throws StackException {
		return auxMinStack.peek();
	}

	public Integer getMaximum() throws StackException {
		return auxMaxStack.peek();
	}

	public int size() {
		return stack.size();
	}

	public boolean isEmpty() {
		return stack.isEmpty();
	}
}
