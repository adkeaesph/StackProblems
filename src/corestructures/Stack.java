package corestructures;

import customexceptions.StackException;

public class Stack<T> {
	
	private SinglyNode<T> top;
	private int size;
	
	public Stack() {
		top = null;
		size = 0;
	}
	
	public T push(T data) {
		if(top == null)
			top = new SinglyNode<>(data);
		else {
			SinglyNode<T> newNode = new SinglyNode<T>(data);
			newNode.setNext(top);
			top = newNode;
		}
		size++;
		return data;
	}
	
	public T pop() throws StackException {
		if(top == null)
			throw new StackException("Stack is empty.");
		T dataToBeReturned = top.getData();
		top = top.getNext();
		size--;
		return dataToBeReturned;
	}
	
	public T peek() throws StackException {
		if(top == null)
			throw new StackException("Stack is empty.");
		return top.getData();
	}

	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		return top == null;
	}

	@Override
	public String toString() {
		String result = "";
		SinglyNode<T> currentNode = top;
		while (currentNode != null) {
			result += (currentNode.getData() + " ");
			currentNode = currentNode.getNext();
		}
		return result;
	}
	
	
}
