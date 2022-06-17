/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import java.util.ArrayList;
import java.util.List;
import modelo.AutorPrincipal;

/**
 *
 * @author User
 */
public class AutorPrincipalServicio implements IAutorPrincipalServicio{

    private final List<AutorPrincipal> autorPrincipalList = new ArrayList<>();
    @Override
    public AutorPrincipal crear(AutorPrincipal autorPrincipal) {
        this.autorPrincipalList.add(autorPrincipal);
        return autorPrincipal; 
    }
    
@Override
    public AutorPrincipal modificar(int codigoAutor, AutorPrincipal autorNuevo) {
        var posicion=this.buscarPosicion(this.buscarPorCodigo(codigoAutor));
        this.listar().get(posicion).setNombre(autorNuevo.getNombre());
        this.listar().get(posicion).setYearNacimiento(autorNuevo.getYearNacimiento());
        this.listar().get(posicion).setCiudadania(autorNuevo.getCiudadania());
        return autorNuevo;
    }

    @Override
    public AutorPrincipal buscarPorCodigo(int codigoAutor) {
        AutorPrincipal autor=null;
        for(var a:this.autorPrincipalList){
            if(codigoAutor==a.getCodigoAutor()){
                autor=a;
                break;
            }
        }
        return autor;
    }

    @Override
    public int buscarPosicion(AutorPrincipal autor) {
        int posicion=-1;
        for(var a:this.autorPrincipalList){
            posicion++;
            if(a.getCodigoAutor()==autor.getCodigoAutor()){
                break;
            }
        }
        return posicion;
    }
    
    @Override
    public List<AutorPrincipal> listar() {
        return this.autorPrincipalList;
    }
  
}
