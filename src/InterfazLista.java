
public interface InterfazLista<E> {

	int size();

	void addFirst(E value);

	E removeFirst();

	E removeLast();

	void addLast(E value);

	E getFirst();

	E getLast();

	boolean contains(E value);

}
