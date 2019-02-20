package Project4;

public class DLLStack<E> implements Stack<E> {

	DoublyLinkedList list;
	
	public DLLStack () {
		this.list = new DoublyLinkedList<E>();
		
	}
	
	@Override
	public int size() {
		return this.list.size();
	}

	@Override
	public boolean isEmpty() {
		return this.list.isEmpty();
	}

	@Override
	public void push(Object e) {
		this.list.addFirst(e);
	}

	@Override
	public E top() {
		return (E) this.list.first();
	}

	@Override
	public E pop() {
		return (E) this.list.removeFirst();
	}
	
	public String toString() {
		return list.toString();
	}

}
