/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_3_constructore;

public class EVA1_3_CONSTRUCTORE {

    
    public static void main(String[] args) {
        cuentaBancaria cuenta1= new cuentaBancaria("Derek franco", 5000, "22550349", 5);
        
        String nombre = cuenta1.getCliente();
        
        System.out.println("Datos del cliente");
        System.out.println(nombre);
        System.out.println(cuenta1.getNumCuenta());
        System.out.println(cuenta1.getSaldo());
        System.out.println(cuenta1.getEstupid());
        
        
        cuentaBancaria cuenta2=new cuentaBancaria("Marisol Gonzalez", 300000, "27368", 6);
        String nombre2 = cuenta2.getCliente();
        System.out.println("Datos del cliente");
        System.out.println(nombre2);
        System.out.println(cuenta2.getNumCuenta());
        System.out.println(cuenta2.getSaldo());
        System.out.println(cuenta1.getEstupid());
        
        
    }
    
}
