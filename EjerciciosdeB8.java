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
public class EjerciciosdeB8 {
     public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    int totalSegundos;
    int segundos;
    int minutos;
    int horas;
    int i;

// Inicio del programa, explicación al usuario
    System.out.println("Cuenta atrás de un tiempo indicado en segundos");
// Pedimos datos al usuario
    System.out.print("Indicanos el tiempo en segundos: ");
    totalSegundos = s.nextInt();
// Iniciamos el cilo para calcular el tiempo.   
    for (totalSegundos = totalSegundos; totalSegundos>0; totalSegundos-=1){
      try{
        Thread.sleep(1000);
      }catch(InterruptedException e ) {
        }
      horas = totalSegundos / 3600;
      minutos = totalSegundos / 60 - (horas*60);
      segundos = totalSegundos - (horas*3600) - (minutos*60);
      System.out.println("Quedan " + horas+" horas, "+minutos+" minutos y "+ segundos +" segundos.");
    } 
  }
}
