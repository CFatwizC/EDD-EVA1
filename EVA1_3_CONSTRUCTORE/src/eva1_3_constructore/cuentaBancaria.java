/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva1_3_constructore;

/**
 *
 * @author Derek Franco
 */
public class cuentaBancaria {
    private String numCuenta;
    private double saldo;
    private String cliente;
    private int estupid;
    public cuentaBancaria(){
        numCuenta= "0";
        saldo= 0;
        cliente= "";
        estupid=0;
    }
    
    public cuentaBancaria (String datosCuenta, double datosSaldo, String datosCliente, int datosEstupid){
        numCuenta= datosCuenta;
        saldo=datosSaldo;
        cliente=datosCliente;
        estupid=datosEstupid;
    }
    
    public void  setNumCuenta(String dato){
        numCuenta=dato;
    }
    
    public String getNumCuenta(){
    return numCuenta;
    }
    
    public void setSaldo(double dato){
        saldo=dato;
    }
    
    public double getSaldo(){
        return saldo;
    }
    
    public void setCliente(String dato){
        cliente=dato;
    }
    
    public String getCliente(){
        return cliente;
    }
        
    public void setEstupid(int datos){
        estupid=datos;
    }
    
    public int getEstupid(){
        return estupid;
    }
}
