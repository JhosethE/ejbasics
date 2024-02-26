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
public class Ejercicios13 {
    public static void main(String [] args){
        
       double num, raiz2, raiz3;
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        num=sc.nextDouble();
        
        raiz2=Math.sqrt(num);
        raiz3=Math.cbrt(num);
        
        System.out.println("La raiz cuadrada del numero es: " + raiz2);
        System.out.println("La raiz cubica del numero es: " + Math.round(raiz3*100.0) /100.0);
    }
}
