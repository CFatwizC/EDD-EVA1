/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_2_clases_java;

/**
 *
 * @author Derek Franco
 */
public class EVA1_2_CLASES_JAVA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //CLASE ES LA RECETA
        //OBJETO ES EL PLATILLO
        //INSTANCIACIÒN:
        //1. Declarar el identificador para el objeto
        //2. Asignar memoria con new
        //3. Invocar el constructor
        //Nombre clase
        //Persona = constructor de la clase
        //Constructor: Method
        Persona perso1=new Persona(); //Tendremos que asignarle memoria con la palabra "new" y nombre de la clase
       //System.out.println(perso1);
      /* 
       //Esta seccion es porque iniciamos con los atributos con modificador default
       
       perso1.nombre="Derek";
       perso1.apellido="Franco";
       perso1.edad=19;
       perso1.e_civil= true; //true es casado
       
        System.out.println(perso1.nombre);
*/
      //METODOS: COMPORTAMIENTO
      //Metodos fet --> leer, metodo set--> escribir
      //metodos:
      //modificador valor de retorno nombre (argumentos){ implementaicion
      //}
      
      perso1.setNombre("Derek");
      perso1.setApellido("Franco");
      perso1.setEdad(19);
      perso1.setE_civil(true);
      perso1.imprimirDatos();
      
      Persona perso2=new Persona();
      perso2.setNombre("Daniel");
      perso2.setApellido("Franco");
      perso2.setEdad(45);
      perso2.setE_civil(true);
      perso2.imprimirDatos();
    }
    
}
