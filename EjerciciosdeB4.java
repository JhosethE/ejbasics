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
public class EjerciciosdeB4 {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int numero1;
    int numero2;
    int minimo;
    int maximo;

    // Solicitud de datos al usuario
    System.out.println("El programa imprimirá todos los números pares entre dos números indicados.");
    System.out.print("Introduce el primer número: ");
    numero1 = scanner.nextInt();
    System.out.print("Introduce el segundo número: ");
    numero2 = scanner.nextInt();
    
    // Ordenamos los valores en mayor y menor
    if (numero1 < numero2) {
      minimo = numero1;
      maximo = numero2;
    } else {
      minimo = numero2;
      maximo = numero1;
    }
    // Realización del ciclo para hacer cálculos y mostrar en pantalla
    for (int i=minimo+1; i < maximo; i++){
      if (i%2==0){
        System.out.println(i); 
      }
    }
  }
}
