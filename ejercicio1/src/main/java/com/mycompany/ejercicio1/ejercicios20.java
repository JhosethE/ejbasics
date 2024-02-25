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
public class ejercicios20 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        
        int mon2euros, mon1euro, mon50centimos, mon20centimos, mon10centimos, teuros, tcentimos, eurosextra ;
        System.out.println("Ingrese la cantidad de monedas de 2 euros:");
        mon2euros = sc.nextInt();
        
        System.out.println("Ingrese la cantidad de monedas de 1 euro:");
        mon1euro = sc.nextInt();
        
        System.out.println("Ingrese la cantidad de monedas de 50 centimos:");
       mon50centimos = sc.nextInt();
        
        System.out.println("Ingrese la cantidad de monedas de 20 centimos:");
        mon20centimos = sc.nextInt();
        
        System.out.println("Ingrese la cantidad de monedas de 10 centimos:");
        mon10centimos = sc.nextInt();

         teuros = mon2euros * 2 + mon1euro * 1;
        tcentimos = mon50centimos * 50 + mon20centimos * 20 + mon10centimos * 10;
        
        eurosextra = tcentimos / 100;
        tcentimos = tcentimos % 100;
        teuros += eurosextra;
        
        System.out.println("Usted tiene un total de " + teuros + " euros y " + tcentimos + " centimos.");
    
      System.out.println("Usted tiene un total de: " + teuros + " euros y un total de: " + tcentimos + " centimos ");
    
}
}
