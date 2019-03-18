/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin21;

import java.util.Objects;

/**
 *
 * @author jmartinezpineiro
 */
public class Libro implements Comparable {

    //Atributos
    private String titulo;
    private String autor;
    private String ISBN;
    private int prezo;
    private int numUnidades;
    //Constructores

    public Libro() {
    }

    public Libro(String titulo, String autor, String ISBN, int prezo, int numUnidades) {
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
        this.prezo = prezo;
        this.numUnidades = numUnidades;
    }
    //Setters & Getters

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public float getPrezo() {
        return prezo;
    }

    public void setPrezo(int prezo) {
        this.prezo = prezo;
    }

    public int getNumUnidades() {
        return numUnidades;
    }

    public void setNumUnidades(int numUnidades) {
        this.numUnidades = numUnidades;
    }
    //To String

    @Override
    public String toString() {
        return "titulo=" + titulo + "  autor=" + autor + "  ISBN=" + ISBN + "  prezo=" + prezo + "  numUnidades=" + numUnidades;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + Objects.hashCode(this.ISBN);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Libro other = (Libro) obj;
        if (!Objects.equals(this.ISBN, other.ISBN)) {
            return false;
        }
        return true;
    }

    @Override
    public int compareTo(Object o) {
        Libro a = (Libro) o;
        if (this.titulo.compareToIgnoreCase(a.getTitulo()) > 0) {
            return 1;
        } else if (this.titulo.compareToIgnoreCase(a.getTitulo()) < 0) {
            return -1;
        } else {
            return 0;
        }

    }
}
