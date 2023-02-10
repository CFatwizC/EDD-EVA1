/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva1_2_clases_java;

/**
 *
 * @author Derek Franco
 */
public class Persona {
    // atributos de la clase
    private String nombre;
    private String apellido;
    private int edad;
    private boolean e_civil;
    
    
    public void setNombre(String dato){
nombre = dato;
}
    public  String getNombre(){
          return nombre;
      }
    
     public void setApellido(String dato){
     apellido = dato;
 } 
    
    public String getApellido(){
        return apellido;
    }
    
    public void setEdad(int dato){
     edad = dato;
 }
    
   public int getEdad(){
       return edad;
   }
   
   public void setE_civil(boolean dato){
       e_civil = dato;
   }
   
   public boolean getE_civil(){
   return e_civil;
      }
   
   
   
public void imprimirDatos(){
    System.out.println("");
    System.out.println("Datos almacenados");
    System.out.println("Nombre completo: " + nombre + apellido);
    System.out.println("Edad: " + edad);
    if (e_civil==true){
        System.out.println("Ta casao");
    }else{
        System.out.println("No esta casao");
    }
}
 
 
 
}

