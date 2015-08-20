import java.util.Vector;

public class StackListas<E> implements ADTStack<E> {

    protected ListaAbstracta<E> pila;
    
    public StackListas(){
        pila = new SimplementeEnlazada<E>();
    }
    
	@Override
	public void empty() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void push(E x) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public E pop() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public E peek() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
