/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author User
 */
public class AutorPrincipal {
    private int codigoAutor;
    private String nombre;
    private int yearNacimiento ;
    private String ciudadania;
    Articulo articulo;//borrar

    public AutorPrincipal(int codigoAutor, String nombre, int yearNacimiento, String ciudadania, Articulo articulo) {
        this.codigoAutor = codigoAutor;
        this.nombre = nombre;
        this.yearNacimiento = yearNacimiento;
        this.ciudadania = ciudadania;
        this.articulo = articulo;
    }

    public AutorPrincipal(int codigoAutor, String nombre, int yearNacimiento, String ciudadania) {
        this.codigoAutor = codigoAutor;
        this.nombre = nombre;
        this.yearNacimiento = yearNacimiento;
        this.ciudadania = ciudadania;
    }

  
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getYearNacimiento() {
        return yearNacimiento;
    }

    public void setYearNacimiento(int yearNacimiento) {
        this.yearNacimiento = yearNacimiento;
    }

    public int getCodigoAutor() {
        return codigoAutor;
    }

    public void setCodigoAutor(int codigoAutor) {
        this.codigoAutor = codigoAutor;
    }
    
    public String getCiudadania() {
        return ciudadania;
    }

    public void setCiudadania(String ciudadania) {
        this.ciudadania = ciudadania;
    }

    public Articulo getArticulo() {
        return articulo;
    }

    public void setArticulo(Articulo articulo) {
        this.articulo = articulo;
    }

    @Override
    public String toString() {
        return "AutorPrincipal{" + "codigoAutor=" + codigoAutor + ", nombre=" + 
                nombre + ", yearNacimiento=" + yearNacimiento +
                ", ciudadania=" + ciudadania + articulo.toString()+'}';
    }

   
    
}
