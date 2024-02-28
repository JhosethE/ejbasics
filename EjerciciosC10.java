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
public class EjerciciosC10 {
     public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int kilos;
    double precioInicial;
    String tipo;
    int tamano;

// Solicitud de datos al usuario
    System.out.println("Este programa calcula la ganancia según el tipo de vino, tamaño y cantidad vendida:");
    System.out.print("Introduce los Kg. de uva entregada: ");
    kilos = scanner.nextInt();
    System.out.print("Precio por Kg. inicial: ");
    precioInicial = scanner.nextDouble();
    System.out.print("Uva de valor \"A\" ó \"B\": ");
    tipo = scanner.next(); scanner.nextLine();
    System.out.print("Tipo de uva \"1\" ó \"2\": ");
    tamano = scanner.nextInt();

// Realizamos Cálculos y mostramos en pantalla
    if (!((tipo.toUpperCase().equals("A") || tipo.toUpperCase().equals("B")) &&
        (tamano == 1 || tamano == 2))) {
      System.out.println("Tipo o tamaño incorrecto, vuelva a introducir los valores.");
    } else {
      if (tipo.toUpperCase().equals("A") && tamano == 1) {
        System.out.println("La ganancia final es de: " + ((kilos * precioInicial)+(kilos*0.20)));
      } else if (tipo.toUpperCase().equals("A") && tamano == 2) {
        System.out.println("La ganancia final es de: " + ((kilos*precioInicial)+(kilos*0.30)));
      } else if (tipo.toUpperCase().equals("B") && tamano == 1) {
        System.out.println("La ganancia final es de: " + ((kilos * precioInicial)-(kilos*0.30)));
      } else if (tipo.toUpperCase().equals("B") && tamano == 2) {
        System.out.println("La ganancia final es de: " + ((kilos*precioInicial)-(kilos*0.50)));
      }
    }
  }
}
