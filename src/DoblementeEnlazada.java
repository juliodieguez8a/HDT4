//import javax.xml.soap.Node;

public class DoblementeEnlazada<E> extends ListaAbstracta<E> {
	

	protected DoubleNode<E> head;
	protected DoubleNode<E> tail;

	/**
	 * Instantiates a new doblemente enlazada.
	 */
	public DoblementeEnlazada() {
		// TODO Auto-generated constructor stub
		head = null;
		tail = null;
		count = 0;
	}


	/* (non-Javadoc)
	 * @see ADTLista#addFirst(java.lang.Object)
	 */
	@Override
	public void addFirst(E value) {
		// TODO Auto-generated method stub
		head = new DoubleNode<E>(value,head,null);	
		
		if (tail == null){
			tail = head;
		}
		count ++;
	}

	/* (non-Javadoc)
	 * @see ADTLista#removeFirst()
	 */
	@Override
	public E removeFirst() {
		// TODO Auto-generated method stub
		DoubleNode<E> temp = head;
		head = head.next();
		count--;
		return temp.value();
	}

	/* (non-Javadoc)
	 * @see ADTLista#removeLast()
	 */
	@Override
	public E removeLast() {
		// TODO Auto-generated method stub
		DoubleNode<E> temp = tail;
		tail = tail.previous();
		if(tail == null){
			head = null;
		}
		else{
			tail.setNext(null);
		}
		count--;
		return temp.value();
	}

	@Override
	public void addLast(E value) {
		// TODO Auto-generated method stub
		
		tail = new DoubleNode<E>(value,null,tail);
		
		if(head == null){
			head = tail;
		}
		count++;
		
	}

	/* (non-Javadoc)
	 * @see ADTLista#getFirst()
	 */
	@Override
	public E getFirst() {
		// TODO Auto-generated method stub
		return head.value();
	}

	/* (non-Javadoc)
	 * @see ADTLista#getLast()
	 */
	@Override
	public E getLast() {
		// TODO Auto-generated method stub
		return tail.value();
	}

	/* (non-Javadoc)
	 * @see ADTLista#contains(java.lang.Object)
	 */
	@Override
	public boolean contains(E value) {
		// TODO Auto-generated method stub
		DoubleNode<E> finger = head;
		while(finger != null && !finger.value().equals(value)){
			finger.next();
		}
		return finger != null;
	}

}
