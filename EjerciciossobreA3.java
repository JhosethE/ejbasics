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
public class EjerciciossobreA3 {
    public static void main(String[] args) {
        //Definimos las variables a utilizar en el programa
        Scanner scanner = new Scanner(System.in);
        int[][] numeros = new int[4][5];
        int[] sumaFila = new int[4];
        int [] sumaColumna = new int[6];
        
        // Información al usuario y petición de datos
        System.out.println("Incluye 20 números, repartidos en cuatro filas y cinco columnas.");
        for (int i=0; i < 4; i++) {
          for (int j= 0; j< 5; j++) {
            System.out.println("Introduce el número de la fila " + (i+1) + " y la columna " + (j+1) + ": ");
            numeros[i][j] = scanner.nextInt();
            sumaColumna[5] += numeros[i][j]; // Esta suma el total.
            sumaFila[i]+= numeros[i][j];
            sumaColumna[j] += numeros[i][j];
          }
        }
        System.out.printf("%12s %10s %10s %10s %10s %10s %10s", "", "Columna 1", "Columna 2", "Columna 3", "Columna 4", "Columna 5", "Suma Fila");
        System.out.println("");
        for (int i =0; i<5; i++) { // esto leería las filas
          if (i==4) {
          System.out.printf("%12s", "Suma Columna");
          }else {
            System.out.printf("%12s", "Fila "+(i+1));
          }
          for (int j=0; j<6; j++) {
            if (i == 4) {
              System.out.printf("%11d", sumaColumna[j]);
            } else if (j == 5){
              System.out.printf("%11d", sumaFila[i]);
            } else {
              System.out.printf("%11d", numeros[i][j]);
            }
          }
          System.out.println("");
        }
    }
}
