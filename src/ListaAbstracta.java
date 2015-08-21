


/**
 * @author Julio
 *	Lista Abstracta
 * @param <E>
 * implementa
 */
public abstract class ListaAbstracta<E> implements InterfazLista<E> {

	protected int count;
	
	/**
	 * @see InterfazLista#size()
	 */
	public int size(){
		return count;	
	}
	
}
