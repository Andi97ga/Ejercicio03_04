/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package servicio;

import java.util.List;
import modelo.AutorPrincipal;

/**
 *
 * @author User
 */
public interface IAutorPrincipalServicio {
    public AutorPrincipal crear(AutorPrincipal autorPrincipal);
    public AutorPrincipal modificar(int codigoAutor, AutorPrincipal autorNuevo);
    public AutorPrincipal buscarPorCodigo(int codigoAutor);
    public int buscarPosicion(AutorPrincipal autor);
    public List<AutorPrincipal> listar();
}
