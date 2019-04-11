/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioClase;

import java.util.Scanner;

/**
 *
 * @author SALAS
 */
public class miEjercicio {
    public static void main(String[] args) {
        String nombre;
        String apellido;
        int edad;
        String ciudad;
        String pais;
        int nota1;
        int nota2;
        int prom;
        double totalprom;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Por favor ingresa los nombres");
        nombre = entrada.nextLine();
       
        System.out.println("Por favor ingresa los apellidos");
        apellido = entrada.nextLine();
      
        System.out.println("Por favor ingresa su edad");
        edad = entrada.nextInt();
        entrada.nextLine();
        
        System.out.println("Por favor ingresa la ciudad");
        ciudad = entrada.nextLine();
        
        System.out.println("Por favor ingresa su pais");
        pais = entrada.nextLine();
        
        System.out.println("Ingresa la primera nota");
        nota1 = entrada.nextInt();
        
        System.out.println("Ingresa la segunda nota");
        nota2 = entrada.nextInt();
        
        prom = nota1 + nota2;
        totalprom = prom /2;
        
         System.out.printf("Su nombre es %s\n\n\t "
                +"Su apellido es %s \n\n\t Su edad es %s \n\n\t Su ciudad es %s"
                 +" \n\n\t Su pais es %s"+" \n\n\t Sus notas son %s, %s"+
                 " \n\n\tSu promedio total es de %s\n"
                ,nombre,apellido,edad,ciudad,pais,nota1,nota2,totalprom);
}}
