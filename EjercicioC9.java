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
public class EjercicioC9 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int year;

// Solicitud de datos al usuario
    System.out.println("Este programa calcula si un año es bisiesto:");
    System.out.print("Introduce el año: ");
    year = scanner.nextInt();
    
// Realizamos Cálculos y mostramos en pantalla
    if (year % 400 == 0){
        System.out.println("Es un año bisiesto.");
    }else if (year % 100 == 0){
        System.out.println("No es un año bisiesto");
    }else if (year % 4 == 0){
        System.out.println("Es un año bisiesto");
    }else{
        System.out.println("No es un año bisiesto");
    }
    }
}
