/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin21;

import Utilities.PedirDatos;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/**
 *
 * @author jmartinezpineiro
 */
public class Libreria {

    //Método para añadir libros.
    public void engadirLibro(ArrayList<Libro> libro) {
        libro.add(new Libro(PedirDatos.StringVal("Titulo"), PedirDatos.StringVal("Autor"), PedirDatos.StringVal("ISBN"), PedirDatos.intVal("Prezo"), PedirDatos.intVal("Unidades")));
    }

    //Métodos para vender (borrar) libros
    public void venderLibro(String ISBN, ArrayList<Libro> libro) {
        for (Libro a1 : libro) {
            if (ISBN.equals(a1.getISBN())) {
                a1.setNumUnidades(a1.getNumUnidades() - 1);

            }
        }
    }

    public void amosarLibros(ArrayList<Libro> libro) {
        Collections.sort(libro);
        Iterator it = libro.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    public void darBaixa(ArrayList<Libro> libro) {
        Libro a = new Libro();
        Iterator it = libro.iterator();
        while (it.hasNext()) {
            a = (Libro) it.next();
            if (a.getNumUnidades() == 0) {
                it.remove();

            }
        }
    }

    public void consultarLibro(String ISBN, ArrayList<Libro> libro) {
        System.out.println("\n");
        for (Libro a1 : libro) {
            if (ISBN.equals(a1.getISBN())) {
                System.out.println(a1.toString());
            }
        }
    }
}
