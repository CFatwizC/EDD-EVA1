package eva1_19_static;
public class EVA1_19_STATIC {
    public static void main(String[] args) {
        System.out.println("pi: " + Math.PI);
        System.out.println("Numero aleatorio: " + Math.random());
        Utilerias utilerias= new Utilerias();
        utilerias.saludo();
        Utilerias.saludoStatic();
        
        
        EVA1_19_STATIC objeto = new EVA1_19_STATIC();
        objeto.Saludo2();
    }
    
    public void Saludo2(){
        System.out.println("Hola");
    }
    
}

class Utilerias{
    
    
    public void saludo(){
        System.out.println("hello world");
    }
    
    
    public static void saludoStatic(){
        System.out.println("Hi");
}
}

class alch{
    
}
