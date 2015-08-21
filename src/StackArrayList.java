
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
import java.util.ArrayList;

public class StackArrayList<E> extends StackAbstracta<E> 
{
	protected ArrayList<E> data;

	/**
	 * Constructor
	 */
	public StackArrayList()
	// post: constructs a new, empty stack
	{
		data = new ArrayList<E>();
	}

	/**
	 * @see ADTStack#push(java.lang.Object)
	 */
	public void push(E item)
	// post: the value is added to the stack
	//          will be popped next if no intervening push
	{
		data.add(item);
	}

	/**
	 * @see ADTStack#pop()
	 */
	public E pop()
	// pre: stack is not empty
	// post: most recently pushed item is removed and returned
	{
		return data.remove(size()-1);
	}

	/**
	 * @see ADTStack#peek()
	 */
	public E peek()
	// pre: stack is not empty
	// post: top value (next to be popped) is returned
	{
		return data.get(size() - 1);
	}
	
        
        public int size()
	// post: returns the number of elements in the stack
	{
		return data.size();
	}
  
    /**
	 * @see ADTStack#empty()
	 */
	public void empty(){
            data.clear();
    }
        
        
}

