package Project4;

import java.util.Arrays;

public class ArrayStack<E> implements Stack<E> {
	public static final int CAPACITY = 10; // default array capacity
	private E[] data; // generic array used for storage
	private int t = -1; // index of the top element in stack

	public ArrayStack() {
		this(CAPACITY);
	} // constructs stack with default capacity

	public ArrayStack(int capacity) { // constructs stack with given capacity
		data = (E[]) new Object[capacity]; // safe cast; compiler may give warning
	}

	@Override
	public int size() {
		return (t + 1);
	}

	@Override
	public boolean isEmpty() {
		return (t == -1);
	}

	@Override
	public void push(E e) throws IllegalStateException {
		if (size() == data.length)
			throw new IllegalStateException("Stack is full");
		data[++t] = e; // increment t before storing new item
	}

	@Override
	public E top() {
		if (isEmpty())
			return null;
		return data[t];
	}

	@Override
	public E pop() {
		if (isEmpty())
			return null;
		E answer = data[t];
		data[t] = null; // dereference to help garbage collection
		t--;
		return answer;
	}

	@Override
	public String toString() {
		return Arrays.toString(data);
	}

}
