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
public class Ejercicio6 {
     public static void main(String [] args){
        double n1, n2, n3, media;
       
       Scanner sc= new Scanner(System.in);
       System.out.println("Ingrese el primer numero");
       n1=sc.nextDouble();
       System.out.println("Ingrese el segundo numero");
       n2=sc.nextDouble();
       System.out.println("Ingrese el tercer numero");
       n3=sc.nextDouble();
       
       media=(n1+n2+n3)/3;
       System.out.println("La media de los numeros ingresados es: " + media );
   }
}
