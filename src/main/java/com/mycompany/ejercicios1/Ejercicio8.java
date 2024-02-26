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
public class Ejercicio8 {
  public static void main(String [] args){
     Scanner sc = new Scanner (System.in);
      int sueldobase, comisiones, venta1, venta2, venta3, totalsueldo;
      
      System.out.println("Ingrese valor de sueldo base: ");
      sueldobase=sc.nextInt();
       System.out.println("Ingrese valor de venta 1: ");
      venta1=sc.nextInt();
       System.out.println("Ingrese valor de venta 2: ");
      venta2=sc.nextInt();
       System.out.println("Ingrese valor de venta 3: ");
      venta3=sc.nextInt();
      
      comisiones = (int) ((venta1+venta2+venta3)*0.10);
      totalsueldo = sueldobase+comisiones;
      
      System.out.println("Usted por comision de sus ventas recibira : $" + comisiones );
      System.out.println("Usted recibe un sueldo total en el mes de: $" + totalsueldo);     
    }  
}
