/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.List;
import modelo.Articulo;
import modelo.Revista;
import servicio.ArticuloServicio;
import servicio.RevistaServicio;

/**
 *
 * @author User
 */
public class ArticuloControl {
    
    private final ArticuloServicio articuloServicio = new ArticuloServicio();
    private final RevistaServicio revistaServicio = new RevistaServicio();
    
    public Articulo crear(String [] args){
        Revista revista = this.revistaServicio.buscarPorCodigo(Integer.valueOf(args[3]));
        var articulo = new Articulo(Integer.valueOf(args[0]),args[1],
                Integer.valueOf(args[2]),revista);
        this.articuloServicio.crear(articulo);
        return articulo;
    }
    
    public Articulo buscarArticulo(String arg){
        return this.articuloServicio.buscarPorCodigo(Integer.valueOf(arg));
    }
    
    public Articulo eliminar(String arg)
    {
        return this.articuloServicio.eliminar(Integer.valueOf(arg));
    }
    
    public Articulo modificar(String [] args){
        Revista revista = this.revistaServicio.buscarPorCodigo(Integer.valueOf(args[3]));
        Articulo articuloNuevo = new Articulo(Integer.valueOf(args[0]),args[1],
                Integer.valueOf(args[2]),revista);
        this.articuloServicio.modificar(Integer.valueOf(args[0]), articuloNuevo);
        return articuloNuevo;
    }
    
    public List<Articulo> listar(){
        return this.articuloServicio.listar();
    }
}
