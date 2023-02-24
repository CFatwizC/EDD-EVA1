/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_18_sobrecarga_rfc;

/**
 *
 * @author Derek Franco
 */
public class EVA_18_SOBRECARGA_RFC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(generarRfc("Derek ", "Franco", "Martínez", 2003, 12 , 9));
    }
    
    public static String generarRfc(String nombre, String apellidoP, String apellidoM, int año, int mes, int dia){
        String dplap = apellidoP.charAt(0) + "";
        String dplap1 = apellidoP.charAt(2) + "";
        String dplam = apellidoM.charAt(0) + "";
        String dplam1 = apellidoM.charAt(1) + "0";
        String pln = nombre.charAt(0) +  "";
        
        String rfc= dplap + dplap1 + dplam  + pln  + año + mes + dia + "V15";
        return rfc;
    }
    
}
