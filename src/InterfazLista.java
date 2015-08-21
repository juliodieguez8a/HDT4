
/**
 * @author Julio
 *
 * @param <E>
 */
public interface InterfazLista<E> {

	/**
	 * @return
	 */
	int size();

	/**
	 * @param value
	 */
	void addFirst(E value);

	/**
	 * @return
	 */
	E removeFirst();

	/**
	 * @return
	 */
	E removeLast();

	/**
	 * @param value
	 */
	void addLast(E value);

	/**
	 * @return
	 */
	E getFirst();

	/**
	 * @return
	 */
	E getLast();

	/**
	 * @param value
	 * @return
	 */
	boolean contains(E value);

}
