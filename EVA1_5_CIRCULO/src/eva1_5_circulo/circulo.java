/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva1_5_circulo;

public class circulo {
    private double radio;
    private double resulp;
    private double area;
    
    
    public void setRadio(double radio){
        
        this.radio=radio;
    }
    
    public double getRadio(){
        return radio;
    }
    
    public void setResulp(double resulp){
        this.resulp=resulp;
    }
    
    public double getResulp(){
        return resulp;
    }
    
    public void setArea(double area){
        this.area=area;
    }
    
    public double getArea(){
        return area;
    }
    
    public void mostrarDatos(){
        System.out.println("El area del circulo es: " + area);
        System.out.println("El perimetro del circulo es: " + resulp);
}
}
