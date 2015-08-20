/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class FactoryPila {
    public ADTStack getStack (int x){
        if (x==1)
            return new StackVector();
        
        else
            return new StackArrayList();
    }
}
