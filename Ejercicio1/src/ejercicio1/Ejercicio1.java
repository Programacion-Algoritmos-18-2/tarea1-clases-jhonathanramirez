/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner entrada = new Scanner (System.in);
    Estudiantes e = new Estudiantes();
    System.out.println("Ingrese nombre del Estudiante");
    e.setNombres(entrada.nextLine());
    System.out.println("Ingrese apellido del Estudiante");
    e.setApellidos(entrada.nextLine());
    Estudiantes e2 = new Estudiantes();
    System.out.println("Ingrese nombre del Estudiante 2 ");
    e2.setNombres(entrada.nextLine());
    System.out.println("Ingrese apellido del Estudiante 2");
    e2.setApellidos(entrada.nextLine());
    System.out.print(e);
    System.out.print(e2);

    }
    
}
