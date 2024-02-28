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
public class EjerciciosdeB5 {
   public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int inferior;
    int superior;
    int numero;
    int suma = 0;
    int contador = 0;
    boolean esLimite = false;

    // Inicio del programa, explicación al usuario
    System.out.println("El programa solicitará un límite inferior y superior de intervalo.");
    System.out.println("Después pedirá la introducción de números a analizar, para finalizar "
        + "de introducir números, pulsa 0");
    System.out.println("Mostrará la siguiente información: ");
    System.out.println("Suma de los números que están dentro del intervalo");
    System.out.println("Cuantos números están fuera del intervalo");
    System.out.println("Si se ha introducido alguno de los números que marcan los límites "
        + "de los intervalos");
    // Pedimos límites al usuario
    do {
      System.out.print("Introduce el límite inferior: ");
      inferior = scanner.nextInt();
      System.out.print("Introduce el límite superior: ");
      superior = scanner.nextInt();
      if (inferior > superior) {
        System.out.println("Error, el límite inferior debe ser que el superior. "
            + "Revisa los valores introducidos.");
      }
    } while (inferior > superior);
    
    // Pedimos al usuario insertar números
    do {
      System.out.println("Introduce un número: ");
      numero = scanner.nextInt();
      
      if (numero != 0) {
        if (numero > inferior && numero < superior) {
          suma += numero;
        } else if (numero <= inferior || numero >= superior) {
          contador++;
        }
        if (numero == inferior || numero == superior) {
          esLimite = true;
        }
      } 
    } while (numero != 0);
    
    // Al introducir 0, mostramos resultados
    System.out.println("El valor de la suma de los números introducidos en el rango " + inferior +"-" +superior +" es de " +suma);
    System.out.println("Se han introducido un total de " + contador + " números fuera del intervalo " + inferior+"-"+superior);
    if (esLimite){
      System.out.println("Alguno de los valores introducidos ha coincidido con alguno de los límites del intervalo");
    } else {
      System.out.println("No se ha introducido ningún valor igual a los límites del intervalo");
    }
  } 
}
