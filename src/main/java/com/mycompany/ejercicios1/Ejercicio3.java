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
public class Ejercicio3 {
    public static void main(String []args){
         double ca, co,h; 
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese el cateto opuesto:");
        co=sc.nextDouble();
        System.out.println("Ingrese el cateto adyacente:");
        ca=sc.nextDouble();
        
        h=Math.pow(co,2)+ Math.pow(ca,2);
        System.out.println("La hipotenusa del triangulo es: " +Math.sqrt(h));
    }
}
