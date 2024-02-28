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
public class EjercicioC2 {
    public static void main(String[] args){
        
      Scanner sc = new Scanner(System.in);
        
        int num, par, impar;
        System.out.println("Ingrese un numero: ");
        num=sc.nextInt();
        
       if(num%2==0){
           System.out.println("Es par");
       }
       else{
           System.out.println("Es impar");
       }
        
    } 
}
