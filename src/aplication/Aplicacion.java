/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplication;

import Utilities.PedirDatos;
import boletin21.Libreria;
import boletin21.Libro;
import java.util.ArrayList;

/**
 *
 * @author jmartinezpineiro
 */
public class Aplicacion {

    public static void main(String[] args) {

        ArrayList<Libro> librillo = new ArrayList<>();
        Libreria l1 = new Libreria();
        String opcion;
        do {
            opcion = PedirDatos.StringVal("Menu\n" + "1.Engadir libro.\n" + "2.Vender libro.\n" + "3.Amosar libros.\n" + "4.Dar de baixa\n" + "5.Buscar libro.");
            switch (opcion) {
                case "1":
                    l1.engadirLibro(librillo);
                    break;
                case "2":
                    l1.venderLibro(PedirDatos.StringVal("ISBN"), librillo);
                    break;

                case "3":
                    l1.amosarLibros(librillo);
                    break;

                case "4":
                    l1.darBaixa(librillo);
                    break;
                case "5":
                    l1.consultarLibro(PedirDatos.StringVal("ISBN"), librillo);

                    break;

                case "8":

                    //0
                    System.exit(0);
                default:
                    System.out.println("Opción inexistente.");

            }

        } while (opcion != "8");

    }
}
