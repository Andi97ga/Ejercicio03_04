/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.List;
import modelo.AutorPrincipal;
import servicio.AutorPrincipalServicio;

/**
 *
 * @author User
 */
public class APrincipalControl {
    private final AutorPrincipalServicio autorPrincipalServicio = new AutorPrincipalServicio();
    
    public AutorPrincipal crear(String [] args){
        var autorPricipal = new AutorPrincipal(Integer.valueOf(args[0]),args[1],
                Integer.valueOf(args[1]),args[2]);
        this.autorPrincipalServicio.crear(autorPricipal);
        return autorPricipal;
    }
    
    public List<AutorPrincipal> listar(){
        return this.autorPrincipalServicio.listar();
    }
}
