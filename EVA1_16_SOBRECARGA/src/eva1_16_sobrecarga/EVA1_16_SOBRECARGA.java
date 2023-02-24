package eva1_16_sobrecarga;
public class EVA1_16_SOBRECARGA {
     
    public static void main(String[] args) {
        System.out.println("suma= " + sumar(4,5));
        System.out.println("Suma= " + sumar(15.5,43.2));
        System.out.println("Suma= " + sumar("<","3"));
        sumar();
    }
                  
    public static int sumar(int n, int r){
        return n + r;
    }
    
       //suma double double
    public static double sumar(double n, double r){
        return n + r;
    }
    
    
    
    public static String sumar(String n, String r){
        return n + r;
    }
    
    
    public static void sumar(){
        System.out.println("La vida es como las lentejas, o la tomas o la dejas");
    }
    
}
