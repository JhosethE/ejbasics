/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio1;
import java.util.Scanner;
/**
 *
 * @author L&J
 */
public class ejercicios15 {
 public static void main (String [] args){
     int a, b, c, resultado;
     Scanner sc=new Scanner(System.in);
     System.out.println("INGRESE EL VALOR DE A: ");
     a=sc.nextInt();
     System.out.println("INGRESE EL VALOR DE B");
     b=sc.nextInt();
     
    c=a;
    a=b;
    b=c;
     
    System.out.println("VALORES INTERCAMBIADOS:");
    System.out.println("A = " + a);
    System.out.println("B = " + b);
 }   
}
 