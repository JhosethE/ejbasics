/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicios1;
import java.util.Scanner;
/**
 *
 * @author L&J
 */
public class Ejercicio7 {
    public static void main(String [] args){
         
       int min, horas, minequiv;
       Scanner  sc= new Scanner(System.in);
       System.out.println("Ingrese la cantidad de minutos:");
       
       min= sc.nextInt();
       horas=min/60;
       minequiv= min % 60;
       System.out.println("EN HORAS : " + horas);
        System.out.println("EN MINUTOS : " + minequiv); 
   } 
}
