/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.eva1_12_calificacion;
import javax.swing.JOptionPane;
public class EVA1_12_CALIFICACION {

    public static void main(String[] args) {
        cali(Integer.parseInt(JOptionPane.showInputDialog("Ingrese su calificacion")));
        
    }
    
    public static int cali(int n){
        
        if(n>90 && n<=100){
            System.out.println("Su calificacion es: A");
        }else if(n>=81 && n<=91){
            System.out.println("Su calificacion es de: B");
        }else if(n>=71 && n<=80){
            System.out.println("Su califiacion es de: C");
        }else if(n<=70){
            System.out.println("Su calificacion es: D");
        }else{
            System.out.println("Por favor ingrese una calificacion correcta");
        }
        return n;
    }
}
