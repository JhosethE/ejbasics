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
public class EjercicioC7 {
   public static void main(String [] args){
       int x1, y1, x2, y2, r1, r2, d, clasificacion;
       Scanner sc=new Scanner(System.in);
       System.out.println("Ingrese el valor de x en la primera circunferencia");
       x1=sc.nextInt();
       System.out.println("Ingrese el valor de y en la primera circunferencia");
       y1=sc.nextInt();
        System.out.println("Ingrese el valor de x en la segunda circunferencia");
       x2=sc.nextInt();
       System.out.println("Ingrese el valor de y en la segunda circunferencia");
       y2=sc.nextInt();
       System.out.println("Ingrese el radio de la primera circunferencia: ");
       r1=sc.nextInt();
       System.out.println("Ingrese el radio de la segunda circunferencia: ");
       r2=sc.nextInt();
       
       d=(int) Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
     if(d>(r1+r2)){
         System.out.println("Exteriores");
     }
     else if(d== (r1+r2)){
         System.out.println("Tangentes exteriores");
     }
     else if(d<(r1+r2) && d>Math.abs(r1-r2)){
         System.out.println("Secantes");
     }
     else if(d>0 && d<Math.abs(r1-r2)){
         System.out.println("Interiores");
     }
     else if(d==0){
         System.out.println("Concentricas");
     }
   } 
}
