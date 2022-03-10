package problems;

import corestructures.Stack;
import customexceptions.StackException;

public class RemoveAdjacentDuplicates {

	private static int[] removeAdjacentDuplicates(int[] arr) throws StackException {
		int length = arr.length;
		if (length < 2)
			return arr;
		Stack<Integer> stack = new Stack<>();
		stack.push(arr[0]);

		int duplicateNumber;
		int i = 1;
		while (i < length) {
			if (stack.peek() == arr[i]) {
				duplicateNumber = stack.pop();
				int j = i;
				while (j < length && arr[j] == duplicateNumber)
					j++;

				i = j;
			} else {
				stack.push(arr[i]);
				i++;
			}
		}

		int newLength = stack.size();
		int[] newArray = new int[newLength];
		int k = newLength - 1;
		while (!stack.isEmpty()) {
			newArray[k--] = stack.pop();
		}
		return newArray;
	}

	public static void main(String[] args) throws StackException {
		int[] arr = { 1, 5, 6, 8, 8, 8, 0, 1, 1, 0, 6, 5 };
		arr = removeAdjacentDuplicates(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		int[] arr2 = { 1, 9, 6, 8, 8, 8, 0, 1, 1, 0, 6, 5 };
		arr2 = removeAdjacentDuplicates(arr2);
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
		
		System.out.print("world \rHello ");
		
	}

}
