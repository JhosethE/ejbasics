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
public class Ejercicios10 {
    public static void main(String [] args){
        double notap1, notap2, notap3, examf, trabf, prom3p, promtrabf, promexamf, notaf;
        Scanner sc= new Scanner (System.in);
        System.out.println("Nota primer parcial");
        notap1=sc.nextDouble();
        System.out.println("Nota segundo parcial");
        notap2=sc.nextDouble();
        System.out.println("Nota tercer parcial");
        notap3=sc.nextDouble();
        System.out.println("Nota trabajo final");
        trabf=sc.nextDouble();
        System.out.println("Nota examen final");
        examf=sc.nextDouble();
        
        prom3p= ((notap1+notap2+notap3)*0.55)/3;
        promtrabf= trabf*0.30;
        promexamf= examf*0.15;
        notaf=prom3p+promtrabf+promexamf;
        
        System.out.println("Su calificacion final en la materia de algoritmos es: " + notaf);     
    }
}
