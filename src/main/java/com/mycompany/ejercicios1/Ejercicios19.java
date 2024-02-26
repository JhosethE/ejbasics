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
public class Ejercicios19 {
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
    System.out.println("Ingrese la cantidad de respuestas correctas:");
        int respuestasCorrectas = sc.nextInt();
        
        System.out.println("Ingrese la cantidad de respuestas incorrectas:");
        int respuestasIncorrectas = sc.nextInt();
        
        System.out.println("Ingrese la cantidad de respuestas no contestadas:");
        int respuestasNoContestadas = sc.nextInt();
        
        int notaFinal = respuestasCorrectas * 5 - respuestasIncorrectas;
        
        System.out.println("La nota final del estudiante es: " + notaFinal);
    }
}
