/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.eva1_8_llamar_funcion;

/**
 *
 * @author Derek Franco
 */
public class EVA1_8_LLAMAR_FUNCION {

    public static void main(String[] args) {
        System.out.println("Iniciamos el main");
        A();
        System.out.println("Terminamos el main");
    }
    
    public static void A(){
        System.out.println("Iniciamos A()");
        B();
        System.out.println("Finalizamos A()");
    }
    public static void B(){
        System.out.println("Iniciamos B()");
        System.out.println("Finalizamos B()");
    }
}
