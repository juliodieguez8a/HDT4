/**
 * 
 */

/**
 * @author Boggdan Barrientos, 
 *
 */
public interface ADTStack<E> {
	/**
	 * 
	 */
	public void empty();
	
	/**
	 * @return
	 */
	public boolean isEmpty();
	/**
	 * @param x
	 */
	public void push(E x) ;
	/**
	 * @return
	 */
	public E pop();
	/**
	 * @return
	 */
	public int size();
	/**
	 * @return
	 */
	public E peek();
	
}
