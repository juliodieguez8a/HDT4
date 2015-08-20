

public class StackListas<E> extends StackAbstracta<E> {

    protected ListaAbstracta<E> pila;
    protected int tipo;
    
    public StackListas(int type){
    	tipo=type;
    	if (tipo==1){pila = new Circular<E>();}
    	if (tipo==2){pila = new SimplementeEnlazada<E>();}
    	if (tipo==3){pila = new DoblementeEnlazada<E>();}
    	
    }
    
	@Override
	public void empty() {
		// TODO Auto-generated method stub
    	if (tipo==1){pila = new Circular<E>();}
    	if (tipo==2){pila = new SimplementeEnlazada<E>();}
    	if (tipo==3){pila = new DoblementeEnlazada<E>();}
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
	public E peek() throws Exception {
		// TODO Auto-generated method stub
		return pila.getLast();
	}

}
