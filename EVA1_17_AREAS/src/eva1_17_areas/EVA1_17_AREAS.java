/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_17_areas;
import javax.swing.JOptionPane;
public class EVA1_17_AREAS {
    public static void main(String[] args) {
        des(Integer.parseInt(JOptionPane.showInputDialog("Ingrese cuantos parametros tiene su formula")));
    }
    
    public static int des(int des){
        if(des==1){
            System.out.println("El area de su circulo es de: " + area(Double.parseDouble(JOptionPane.showInputDialog("Ingrese el radio de su circulo"))));
        }else if(des==2){
            System.out.println("El area de su triangulo es de: " + area(Double.parseDouble(JOptionPane.showInputDialog("Ingrese la base de su triangulo")), Double.parseDouble(JOptionPane.showInputDialog("Ingrese altura de su triangulo"))));
        }else if(des==3){
            System.out.println("El area de su trapecio es de: " + area(Double.parseDouble(JOptionPane.showInputDialog("Ingrese la Base mayor de su trapecio")), Double.parseDouble(JOptionPane.showInputDialog("Ingrese la base menor de su trapecio")), Double.parseDouble(JOptionPane.showInputDialog("Ingrese la altura del trapecio"))));
        }
        return des;
    }
    
    public static double area(double radio){
        return Math.PI*(radio*radio);
    }
    
    public static double area(double base, double altura){
    return (base*altura)/2;
}
    public static double area(double bama, double bame, double altura){
        return ((bama+bame)*altura)/2;
    }
}
