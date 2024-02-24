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
public class ejercicios16 {
    public static void main(String [] args){
       Scanner sc= new Scanner(System.in);
     double v1, v2, d, dV, tiempo;
 
    System.out.print("Introduce la distancia a la que se encuentran situados ambos vehiculos: ");
    d = sc.nextDouble();
    System.out.print("Velocidad en Km/h del vehiculo 1 (mas lento): ");
    v1 = sc.nextDouble();
    System.out.print("Velocidad en Km/h del vehiculo 2 (mas rápido): ");
    v2 = sc.nextDouble();   
     
    dV = v2 - v1;
    tiempo = d / (dV/60);     
  
    System.out.println("Ambos vehiculos coincidiran una vez transcurridos " + tiempo + " minutos.");
    }
}
