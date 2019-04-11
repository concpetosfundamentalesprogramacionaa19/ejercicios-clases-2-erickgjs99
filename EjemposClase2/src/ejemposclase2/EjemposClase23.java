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
public class EjemposClase23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Este metodo es el princial de mi proyecto
        // No olvidar valores
        String nombre;
        String apellido;
        int edad;
        String ciudad;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Por favor ingresa tus nombres guap@");
        nombre = entrada.nextLine();
       
        System.out.println("Por favor ingresa tus apellidos guap@");
        apellido = entrada.nextLine();
      
        System.out.println("Por favor ingresa tu edad");
        edad = entrada.nextInt();
        entrada.nextLine(); //Limpieza del buffer de entrada de datos
        
        System.out.println("Por favor ingresa tu ciudad");
        ciudad = entrada.nextLine();
        
       /**
        System.out.println("Su nombre es : "+nombre+"\n\n\t"+
                    "            Sus apellidos es: "+apellido+", edad: "+edad+
        "\n"+"Ciudad: "+ciudad);
        */
        System.out.printf("Su nombre es %s\n\n\t "
                +"Su apellido es %s \n\n\t Su edad es %s \n\n\t Su ciudad es %s" 
                ,nombre,apellido,edad,ciudad);
    }
    
}
