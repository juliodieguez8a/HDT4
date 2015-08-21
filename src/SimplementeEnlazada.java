
/**
 * @author Julio
 *
 * @param <E>
 */
/**
 * @author Julio
 *
 * @param <E>
 */
public class SimplementeEnlazada<E> extends ListaAbstracta<E> {
	
	protected Node<E> head; 

	/**
	 * Instantiates a new simplemente enlazada.
	 */
	
	public SimplementeEnlazada() {
		// TODO Auto-generated constructor stub
		head = null;
		count = 0;
	}


	/**
	 * @see InterfazLista#addFirst(java.lang.Object)
	 */
	@Override
	public void addFirst(E value) {
		// TODO Auto-generated method stub
		head = new Node<E>(value,head); 
		count++;
		
	}


	/**
	 * @see InterfazLista#removeFirst()
	 */
	@Override
	public E removeFirst() {
		// TODO Auto-generated method stub
		Node<E> temp = head;
		head = head.next();
		count--;
		return temp.value();
	}


	/**
	 * @see InterfazLista#removeLast()
	 */
	@Override
	public E removeLast() {
		// TODO Auto-generated method stub
		Node<E> finger = head;
		Node<E> previous = null;
		while(finger.next() != null){
			previous = finger;
			finger = finger.next();
			}
		if(previous == null){
			head = null;
		}
		else{
			previous.setNext(null);
		}
		count--;
		return finger.value();
	}


	/**
	 * @see InterfazLista#addLast(java.lang.Object)
	 */
	@Override
	public void addLast(E value) {
		// TODO Auto-generated method stub
		Node<E> temp = new Node<E>(value,null);
		if (head != null){
			Node<E> finger = head;
			while(finger.next() != null){
				finger = finger.next();
			}
			finger.setNext(temp);
		}
		else{
			head = temp;
		}
		count++;
	}


	/**
	 * @see InterfazLista#getFirst()
	 */
	@Override
	public E getFirst() {
		// TODO Auto-generated method stub
		return head.value();
	}


	/**
	 * @see InterfazLista#getLast()
	 */
	@Override
	public E getLast() {
		// TODO Auto-generated method stub
		Node <E> finger = head;
		while(finger.next() != null){
			finger = finger.next();
		}
		return finger.value();
	}


	/**
	 * @see InterfazLista#contains(java.lang.Object)
	 */
	@Override
	public boolean contains(E value) {
		// TODO Auto-generated method stub
		Node<E> finger = head;
		while(finger != null && !finger.value().equals(value)){
			finger.next();
		}
		return finger != null;
	}

}
