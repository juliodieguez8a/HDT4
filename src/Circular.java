
public class Circular<E> extends ListaAbstracta<E>  {
	
	protected Node<E> tail;

	/**
	 * Instantiates a new circular.
	 */
	public Circular() {
		// TODO Auto-generated constructor stub
		tail = null;
		count = 0;
	}

	/* (non-Javadoc)
	 * @see ADTLista#addFirst(java.lang.Object)
	 */
	@Override
	public void addFirst(E value) {
		// TODO Auto-generated method stub
		Node<E> temp = new Node<E>(value);
		if(tail == null){
			tail = temp;
			tail.setNext(tail);
		}
		else{
			temp.setNext(tail.next());
			tail.setNext(temp);
		}
		count++;
	}

	/* (non-Javadoc)
	 * @see ADTLista#removeFirst()
	 */
	@Override
	public E removeFirst() {
		// TODO Auto-generated method stub
		Node<E> temp = null;
		if( tail == tail.next()){
			temp = tail.next();
			tail = null;
		}
		else if (tail != tail.next()){
			temp = tail.next();
			tail.setNext(tail.next().next());
		}
		count--;
		return temp.value();
	}

	/* (non-Javadoc)
	 * @see ADTLista#removeLast()
	 */
	@Override
	public E removeLast() {
		// TODO Auto-generated method stub
		Node<E> finger = tail;
		while(finger.next() != tail){
			finger = finger.next();
		}
		Node<E> temp = tail;
		if (finger == tail){
			tail = null;
		}
		else{
			finger.setNext(tail.next());
			tail = finger;
		}
		count--;
		return temp.value();
	}

	/* (non-Javadoc)
	 * @see ADTLista#addLast(java.lang.Object)
	 */
	@Override
	public void addLast(E value) {
		// TODO Auto-generated method stub
		addFirst(value);
		tail = tail.next();
	}

	/* (non-Javadoc)
	 * @see ADTLista#getFirst()
	 */
	@Override
	public E getFirst() {
		// TODO Auto-generated method stub
		return tail.next().value();
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
		Node<E> finger = tail;
		while(finger != null && !finger.value().equals(value)){
			finger.next();
		}
		return finger != null;
	}

	

}
