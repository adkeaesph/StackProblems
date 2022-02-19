package problems;

import java.util.HashMap;
import java.util.Map;

import corestructures.Stack;
import customexceptions.StackException;

public class InfixPrefixAndPostfixNotations {

	/*
	 * assuming all operands are denoted by capital characters A to Z
	 */
	public static String infixToPostfix(String infixExpression) throws StackException {
		Stack<Character> stackOfOperators = new Stack<>();
		int lengthOfExpression = infixExpression.length();
		String resultantPostfixExpression = "";
		Map<Character,Integer> mapOfPrecedenceForOperators = getPrecedenceMap();
		for(int i=0; i<lengthOfExpression; i++) {
			char currentCharacter = infixExpression.charAt(i);
			if(currentCharacter >= 'A' && currentCharacter <= 'Z') 
				resultantPostfixExpression += currentCharacter;
			else if(currentCharacter == ')') {
				while(true) {
					if(stackOfOperators.peek() != '(')
						resultantPostfixExpression += stackOfOperators.pop();
					else {
						stackOfOperators.pop();
						break;
					}
				}
			} else {
				//the current character is an operator
				while(!stackOfOperators.isEmpty() && stackOfOperators.peek() != '(' 
						&& mapOfPrecedenceForOperators.get(stackOfOperators.peek()) >= mapOfPrecedenceForOperators.get(currentCharacter))
						resultantPostfixExpression += stackOfOperators.pop();
				stackOfOperators.push(currentCharacter);
			}
		}
		
		while(!stackOfOperators.isEmpty())
			resultantPostfixExpression += stackOfOperators.pop();
		
		return resultantPostfixExpression;
	}

	private static Map<Character, Integer> getPrecedenceMap() {
		Map<Character, Integer> mapOfPrecedence = new HashMap<>();
		mapOfPrecedence.put('+', 1);
		mapOfPrecedence.put('-', 1);
		mapOfPrecedence.put('/', 2);
		mapOfPrecedence.put('%', 2);
		mapOfPrecedence.put('*', 2);
		mapOfPrecedence.put('(', 3);
		return mapOfPrecedence;
	}

	public static void main(String[] args) throws StackException {
		System.out.println(infixToPostfix("A*B-(C+D)+E"));

	}

}
