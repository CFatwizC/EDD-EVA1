/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva1_6_automovil;
public class auto {
    private String marca;
    private String modelo;
    private String placas;
    private int año;
    private String dueño;
    
    
    public auto(String marca, String modelo, String placas, int año, String dueño){
        this.marca=marca;
        this.modelo=modelo;
        this.placas=placas;
        this.año=año;
        this.dueño=dueño;
        
    }
    
    public void setMarca(String marca){
        this.marca=marca;
    }
    
    public String getMarca(){
        return marca;
    }
    
    public void setModelo(String modelo){
        this.modelo=modelo;
    }
    
    public String getModelo(){
        return modelo;
    }
    
    public void setPlacas(String placas){
        this.placas=placas;
    }
    
    public String getPlacas(){
                return placas;
    }
    
    public void setAño(int año){
        this.año=año;
    }
    
    public int getAño(){
        return año;
    }
    
    public void setDueño(String dueño){
        this.dueño=dueño;
    }
    
    public String getDueño(){
        return dueño;
    }
    
   
    
    public int adeudo(){
        int adeudo=0;
        if(año<=2000){
            adeudo=1500;
        }else if(año>2000 && año<=2005){
            adeudo=2000;
        }else if(año >2005 && año<=2010){
            adeudo=2500;
        }else if(año>2010 && año<=2015){
            adeudo=3000;
        }else if(año>2015){
            adeudo=3500;
        }
        return adeudo;
      
        
    }
    
   
    
    public void imprimirDatos(){
        System.out.println("La marca del coche es: " + marca);
        System.out.println("El modelo del coche es: " + modelo);
        System.out.println("Las placas del coche son: " + placas);
        System.out.println("El año del coche es: " + año);
        System.out.println("El dueño del auto se llama: " + dueño);
    }
}
