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
public class EjerciciosC13 {
     public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int dado;

// Solicitud de datos al usuario
    System.out.println("El programa indica el número aparecido en el "
        + "lado opuesto al que sale en el dado:");
    System.out.print("Resultado de la cara obtenida: ");
    dado = scanner.nextInt();

// Realizamos comparaciones y mostramos el resultado
    switch (dado) {
    case 1:
      System.out.println("En la cara opuesta está el \"seis\".");
      break;
    case 2:
      System.out.println("En la cara opuesta está el \"cinco\".");
      break;
    case 3:
      System.out.println("En la cara opuesta está el \"cuatro\".");
      break;
    case 4:
      System.out.println("En la cara opuesta está el \"tres\".");
      break;
    case 5:
      System.out.println("En la cara opuesta está el \"dos\".");
      break;
    case 6:
      System.out.println("En la cara opuesta está el \"uno\".");
      break;
    default:
      System.out.println("ERROR: número incorrecto.");
    }
  }
}
