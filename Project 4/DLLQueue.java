package Project4;

public class DLLQueue<E> implements Queue<E> {

	DoublyLinkedList list;
	
	public DLLQueue () {
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
	public void enqueue(Object e) {
		this.list.addFirst(e);
	}

	@Override
	public E first() {
		return (E) this.list.first();
	}

	@Override
	public E dequeue() {
		return (E) this.list.removeLast();
	}
	
	public String toString() {
		return list.toString();
	}
	

}
