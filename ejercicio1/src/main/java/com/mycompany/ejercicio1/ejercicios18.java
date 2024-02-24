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
public class ejercicios18 {
    public static void main(String [] args){
           String nombre, apellido1, apellido2, iniciales;
        
        Scanner sc=new Scanner(System.in);
        System.out.println("NOMBRE: ");
        nombre=sc.nextLine();
        System.out.println("PRIMER APELLIDO: ");
        apellido1=sc.nextLine();
        System.out.println("SEGUNDO APELLIDO: ");
        apellido2=sc.nextLine();
        
       iniciales=nombre.substring(0,1) + apellido1.substring(0, 1) + apellido2.substring(0,1);
       System.out.println("LAS INICIALES SON: " +iniciales);
    }
}
