/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class FactoryLista {
    public ADTStack getLista (int x){
        if (x==1)
            return new StackListas(1);
        if (x==2)
        	return new StackListas(2);
        else 
        	return new StackListas(3);
    }
}
