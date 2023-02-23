/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.eva1_10_parametros;

public class EVA1_10_PARAMETROS {

    public static void imprimir(String message, int n){
        for(int i=0; i<n; i++){
            System.out.println(message);
        }
    }
    
    
    public static void main(String[] args) {
        imprimir("Hola jaja he venido de vuelta a liarla", 10);
    }
}
