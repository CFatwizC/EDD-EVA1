package eva1_20_static2;
public class formulas {
    
    public static final double PI = 3.1416;
    public static double AT(double base, double altura){
        return (1.0/2.0)*base*altura;
    }
    
    public static double AC(double radio){
        return radio*radio*PI;
    }
    
    
    
    public static double PC(double radio){
        return 2*radio*PI;
    }
    
    
    public static double VE(double radio){
        return (4.0/3.0)*PI*radio*radio*radio;
    }
}
