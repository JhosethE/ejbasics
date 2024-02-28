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
public class EjerciciosdeB2 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int numero = 0;
    int contador;
    int mayor = 0;
    int igual = 0;
    int menor = 0;

// Solicitud de datos al usuario
    System.out.println("El programa pide una cantidad de números indicada e indica cuantos son positivos, negativos o iguales a cero.");
    System.out.print("Introduce la cantidad de número que vamos a introducir: ");
    contador = scanner.nextInt();
    do {
      if (contador <= 0) {
        System.out.println("El número introducido debe ser un entero positivo. Por favor, introduce un nuevo valor.");
        contador = scanner.nextInt();
      }
    } while (contador <= 0);

    while (contador > 0){
      System.out.println("Introduce un número: ");
      numero = scanner.nextInt();
      contador = contador-1;
      if (numero > 0){
        mayor++;
      } else if (numero < 0){
        menor++;
      } else {
        igual++;
      }
    }    
    System.out.println("Has introducido todos los números:\n" + mayor + " son mayores a 0\n" + menor + " son menores a 0\n" + igual + " son iguales a 0.");
  }
}
