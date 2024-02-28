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
public class EjerciciossdeB10 {
    public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    int contador =0;
    String cadena;
    char caracter;
    int i;
    char c;

// Inicio del programa, explicación al usuario
    System.out.println("Introduce una cadena y un carácter, te mostraremos cuantas veces aparece en la misma.");
// Pedimos datos al usuario
      System.out.print("Introduce la cadena que desees: ");
      cadena = s.nextLine();
      System.out.print("Introduce el carácter que desees buscar: ");
      caracter = s.next().charAt(0);
// Recorremos la cadena y realizamos cálculos
      for (i = 0; i < cadena.length (); i+=1) { 
        c = cadena.charAt (i); 
        if (c == caracter){
          contador +=1;
        }
      }
// Mostramos resultado
      System.out.println("El carácter " +caracter+" aparece "+ contador + "veces.");
  }
}
