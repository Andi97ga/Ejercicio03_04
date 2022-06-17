/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import java.util.ArrayList;
import java.util.List;
import modelo.Articulo;

/**
 *
 * @author User
 */
public class ArticuloServicio implements IArticuloServicio{

    private final List<Articulo> articuloList = new ArrayList<>();
    @Override
    public Articulo crear(Articulo articulo) {
        this.articuloList.add(articulo);
        return articulo; 
    }
    
     @Override
    public Articulo modificar(int codigoArticulo, Articulo articuloNuevo) {
       var posicion=this.buscarPosicion(this.buscarPorCodigo(codigoArticulo));
        this.listar().get(posicion).setTitulo(articuloNuevo.getTitulo());
        this.listar().get(posicion).setYearPublicacion(articuloNuevo.getYearPublicacion());
        this.listar().get(posicion).setRevista(articuloNuevo.getRevista());
        return articuloNuevo;
    }

    @Override
    public Articulo eliminar(int codigoArticulo) {
        Articulo articulo=this.buscarPorCodigo(codigoArticulo);
        var posicion=this.buscarPosicion(articulo);
        this.listar().remove(posicion);
        return articulo;
    }

    @Override
    public Articulo buscarPorCodigo(int codigoArticulo) {
         Articulo articulo=null;
        for(var a:this.articuloList){
            if(codigoArticulo==a.getCodigoArticulo()){
                articulo=a;
                break;
            }
        }
        return articulo;
    }

    @Override
    public int buscarPosicion(Articulo articulo) {
        int posicion=-1;
        for(var a:this.articuloList){
            posicion++;
            if(a.getCodigoArticulo()==articulo.getCodigoArticulo()){
                break;
            }
        }
        return posicion;
    }

    @Override
    public List<Articulo> listar() {
         return this.articuloList; 
    }
}
