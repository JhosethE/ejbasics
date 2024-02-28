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
public class EjerciciosC12 {
   public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int duracion;
    String dia;
    String horario;
    double precio;
    double impuesto;

    // Solicitud de datos al usuario
    System.out.println("Calculamos el precio base de la llamada y el impuesto a pagar:");
    System.out.print("Duración de la llamada en minutos: ");
    duracion = scanner.nextInt();
    System.out.print("Día de la semana: ");
    dia = scanner.next(); scanner.nextLine();
    
    // Calculamos el precio base a pagar:
    if (duracion > 10){
        precio = 3;
    } else if (duracion > 8){
        precio = 2.5;
    } else if (duracion > 5){
        precio = 1.80;
    } else {
        precio = 1;
    }   
    
    // Preguntamos día y calculamos impuesto correspondiente.
    if (!dia.toUpperCase().equals("DOMINGO")) {
      System.out.print("¿La llamada se realizó en horario de mañana o tarde? ");
      horario = scanner.nextLine();
      if (horario.toUpperCase().equals("MAÑANA")) {
        impuesto = precio * 0.15;
      } else if (horario.toUpperCase().equals("TARDE")) {
        impuesto = precio * 0.10;
      // Si el horario es incorrecto se dará valor 0 al impuesto y el programa 
      // presentará error.
      } else {
        impuesto = 0; 
      }
    } else {
      impuesto = precio * 0.03;
    }
    
    // Mostramos resultado en pantalla, si horario incorrecto, mostrará error.
    if (impuesto == 0) {
      System.out.println("El horario introducido es incorrecto, reinicia el programa "
          + "e introduce los valores correctos.");
    } else {
      System.out.println("El precio total de la llamada es de " + (precio + impuesto) 
          + " siendo el precio base de " + precio + " y el impuesto a pagar " + impuesto);
    }
  } 
}
