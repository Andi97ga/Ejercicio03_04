/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author User
 */
public class Revista {
    private int codigoRevista;
    private String nombre;
    private String categoria;
    private int edicion; 
    private int revistasVendidas;

    public Revista(int codigoRevista, String nombre, String categoria, int edicion, int revistasVendidas) {
        this.codigoRevista = codigoRevista;
        this.nombre = nombre;
        this.categoria = categoria;
        this.edicion = edicion;
        this.revistasVendidas = revistasVendidas;
    }

    public Revista(int codigoRevista, String nombre, String categoria, int revistasVendidas) {
        this.codigoRevista = codigoRevista;
        this.nombre = nombre;
        this.categoria = categoria;
        this.revistasVendidas = revistasVendidas;
    }

    public int getCodigoRevista() {
        return codigoRevista;
    }

    public void setCodigoRevista(int codigoRevista) {
        this.codigoRevista = codigoRevista;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getEdicion() {
        return edicion;
    }

    public void setEdicion(int edicion) {
        this.edicion = edicion;
    }

    public int getRevistasVendidas() {
        return revistasVendidas;
    }

    public void setRevistasVendidas(int revistasVendidas) {
        this.revistasVendidas = revistasVendidas;
    }

    @Override
    public String toString() {
        return "Revista{" + "codigoRevista=" + codigoRevista + ", nombre=" + 
                nombre + ", categoria=" + categoria + ", revistasVendidas=" + 
                revistasVendidas + '}';
    }

}
