/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author LEFT4
 */
public class ListaGenerica {

    private Nodo head;
    private Nodo tail;
    private int constante;
    private int exponente;

    public ListaGenerica() {
        this.head = null;
    }
    
     public int cantidad ()
    {
        int cant = 0;
        Nodo reco = head;
        while (reco != null) {
            reco = reco.sigLink;
            cant++;
        }
        return cant;
    }
     
      void insertar (int pos, int x)
    {
        if (pos <= cantidad () + 1)    {
            Nodo newNodo = new Nodo();
            newNodo.valor = x;
            if (pos == 1){
                newNodo.sigLink = head;
                if (head!=null)
                    head.antLink = newNodo;
                head = newNodo;
            } else
                if (pos == cantidad () + 1)    {
                    Nodo reco = head;
                    while (reco.sigLink != null) {
                        reco = reco.sigLink;
                    }
                    reco.sigLink = newNodo;
                    newNodo.antLink=reco;
                    newNodo.sigLink = null;
                } else {
                    Nodo reco = head;
                    for (int f = 1 ; f <= pos - 2 ; f++)
                        reco = reco.sigLink;
                    Nodo siguiente = reco.sigLink;
                    reco.sigLink = newNodo;
                    newNodo.antLink = reco;
                    newNodo.sigLink = siguiente;
                    siguiente.antLink = newNodo;
                }
        }
    }


    
    
}
