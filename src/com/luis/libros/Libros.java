
package com.luis.libros;


public class Libros {
    private String nomeLibro;
    private String autor;
    private float precio;
    private int unidades;

    public Libros() {
    }

    public Libros(String nomeLibro, String autor, float precio, int unidades) {
        this.nomeLibro = nomeLibro;
        this.autor = autor;
        this.precio = precio;
        this.unidades = unidades;
    }

    public String getNomeLibro() {
        return nomeLibro;
    }

    public void setNomeLibro(String nomeLibro) {
        this.nomeLibro = nomeLibro;
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
            return  nomeLibro+"," + autor +","+ precio +","+ unidades;
    }
    
}
