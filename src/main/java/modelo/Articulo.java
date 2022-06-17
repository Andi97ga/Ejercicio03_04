/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author User
 */
public class Articulo {
    private int codigoArticulo; 
    private String titulo;
    private int limitePalabras;
    private int yearPublicacion;
    private Revista revista;
    private AutorPrincipal autor;

    public Articulo(String titulo, int codigoArticulo, int limitePalabras, int yearPublicacion, Revista revista, AutorPrincipal autor) {
        this.titulo = titulo;
        this.codigoArticulo = codigoArticulo;
        this.limitePalabras = limitePalabras;
        this.yearPublicacion = yearPublicacion;
        this.revista = revista;
        this.autor = autor;
    }

    public Articulo(int codigoArticulo, String titulo, int yearPublicacion, Revista revista) {
        this.codigoArticulo = codigoArticulo;
        this.titulo = titulo;
        this.yearPublicacion = yearPublicacion;
        this.revista = revista;
    }
   
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getCodigoArticulo() {
        return codigoArticulo;
    }

    public void setCodigoArticulo(int codigoArticulo) {
        this.codigoArticulo = codigoArticulo;
    }

    public int getLimitePalabras() {
        return limitePalabras;
    }

    public void setLimitePalabras(int limitePalabras) {
        this.limitePalabras = limitePalabras;
    }

    public int getYearPublicacion() {
        return yearPublicacion;
    }

    public void setYearPublicacion(int yearPublicacion) {
        this.yearPublicacion = yearPublicacion;
    }

    public Revista getRevista() {
        return revista;
    }

    public void setRevista(Revista revista) {
        this.revista = revista;
    }

    public AutorPrincipal getAutor() {
        return autor;
    }

    public void setAutor(AutorPrincipal autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Articulo{" + "codigoArticulo=" + codigoArticulo + ", titulo=" + 
                titulo + ", yearPublicacion=" + yearPublicacion  
                +  revista.toString() + '}';
    }

    
    
}
