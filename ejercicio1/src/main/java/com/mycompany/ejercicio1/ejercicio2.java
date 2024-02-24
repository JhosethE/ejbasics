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
public class ejercicio2 {
    
    public static void main(String[] args) {
        
    double b, h, perimetro, area;
    Scanner sc=new Scanner(System.in);
    System.out.println("Ingrese la base del rectangulo:");
    b=sc.nextInt();
    System.out.println("Ingrese la altura del rectangulo:");
    h=sc.nextInt();
    perimetro=(b+h)*2;
    System.out.println("El perimetro del rectangulo es: " +perimetro);
    area=b*h;
    System.out.println("El area del rectangulo es: " +area);
}
}