/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin22;

import java.util.Objects;

/**
 *
 * @author Ara
 */
public class Libro {
    String titulo,autor;
    float precio;
     int unidades;

    public Libro() {
    }

    public Libro(String titulo, String autor, float precio, int unidades) {
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
        this.unidades = unidades;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo= titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", autor=" + autor + ", precio=" + precio + ", unidades=" + unidades + '}';
    }

//    @Override
//    public int hashCode() {
//        int hash = 7;
//        hash = 83 * hash + Objects.hashCode(this.titulo);
//        hash = 83 * hash + Objects.hashCode(this.autor);
//        hash = 83 * hash + Float.floatToIntBits(this.precio);
//        hash = 83 * hash + this.unidades;
//        return hash;
//    }
//
//    @Override
//    public boolean equals(Object obj) {
//        if (obj == null) {
//            return false;
//        }
//        if (getClass() != obj.getClass()) {
//            return false;
//        }
//        final Libro other = (Libro) obj;
//        if (!Objects.equals(this.titulo, other.titulo)) {
//            return false;
//        }
//        if (!Objects.equals(this.autor, other.autor)) {
//            return false;
//        }
//        if (Float.floatToIntBits(this.precio) != Float.floatToIntBits(other.precio)) {
//            return false;
//        }
//        if (this.unidades != other.unidades) {
//            return false;
//        }
//        return true;
//    }
//
//    public int compareToIgnoreCase(String str) {
//        return titulo.compareToIgnoreCase(str);
//    }
//
//    public int compareTo(String anotherString) {
//        return titulo.compareTo(anotherString);
//    }
//
//    

   
}

