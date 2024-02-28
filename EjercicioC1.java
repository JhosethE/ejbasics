/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio2;
import java.util.Scanner;
/**
 *
 * @author L&J
 */
public class EjercicioC1 {

    public static void main(String[] args){
  int num1, num2;
  
  Scanner sc= new Scanner(System.in);
  System.out.println("Ingrese el primer numero: ");
  num1=sc.nextInt();
  System.out.println("Ingrese el segundo numero: ");
  num2=sc.nextInt();
      

    if(num1>num2){
        
                System.out.println("El numero 1 es mayor");
    
 }  else if (num1<num2){
    System.out.println("El numero 2 es mayor");
    
 } 
else if (num1==num2){
       System.out.println("Ambos numeros son iguales");
   } 
    
    

   }
}
