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
public class EjercicioC6 {
     public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int nota;
    int edad;
    String sexo;

    System.out.print("Edad: ");
    edad = sc.nextInt();
    System.out.print("Nota: ");
    nota = sc.nextInt(); sc.nextLine();
    System.out.print("Sexo (M o F): ");
    sexo = sc.nextLine();
    
    if (!sexo.toUpperCase().equals("M") && !sexo.toUpperCase().equals("F")) {
      System.out.println("El valor de sexo introducido es incorrecto.\n"
          + "por favor, reenvíe el formulario.");
    } else if ((nota > 5) && (edad > 18) && (sexo.toUpperCase().equals("M"))) {
      System.out.println("POSIBLE");
    }else if ((nota > 5) && (edad > 18) && (sexo.toUpperCase().equals("F"))) {
       System.out.println("ACEPTADA");
    }else {
        System.out.println("NO ACEPTADA");
    }
}
}