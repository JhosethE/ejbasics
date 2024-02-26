/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicios1;
import java.util.Scanner;
/**
 *
 * @author L&J
 */
public class Ejercicios14 {
 public static void main(String [] args){
     int num, invertido, resultado;
     Scanner sc= new Scanner(System.in);
     System.out.println("Ingrese un numero de dos cifras: ");
     num=sc.nextInt();
     
     if(num >=10 && num <=99){
         invertido=((num%10) *10 ) +num/10;
         resultado=invertido;
         System.out.println("El numero invertido es: " + invertido);
     }
     else {
         System.out.println("No es un numero de dos cifras");
     }
 }     
}
