

public class StackListas<E> extends StackAbstracta<E> {

    protected ListaAbstracta<E> pila;
    protected int tipo;
    protected Factory f = new Factory();
    
    public StackListas(int type){
    	tipo=type;
    	pila= f.getLista(tipo);
    	
    }
    
	@Override
	public void empty() {
		// TODO Auto-generated method stub
    	pila= f.getLista(tipo);
	}

	@Override
	public void push(E x) {
		// TODO Auto-generated method stub
		pila.addLast(x);
	}

	@Override
	public E pop() {
		// TODO Auto-generated method stub
		return pila.removeLast();
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
        return pila.size();
	}

	@Override
	public E peek() {
		// TODO Auto-generated method stub
		return pila.getLast();
	}

}
