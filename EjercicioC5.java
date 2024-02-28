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
public class EjercicioC5 {
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Programa para calcular la potencia de un numero: ");
        int num, exponente, potencia;
        double potencianeg;
        System.out.println("Ingrese el numero base: ");
        num=sc.nextInt();
        System.out.println("Ingrese el exponente: ");
        exponente=sc.nextInt();
        
        potencia= (int) Math.pow(num, exponente);
        if(exponente>0){
            System.out.println("El resultado es: " + potencia);
        }
        else if(exponente==0){
            System.out.println("El resultado es: 1");
        }
        else if (exponente<0){
        potencianeg=1/Math.pow(num, Math.abs(exponente));
         System.out.println("El resultado es: " + potencianeg);
    }
    }
}
