
import java.util.Vector;


/**
 * @author Boggdan Barrientos, Jose Corona, Julio Dieguez
 *
 * @param <E>
 */
public class Stack<E> implements ADTStack<E>{
    
    protected Vector<E> pila;
    
    public Stack(){
        pila = new Vector<E>();
    }
    
    public void push(E item){
        pila.add(item);
    }
    
    public E pop(){

        return pila.remove(size()-1);
    	
    }
    
    public E peek(){
        return pila.get(size() - 1);
    }
    
    public boolean isEmpty(){
        return size() == 0;
    }
    
    public int size(){
        return pila.size();
    }
    /**
    *Borra todos los elementos de la pila
    *
    */
    public void empty(){
        pila.clear();
    }
}