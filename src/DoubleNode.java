
public class DoubleNode <E>{
	protected E data; 
	protected DoubleNode<E> nextElement; 
	protected DoubleNode<E> previousElement;
	public DoubleNode(E v, DoubleNode<E> next, DoubleNode<E> previous) { 
		data = v; 
		nextElement = next; 
		if (nextElement != null){ 
			nextElement.previousElement = this; 
			previousElement = previous;
		}
		if (previousElement != null) {
			previousElement.nextElement = this;
		}
	}
	public DoubleNode(E v){  
		// post: constructs a single element 
		this(v,null,null);
	}
	public DoubleNode<E> next() {
		// TODO Auto-generated method stub
		return nextElement;
	}
	public E value() {
		// TODO Auto-generated method stub
		return data;
	}
	public DoubleNode<E> previous() {
		// TODO Auto-generated method stub
		return previousElement;
	}
	
	public void setNext(DoubleNode<E> next) {
	// post: sets reference to new next value  
		nextElement = next; 
	}

}
