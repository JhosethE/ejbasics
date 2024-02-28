/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio2;
import java.util.Scanner;

/**
 *
 * @author L&J
 */
public class EjercicioC3 {
     public static void main (String [] args){
        
        double num1, num2, resultado;
        Scanner sc= new Scanner(System.in);
     System.out.println("El numero dividendo es: ");
     num1=sc.nextDouble();
     System.out.println("El numero divisor es: ");
     num2=sc.nextDouble();
     
     
     if(num2==0){
         System.out.println("ERROR: no se puede dividir entre 0");
     }
     else {
         resultado= num1/num2;
     System.out.println("El resultado de la division es: " + resultado);
     }  
        
    }
}
