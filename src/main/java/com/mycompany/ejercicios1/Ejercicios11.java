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
public class Ejercicios11 {
    public static void main (String [] args){
        double num1, num2, distancia;
        Scanner sc= new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        num1=sc.nextDouble();
        System.out.println("Ingrese el segundo numero");
        num2=sc.nextDouble();
        
        distancia=Math.abs(num1 - num2);
        System.out.println("La distancia entre ambos es: " + distancia);
        
    } 
}
