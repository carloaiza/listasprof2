/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.listacircularde.modelo;

import com.listase.modelo.Infante;
import com.listase.modelo.NodoDE;
import java.io.Serializable;

/**
 *
 * @author carloaiza
 */
public class ListaCircularDE implements Serializable{
    private NodoDE cabeza;
    
     public void adicionarNodo(Infante infante) {
        if (cabeza == null) {
            cabeza = new NodoDE(infante);
            ///Hago los enlaces circulares
            cabeza.setSiguiente(cabeza);
            cabeza.setAnterior(cabeza);
            
        } else {
            //Lamo a mi ayudante
           NodoDE temp= cabeza.getAnterior();
           //temp= temp.getAnterior();
           NodoDE nodoInsertar = new NodoDE(infante);
           temp.setSiguiente(nodoInsertar);
           nodoInsertar.setAnterior(temp);
           
           nodoInsertar.setSiguiente(cabeza);
           cabeza.setAnterior(nodoInsertar);
        }
    }
/*
    public void adicionarNodoAlInicio(Infante infante) {
        if (cabeza == null) {
            cabeza = new NodoDE(infante);
        } else {
            NodoDE temp = new NodoDE(infante);
            temp.setSiguiente(cabeza);
            cabeza.setAnterior(temp);
            cabeza = temp;
        }
    }
  */  
    
    
}
