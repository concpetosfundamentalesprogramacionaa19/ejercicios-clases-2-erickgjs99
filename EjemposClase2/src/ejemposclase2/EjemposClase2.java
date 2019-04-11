/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemposclase2;

import java.util.Scanner;

/**
 *
 * @author SALAS
 */
public class EjemposClase2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Este metodo es el princial de mi proyecto
        // No olvidar valores
        String nombre;
        String apellido;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Por favor ingresa tus nombres guap@");
        nombre = entrada.next();
        System.out.println("Por favor ingresa tus apellidos guap@");
        apellido = entrada.next();
        
        System.out.println("Su nombre es : "+nombre+"\n\n\t"+
                    "            Su apellido es: "+apellido);
    }
    
}
