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
    public StackAbstracta getStack (int op1, int op2){
        if (op1==1)
            return new StackVector();
        
        if (op1==2)
            return new StackArrayList();
        
        if (op1==3)
        	return new StackListas(op2);
        
		return null;
        
    }
	
    public ListaAbstracta getLista (int x){
        if (x==1)
            return new Circular();
        if (x==2)
        	return new SimplementeEnlazada();
        else 
        	return new DoblementeEnlazada();
    }
}
