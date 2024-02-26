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
public class Ejercicios17 {
      public static void main (String [] args){
          int hpartida, minpartida, segpartida, segTpartida, segTllegada, tviaje, hllegada, minllegada, segllegada;
     Scanner sc=new Scanner(System.in);
     System.out.println("INGRESE LA HORA DE PARTIDA EN FORMATO HH MM SS");
     hpartida=sc.nextInt();
     minpartida=sc.nextInt();  
     segpartida=sc.nextInt();
     System.out.println("TIEMPO DE VIAJE EN SEGUNDOS HASTA LA CIUDAD B: ");
     tviaje=sc.nextInt();
     
     segTpartida= (hpartida*3600) + (minpartida*60) + segpartida;
     segTllegada=segTpartida+tviaje;
     hllegada=segTllegada/3600;
     minllegada=(segTllegada%3600)/60;
     segllegada=segTllegada%60;
     
     
     System.out.println("LA HORA DE LLEGADA A LA CIUDAD B ES: " +hllegada + " horas " + minllegada + " minutos " + segllegada + " segundos ");
    }
}
