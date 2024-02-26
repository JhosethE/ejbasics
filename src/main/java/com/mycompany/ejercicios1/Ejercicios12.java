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
public class Ejercicios12 {
    public static void main(String [] args){
        double x1, y1, x2, y2, distancia;
        Scanner sc= new Scanner (System.in);
        System.out.println("Ingrese la coordenada x del primer punto: ");
        x1=sc.nextDouble();
         System.out.println("Ingrese la coordenada y del primer punto: ");
        y1=sc.nextDouble();
        System.out.println("Ingrese la coordenada x del segundo punto: ");
        x2=sc.nextDouble();
         System.out.println("Ingrese la coordenada y del segundo punto: ");
        y2=sc.nextDouble();
        
        distancia=Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
        System.out.println("La distancia entre ambos es: " + Math.round(distancia * 100.0) / 100.0  );
    }
}
