package eva1_21_static3;
public class EVA1_21STATIC3 {
    public static void main(String[] args) {
        System.out.println(p.v);
        p.v++;
        System.out.println(p.v);
        
        System.out.println("objects");
        PO o = new PO();
        System.out.println(o.v);
        o.v++;
        System.out.println(o.v);
        
        
        PO o2 = new PO();
    }
    
}

class p{
    public static int v = 10;
}

class PO{
    public int v = 15;
}