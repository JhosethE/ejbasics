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
public class ejercicio5 {
    public static void main(String [] args){
         double f, c;
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese la temperatura en grados Fahrenheit");
        f=sc.nextDouble();
        
        c=(f-32)*0.5556;
        System.out.println(+f+ " grados Fahrenheit equivale a " + c + " grados Celcius" );
    }
}
