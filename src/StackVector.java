
import java.util.Vector;


/**
 * @author Boggdan Barrientos, Jose Corona, Julio Dieguez
 *
 * @param <E>
 */
public class StackVector<E> extends StackAbstracta<E>{
    
    protected Vector<E> pila;
    
    /**
     * Constructor
     */
    public StackVector(){
        pila = new Vector<E>();
    }
    
	/**
     * @see ADTStack#push(java.lang.Object)
     */
    public void push(E item){
        pila.add(item);
    }
    
	/**
     * @see ADTStack#pop()
     */
    public E pop(){
        return pila.remove(size()-1);
    }
    
	/**
     * @see ADTStack#peek()
     */
    public E peek(){
        return pila.get(size() - 1);
    }
    
	/**
     * @see ADTStack#size()
     */
    public int size(){
        return pila.size();
    }

	/**
     * @see ADTStack#empty()
     */
    public void empty(){
        pila.clear();
    }
}
