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
public class EjerciciosC14 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int dia;

// Solicitud de datos al usuario
    System.out.println("El programa te devuelve el día de la semana seleccionando:");
    System.out.println("1.- Lunes.");
    System.out.println("2.- Martes.");
    System.out.println("3.- Miércoles.");
    System.out.println("4.- Jueves.");
    System.out.println("5.- Viernes.");
    System.out.println("6.- Sábado.");
    System.out.println("7.- Domingo.");
    dia = scanner.nextInt();

// Realizamos comparaciones y mostramos el resultado
    switch (dia) {
    case 1:
      System.out.println("El día seleccionado es LUNES");
      break;
    case 2:
      System.out.println("El día seleccionado es MARTES");
      break;
    case 3:
      System.out.println("El día seleccionado es MIÉRCOLES");
      break;
    case 4:
      System.out.println("El día seleccionado es JUEVES");
      break;
    case 5:
      System.out.println("El día seleccionado es VIERNES");
      break;
    case 6:
      System.out.println("El día seleccionado es SÁBADO");
      break;
    case 7:
      System.out.println("El día seleccionado es DOMINGO");
      break;
    default:
      System.out.println("ERROR: número incorrecto.");
    }
  } 
}
