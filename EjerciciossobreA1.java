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
public class EjerciciossobreA1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];
        
        System.out.println("El programa pedirá 10 números y después serán impresos en orden inverso:");
        
        for (int i =0;i<10;i++) {
            System.out.print("Número "+(i+1)+": ");
            numeros[i] = scanner.nextInt();
        }        
        System.out.println("Valores introducidos en orden inverso");
        for (int i=9; i>=0;i--) {
            System.out.println("Numero " + (i+1)+": "+numeros[i]);            
        }
    }
}
