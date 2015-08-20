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
    public listaEnlazada getLista (int x){
        if (x==1)
            return new Circular();
        if (x==2)
            return new SimplementeEnlazada();
        else 
            return new DoblementeEnlazada();
    }
}
