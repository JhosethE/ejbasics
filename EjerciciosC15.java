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
public class EjerciciosC15 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int mes;

// Solicitud de datos al usuario
    System.out.println("El programa te devuelve el número de días del mes seleccionando:");
    System.out.println(" 1.- Enero.");
    System.out.println(" 2.- Febreo.");
    System.out.println(" 3.- Marzo.");
    System.out.println(" 4.- Abril.");
    System.out.println(" 5.- Mayo.");
    System.out.println(" 6.- Junio.");
    System.out.println(" 7.- Julio.");
    System.out.println(" 8.- Agosto.");
    System.out.println(" 9.- Septiembre.");
    System.out.println("10.- Octubre.");
    System.out.println("11.- Noviembre.");
    System.out.println("12.- Diciembre.");
    mes = scanner.nextInt();

// Realizamos comparaciones y mostramos el resultado
    if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12){
      System.out.println("El mes seleccionado tiene 31 días");
    } else if (mes ==2){
      System.out.println("Febrero tiene 28 días");
    } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11){
      System.out.println("El mes seleccionado tiene 30 días");
    } else {
      System.out.println("Error, el mes debe estar entre 1-12.");
    } 
  }
}
