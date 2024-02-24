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
public class ejercicio9 {
    public static void main (String [] args){
       double totalCompra, descuento, precioFinal;
         Scanner  sc= new Scanner(System.in);
         System.out.println("Ingrese el valor total de su compra: ");
         
         totalCompra=sc.nextDouble();
         descuento=totalCompra*0.15;
         precioFinal= totalCompra-descuento;
         
        System.out.println("Con el descuento del 15% usted debera pagar " + precioFinal);
        
    }
}
