/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Estudiantes {

    private String nombres;
    private String apellidos;
   
    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

 


    
    @Override
    public String toString(){
        String cadena = String.format("Nombre:%s"+"\tApelldio:%s\n", getNombres(), getApellidos());
        return cadena;

}
}
