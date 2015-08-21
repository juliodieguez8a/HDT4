

/**
 * @author Julio
 *
 * @param <E>
 */
public class StackListas<E> extends StackAbstracta<E> {

    protected ListaAbstracta<E> pila;
    protected int tipo;
    protected Factory f = new Factory();
    
    /**
     * @param type
     */
    public StackListas(int type){
    	tipo=type;
    	pila= f.getLista(tipo);
    	
    }
    
	/**
	 * @see ADTStack#empty()
	 */
	@Override
	public void empty() {
		// TODO Auto-generated method stub
    	pila= f.getLista(tipo);
	}

	/**
	 * @see ADTStack#push(java.lang.Object)
	 */
	@Override
	public void push(E x) {
		// TODO Auto-generated method stub
		pila.addLast(x);
	}

	/**
	 * @see ADTStack#pop()
	 */
	@Override
	public E pop() {
		// TODO Auto-generated method stub
		return pila.removeLast();
	}

	/**
	 * @see ADTStack#size()
	 */
	@Override
	public int size() {
		// TODO Auto-generated method stub
        return pila.size();
	}

	/**
	 * @see ADTStack#peek()
	 */
	@Override
	public E peek() {
		// TODO Auto-generated method stub
		return pila.getLast();
	}

}
