package eva1_20_static2;
public class EVA1_20_STATIC2 {
    public static void main(String[] args) {
        
        
        formulas formulasxd =new formulas();
        
        System.out.println("pi: " + formulas.PI);
        double triangulo = formulas.AT(5.0, 9.0);
        System.out.println("Area triangulo: " + triangulo);
        System.out.println("volumen esfera: " + formulas.VE(10.0));
    }
    
}
