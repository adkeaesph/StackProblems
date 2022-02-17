import corestructures.Stack;
import customexceptions.StackException;

public class DemoDriver {

	public static void main(String[] args) throws StackException {
		Stack<Integer> stack = new Stack<>();
		System.out.println(stack);
		System.out.println("Size of stack = " + stack.size());
		System.out.println("Is stack empty : " + stack.isEmpty());
		System.out.println();
		
		stack.push(23);
		System.out.println(stack);
		System.out.println("Size of stack = " + stack.size());
		System.out.println("Is stack empty : " + stack.isEmpty());
		System.out.println("Stack top data = " + stack.peek());
		System.out.println();

		stack.push(34);
		System.out.println(stack);
		System.out.println("Size of stack = " + stack.size());
		System.out.println("Is stack empty : " + stack.isEmpty());
		System.out.println("Stack top data = " + stack.peek());
		System.out.println();
		
		stack.push(45);
		System.out.println(stack);
		System.out.println("Size of stack = " + stack.size());
		System.out.println("Is stack empty : " + stack.isEmpty());
		System.out.println("Stack top data = " + stack.peek());
		System.out.println();
		
		stack.push(56);
		System.out.println(stack);
		System.out.println("Size of stack = " + stack.size());
		System.out.println("Is stack empty : " + stack.isEmpty());
		System.out.println("Stack top data = " + stack.peek());
		System.out.println();
		
		stack.push(67);
		System.out.println(stack);
		System.out.println("Size of stack = " + stack.size());
		System.out.println("Is stack empty : " + stack.isEmpty());
		System.out.println("Stack top data = " + stack.peek());
		System.out.println();
		
		System.out.println("Data popped = " + stack.pop());
		System.out.println(stack);
		System.out.println("Size of stack = " + stack.size());
		System.out.println("Is stack empty : " + stack.isEmpty());
		System.out.println("Stack top data = " + stack.peek());
		System.out.println();
		
		System.out.println("Data popped = " + stack.pop());
		System.out.println(stack);
		System.out.println("Size of stack = " + stack.size());
		System.out.println("Is stack empty : " + stack.isEmpty());
		System.out.println("Stack top data = " + stack.peek());
		System.out.println();
		
		System.out.println("Data popped = " + stack.pop());
		System.out.println(stack);
		System.out.println("Size of stack = " + stack.size());
		System.out.println("Is stack empty : " + stack.isEmpty());
		System.out.println("Stack top data = " + stack.peek());
		System.out.println();
		
		System.out.println("Data popped = " + stack.pop());
		System.out.println(stack);
		System.out.println("Size of stack = " + stack.size());
		System.out.println("Is stack empty : " + stack.isEmpty());
		System.out.println("Stack top data = " + stack.peek());
		System.out.println();
		
		System.out.println("Data popped = " + stack.pop());
		System.out.println(stack);
		System.out.println("Size of stack = " + stack.size());
		System.out.println("Is stack empty : " + stack.isEmpty());
		System.out.println("Stack top data = " + stack.peek());
		System.out.println();
		
		System.out.println("Data popped = " + stack.pop());
		System.out.println(stack);
		System.out.println("Size of stack = " + stack.size());
		System.out.println("Is stack empty : " + stack.isEmpty());
		System.out.println("Stack top data = " + stack.peek());
		System.out.println();
		
		System.out.println("Data popped = " + stack.pop());
		System.out.println(stack);
		System.out.println("Size of stack = " + stack.size());
		System.out.println("Is stack empty : " + stack.isEmpty());
		System.out.println();
		
//		System.out.println("Data popped = " + stack.pop());
		System.out.println("Stack top data = " + stack.peek());
		System.out.println(stack);
		
	}

}
