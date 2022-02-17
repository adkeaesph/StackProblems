package problems;

import corestructures.Stack;
import customexceptions.StackException;

public class BalancedParentheses {

	public static boolean areParenthesesBalanced(String string) {
		int length = string.length();
		Stack<Character> stack = new Stack<>();
		try {
			for (int i = 0; i < length; i++) {
				char currentCharacter = string.charAt(i);
				if (currentCharacter == ')') {
					if (stack.peek() == '(')
						stack.pop();
					else
						return false;
				} else if (currentCharacter == '}') {
					if (stack.peek() == '{')
						stack.pop();
					else
						return false;
				} else if (currentCharacter == ']') {
					if (stack.peek() == '[')
						stack.pop();
					else
						return false;
				} else if (currentCharacter == '(' || currentCharacter == '{' || currentCharacter == '[')
					stack.push(currentCharacter);
			}
			return stack.isEmpty();
		} catch (StackException e) {
			return false;
		}
	}
	
	

	public static void main(String[] args) {
		System.out.println(areParenthesesBalanced("[{{}}]()"));
		System.out.println(areParenthesesBalanced("[{{}}]("));
		System.out.println(areParenthesesBalanced("{{}}]()"));
	}

}
