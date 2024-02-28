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
public class EjerciciossobreA2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i;
        int[] numero = new int[10];
        int maximo = Integer.MIN_VALUE;
        int minimo = Integer.MAX_VALUE;
        
        System.out.println("Programa que pide 10 números y calcula el máximo y mínimo.");
        for (i=0;i<10;i++) {
            System.out.print("Introduce el número "+(i+1)+": ");
            numero[i] = scanner.nextInt();
            if (numero[i]<minimo) {
                minimo  = numero[i];
            }
            if (numero[i]>maximo) {
                maximo = numero[i];
            }
        }
        for (i=0; i<10;i++) {
            if (numero[i]==maximo) {
                System.out.println("Número "+ (i+1)+": "+numero[i] + " máximo.");
                }
            if (numero[i]== minimo) {
                System.out.println("Número "+ (i+1)+": "+numero[i] + " mínimo.");
            }
            if (numero[i] == maximo || numero[i] == minimo) {
            } else {
                System.out.println("Número "+ (i+1)+": "+numero[i]);
            }
        }
    }
}
