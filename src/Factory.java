/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Factory {
    /**
     * @param op1
     * @param op2
     * @return
     */
    public StackAbstracta getStack (int op1, int op2){
        if (op1==2)
            return new StackVector<Double>();
        
        if (op1==3)
            return new StackArrayList<Double>();
        
        if (op1==1)
        	return new StackListas<Double>(op2);
        
		return null;
        
    }
	
    /**
     * @param x
     * @return
     */
    public ListaAbstracta getLista (int x){
        if (x==1)
            return new Circular();
        if (x==2)
        	return new SimplementeEnlazada();
        else 
        	return new DoblementeEnlazada();
    }
}
