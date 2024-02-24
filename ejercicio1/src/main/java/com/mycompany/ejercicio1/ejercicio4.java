/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio1;
import java.util.Scanner;
/**
 *
 * @author L&J
 */
public class ejercicio4 {
   public static void main(String [] args){
        double x, y;
    
       Scanner sc= new Scanner(System.in);
       System.out.println("Ingrese el primer numero: ");
       x=sc.nextInt();
       System.out.println("Ingrese el segundo numero: ");
       y=sc.nextInt();
       
        int suma= (int) (x+y);
       int resta=(int) (x-y);
       int multiplicacion=(int) (x*y);
       double division=x/y;
       System.out.println("El resultado de la suma es: " + suma);
       System.out.println("El resultado de la resta es: " + resta);
       System.out.println("El resultado de la multiplicacion es: " + multiplicacion);
       System.out.println("El resultado de la division es: " + division);
       
   } 
}
