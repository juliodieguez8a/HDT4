/**
 * 
 */

/**
 * @author Boggdan Barrientos, 
 *
 */
public interface ADTStack<E> {
	public void empty();
	public boolean isEmpty();
	public void push(E x) ;
	public E pop();
	public int size();
	public E peek();
	
}
